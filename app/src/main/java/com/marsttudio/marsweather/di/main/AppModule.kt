package com.marsttudio.marsweather.di.main

import android.content.Context
import com.marsttudio.marsweather.Application.App
import com.marsttudio.marsweather.WeatherRepository.WeatherRepository
import com.marsttudio.marsweather.WeatherRepository.WeatherRepositoryImpl
import com.marsttudio.marsweather.data.network.WeatherApi
import com.marsttudio.marsweather.domain.weatherInteractor.WeatherInteractor
import com.marsttudio.marsweather.domain.weatherInteractor.WeatherInteractorImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = arrayOf(WeatherApiModule::class))
class AppModule(val application: App){

    @Provides
    @Singleton
    fun provideContext(): Context{
        return application
    }

    @Provides
    @Singleton
    fun provideWeatherRepository(weatherApi: WeatherApi): WeatherRepository {
        return WeatherRepositoryImpl(weatherApi)
    }

    @Provides
    @Singleton
    fun provideWeatherInteractor(weatherRepository: WeatherRepository): WeatherInteractor {
        return WeatherInteractorImpl(weatherRepository)
    }


}