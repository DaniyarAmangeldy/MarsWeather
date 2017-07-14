package com.marsttudio.marsweather.data.network

import com.marsttudio.marsweather.data.models.WeatherResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by marsstudio on 14.07.17.
 */
interface WeatherApi {
    @GET("archive/")
    fun getWeatherArchive(@Query("page") page:Int): Single<WeatherResponse>
}