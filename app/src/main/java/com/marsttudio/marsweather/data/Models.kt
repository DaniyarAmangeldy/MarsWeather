package com.marsttudio.marsweather.data

import com.google.gson.annotations.SerializedName



data class Weather(
        @SerializedName("sol") val sol: Int,
        @SerializedName("terrestrial_date") val earthDay: String,
        @SerializedName("min_temp") val minTemp: Float,
        @SerializedName("max_temp") val maxTemp: Float,
        @SerializedName("pressure") val pressure: Float
)

data class WeatherResponse(
        val results: List<Weather>
)