package org.com.raian.flickrcodechallenge.ui.viewmodel

import android.content.Context
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import org.com.raian.flickrcodechallenge.constans.GlobalConstants.Companion.flickrKey
import org.com.raian.flickrcodechallenge.constans.GlobalConstants.Companion.formatValue
import org.com.raian.flickrcodechallenge.constans.GlobalConstants.Companion.methodValue
import org.com.raian.flickrcodechallenge.constans.GlobalConstants.Companion.noJsonCallbackValue
import org.com.raian.flickrcodechallenge.constans.GlobalConstants.Companion.safeSearchValue
import org.com.raian.flickrcodechallenge.constans.database.FlickerDataBase
import org.com.raian.flickrcodechallenge.dependency.injection.components.DaggerComponentInjector
import org.com.raian.flickrcodechallenge.dependency.injection.modules.NetworkModule
import org.com.raian.flickrcodechallenge.rest.RestApi
import org.com.raian.flickrcodechallenge.rest.model.FlickrResultApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import java.util.logging.Logger
import javax.inject.Inject

class DisplayFetchedDataViewModel(private val db: FlickerDataBase, private val context: Context) : BaseViewModel() {
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

    fun fetchRemoteData(query: String) = GlobalScope.launch {
        val queryMap = mutableMapOf(
            "method" to methodValue,
            "api_key" to flickrKey,
            " format" to formatValue,
            "nojsoncallback" to noJsonCallbackValue,
            "safe_search" to safeSearchValue,
            "text" to query
        )

        val deferredFetchedResult = async {
            restApi.fetRemoteData(queryMap).enqueue(object : Callback<FlickrResultApi> {
                override fun onFailure(call: Call<FlickrResultApi>, t: Throwable) {
                    logger.severe("$TAG::fetchRemoteData::onFailure::${t.message}::${t.cause}")
                }

                override fun onResponse(call: Call<FlickrResultApi>, response: Response<FlickrResultApi>) {
                    logger.severe("$TAG::fetchRemoteData::onResponse::${response.body()}")
                }
            })
        }

        deferredFetchedResult.await()
    }

}