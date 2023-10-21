package com.miguel.misviajes.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize



@Parcelize
class Viaje(
    val urlImage: String,
    val texto: String,
    val latitud: String,
    val longitud: String

):Parcelable
