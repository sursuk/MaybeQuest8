
package com.example.maybequest8.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity//(tableName = "questDatabase")
data class Place(
@PrimaryKey(autoGenerate = true)
var id: Int,
@ColumnInfo(name ="name")
val name: String,
@ColumnInfo(name ="quest")
val quest: String,
@ColumnInfo(name ="description")
val description: String,
@ColumnInfo(name ="image")
val image: String,
@ColumnInfo(name ="longitude")
val longitude: Double,
@ColumnInfo(name ="latitude")
val latitude: Double,
@ColumnInfo(name ="distention")
val distention: Int,
)