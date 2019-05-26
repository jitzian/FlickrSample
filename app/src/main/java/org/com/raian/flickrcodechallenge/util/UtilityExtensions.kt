package org.com.raian.flickrcodechallenge.util

import org.com.raian.flickrcodechallenge.constans.model.FlickerDataClass

fun <T1 : Any, T2 : Any, R : Any> safeLet(p1: T1?, p2: T2?, block: (T1, T2) -> R?): R? {
    return if (p1 != null && p2 != null) block(p1, p2) else null
}

fun <T1 : Any, R : Any> safeLet(p1: T1?, block: (T1) -> R?): R? {
    return if (p1 != null) block(p1) else null
}

fun prepareUrl(flickerDataClass: FlickerDataClass): String =
    "https://farm${flickerDataClass.farm}.static.flickr.com/${flickerDataClass.server}/${flickerDataClass.id}_${flickerDataClass.secret}.jpg"