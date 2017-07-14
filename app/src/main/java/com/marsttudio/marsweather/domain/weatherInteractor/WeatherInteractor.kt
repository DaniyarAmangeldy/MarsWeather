package com.marsttudio.marsweather.domain.weatherInteractor

import com.marsttudio.marsweather.data.Weather
import com.marsttudio.marsweather.data.WeatherResponse
import io.reactivex.Single

/**
 * Created by marsstudio on 14.07.17.
 */


interface WeatherInteractor {

    fun loadWeather(page: Int = 1): Single<List<Weather>>
}