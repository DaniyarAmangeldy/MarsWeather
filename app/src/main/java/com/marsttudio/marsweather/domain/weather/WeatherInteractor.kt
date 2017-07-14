package com.marsttudio.marsweather.domain.weather

import com.marsttudio.marsweather.data.models.Weather
import io.reactivex.Single

/**
 * Created by marsstudio on 14.07.17.
 */


interface WeatherInteractor {

    fun loadWeather(page: Int = 1): Single<List<Weather>>
}