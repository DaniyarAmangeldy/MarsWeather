package com.marsttudio.marsweather.data.repository.weather

import com.marsttudio.marsweather.data.models.WeatherResponse
import io.reactivex.Single

/**
 * Created by marsstudio on 14.07.17.
 */
interface WeatherRepository {
    fun loadRepositoriesFromApi(page: Int): Single<WeatherResponse>
}