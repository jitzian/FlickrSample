package org.com.raian.flickrcodechallenge.ui.activities

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import org.com.raian.flickrcodechallenge.ui.viewmodel.DisplayFetchedDataViewModel
import org.com.raian.flickrcodechallenge.ui.viewmodel.FactoryViewModel
import java.util.logging.Logger

abstract class BaseActivity : AppCompatActivity(){
    internal lateinit var TAG: String
    internal lateinit var logger: Logger

    internal val displayFetchedDataViewModel by lazy {
        ViewModelProviders.of(this, FactoryViewModel(this)).get(DisplayFetchedDataViewModel::class.java)
    }

}