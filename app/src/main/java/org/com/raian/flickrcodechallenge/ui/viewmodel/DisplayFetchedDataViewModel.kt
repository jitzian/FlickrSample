package org.com.raian.flickrcodechallenge.ui.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.*
import org.com.raian.flickrcodechallenge.constans.GlobalConstants.Companion.flickrKey
import org.com.raian.flickrcodechallenge.constans.GlobalConstants.Companion.formatValue
import org.com.raian.flickrcodechallenge.constans.GlobalConstants.Companion.methodValue
import org.com.raian.flickrcodechallenge.constans.GlobalConstants.Companion.noJsonCallbackValue
import org.com.raian.flickrcodechallenge.constans.GlobalConstants.Companion.safeSearchValue
import org.com.raian.flickrcodechallenge.constans.database.FlickerDataBase
import org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass
import org.com.raian.flickrcodechallenge.dependency.injection.components.DaggerComponentInjector
import org.com.raian.flickrcodechallenge.dependency.injection.modules.NetworkModule
import org.com.raian.flickrcodechallenge.rest.RestApi
import org.com.raian.flickrcodechallenge.rest.model.FlickrResultApi
import org.com.raian.flickrcodechallenge.util.safeLet
import retrofit2.Response
import retrofit2.Retrofit
import java.util.logging.Logger
import javax.inject.Inject

class DisplayFetchedDataViewModel(private val db: FlickerDataBase, private val context: Context) : BaseViewModel() {

    private val listOfDataForUI by lazy {
        MutableLiveData<List<FlickerDataClass>>()
    }

    @Inject
    lateinit var retrofit: Retrofit
    private val injector = DaggerComponentInjector
        .builder()
        .networkModule(NetworkModule())
        .build()
    private lateinit var restApi: RestApi

    init {
        TAG = DisplayFetchedDataViewModel::class.java.simpleName
        logger = Logger.getLogger(TAG)
        inject()
    }

    private fun inject() {
        injector.inject(this)
        restApi = retrofit.create(RestApi::class.java)
    }

    fun prepareRemoteData(query: String) = GlobalScope.launch(Dispatchers.IO) {
        val queryMap = mutableMapOf(
            "method" to methodValue,
            "api_key" to flickrKey,
            " format" to formatValue,
            "nojsoncallback" to noJsonCallbackValue,
            "safe_search" to safeSearchValue,
            "text" to query
        )

        val deferredDataFetchedResult = async {
            restApi.fetRemoteData(queryMap).execute()
        }

        safeLet(deferredDataFetchedResult.await()) { it ->
            insertDataIntoDb(it)
        }
    }

    private fun insertDataIntoDb(response: Response<FlickrResultApi>) = GlobalScope.launch {
        withContext(Dispatchers.IO) {
            response.body()?.photos?.photo?.let {
                for (i in it) {
                    with(i) {
                        val innerFlickerDataClass = FlickerDataClass(
                            id?.toLong(),
                            owner,
                            secret,
                            server,
                            farm,
                            title,
                            ispublic.toString(),
                            isfriend,
                            isfamily
                        )
                        db.flickerDao().insert(innerFlickerDataClass)
                    }
                }
            }
            listOfDataForUI.postValue(db.flickerDao().getAll())
        }
    }

    fun getListOfDataForUI(): LiveData<List<FlickerDataClass>> {
        return listOfDataForUI
    }

}