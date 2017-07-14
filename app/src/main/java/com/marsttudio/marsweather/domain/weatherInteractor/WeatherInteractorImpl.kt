package com.marsttudio.marsweather.domain.weatherInteractor

import com.marsttudio.marsweather.WeatherRepository.WeatherRepository
import com.marsttudio.marsweather.data.Weather
import com.marsttudio.marsweather.data.WeatherResponse
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by marsstudio on 14.07.17.
 */

@Singleton
class WeatherInteractorImpl @Inject constructor(val weatherRepository: WeatherRepository): WeatherInteractor {
    override fun loadWeather(page: Int): Single<List<Weather>>{
        return weatherRepository.loadRepositoriesFromApi(page)
                .map { response -> response.results }
    }

}