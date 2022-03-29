package com.example.maybequest8.database

import androidx.room.Database

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase {
    abstract fun PlaceDao(): PlaceDao
}