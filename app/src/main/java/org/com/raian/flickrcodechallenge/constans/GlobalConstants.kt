package org.com.raian.flickrcodechallenge.constans

class GlobalConstants {
    //https://api.flickr.com/services/rest/?method=flickr.photos.search&api_key=dc2242530334eff5c97106c9110de945&%20format=json&nojsoncallback=1&safe_search=1&text=car
    companion object {
        const val baseURL = "https://api.flickr.com/services/rest/"
        const val flickrKey = "dc2242530334eff5c97106c9110de945"

        //Constants for saving RoomDB
        const val dataBaseName = "flicker.db"
        const val dataBaseVersion = 1


    }
}