package com.marsttudio.marsweather.domain.weather

import com.marsttudio.marsweather.data.repository.weather.WeatherRepository
import com.marsttudio.marsweather.data.models.Weather
import com.marsttudio.marsweather.di.weather.WeatherScope
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by marsstudio on 14.07.17.
 */

@WeatherScope
class WeatherInteractorImpl @Inject constructor(val weatherRepository: WeatherRepository): WeatherInteractor {
    override fun loadWeather(page: Int): Single<List<Weather>>{
        return weatherRepository.loadRepositoriesFromApi(page)
                .map { response -> response.results }
    }

}