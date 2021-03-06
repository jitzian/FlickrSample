package org.com.raian.flickrcodechallenge.util

import org.com.raian.flickrcodechallenge.repository.database.model.FlickerDataClass

//Build URL according to documentation
fun prepareUrl(flickerDataClass: FlickerDataClass): String =
    "https://farm${flickerDataClass.farm}.static.flickr.com/${flickerDataClass.server}/${flickerDataClass.id}_${flickerDataClass.secret}.jpg"