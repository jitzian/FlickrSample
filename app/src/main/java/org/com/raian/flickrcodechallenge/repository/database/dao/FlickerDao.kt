package org.com.raian.flickrcodechallenge.repository.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import org.com.raian.flickrcodechallenge.repository.database.model.FlickerDataClass

@Dao
interface FlickerDao {

    @Insert(onConflict = REPLACE)
    fun insert(flickerDataClass: FlickerDataClass)

    @Query("DELETE FROM flicker")
    fun deleteAll()

    @Query("SELECT * FROM flicker ORDER BY id ASC")
    fun getAll(): List<FlickerDataClass>

    @Query("SELECT * FROM flicker WHERE id = (:id)")
    fun getById(id: String): FlickerDataClass

}