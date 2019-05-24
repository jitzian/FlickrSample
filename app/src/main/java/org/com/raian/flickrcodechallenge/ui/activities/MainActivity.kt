package org.com.raian.flickrcodechallenge.ui.activities

import android.os.Bundle
import org.com.raian.flickrcodechallenge.R
import java.util.logging.Logger

class MainActivity : BaseActivity() {

    init{
        TAG = MainActivity::class.java.simpleName
        logger = Logger.getLogger(TAG)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume().also {
            displayFetchedDataViewModel.fetchRemoteData("dragonBall")
        }
    }
}
