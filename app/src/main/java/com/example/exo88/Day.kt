 package com.example.exo88

import com.google.gson.annotations.SerializedName

data class Day(

	@field:SerializedName("Sunset")
	val sunset: String? = null,

	@field:SerializedName("Asr")
	val asr: String? = null,

	@field:SerializedName("Isha")
	val isha: String? = null,

	@field:SerializedName("Fajr")
	val fajr: String? = null,

	@field:SerializedName("Dhuhr")
	val dhuhr: String? = null,

	@field:SerializedName("Maghrib")
	val maghrib: String? = null,

	@field:SerializedName("Sunrise")
	val sunrise: String? = null,

	@field:SerializedName("Midnight")
	val midnight: String? = null,

	@field:SerializedName("Imsak")
	val imsak: String? = null
)
