package com.receta.proyectoux

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recetas")
data class Receta(
    @PrimaryKey val id: Int?,
    val name: String?,
)