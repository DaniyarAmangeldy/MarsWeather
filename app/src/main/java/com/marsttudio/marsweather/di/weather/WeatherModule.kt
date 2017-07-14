package com.marsttudio.marsweather.di.weather

/**
 * Created by daniyaramangeldy on 15.07.17.
 */

@dagger.Module
class WeatherModule {

    @dagger.Provides
    @WeatherScope
    fun provideWeatherRepository(weatherApi: com.marsttudio.marsweather.data.network.WeatherApi): com.marsttudio.marsweather.data.repository.weather.WeatherRepository {
        return com.marsttudio.marsweather.data.repository.weather.WeatherRepositoryImpl(weatherApi)
    }

    @dagger.Provides
    @WeatherScope
    fun provideWeatherInteractor(weatherRepository: com.marsttudio.marsweather.data.repository.weather.WeatherRepository): com.marsttudio.marsweather.domain.weather.WeatherInteractor {
        return com.marsttudio.marsweather.domain.weather.WeatherInteractorImpl(weatherRepository)
    }

}