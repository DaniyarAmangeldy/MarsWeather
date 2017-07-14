package com.marsttudio.marsweather.WeatherRepository

import com.marsttudio.marsweather.data.Weather
import com.marsttudio.marsweather.data.WeatherResponse
import io.reactivex.Single

/**
 * Created by marsstudio on 14.07.17.
 */
interface WeatherRepository {
    fun loadRepositoriesFromApi(page: Int): Single<WeatherResponse>
}