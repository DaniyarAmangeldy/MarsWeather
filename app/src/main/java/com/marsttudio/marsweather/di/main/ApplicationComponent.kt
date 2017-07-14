package com.marsttudio.marsweather.di.main

import com.marsttudio.marsweather.di.main.networkModule.WeatherApiModule
import com.marsttudio.marsweather.di.weather.WeatherComponent
import com.marsttudio.marsweather.di.weather.WeatherModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AppModule::class, WeatherApiModule::class))
interface ApplicationComponent {

    fun plus(module: WeatherModule): WeatherComponent
}