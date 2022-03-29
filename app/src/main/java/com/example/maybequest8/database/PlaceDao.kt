package com.example.maybequest8.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface  PlaceDao{
    @Query("SELECT * FROM place")
    suspend fun getAllFromCity(): List<Place>
}