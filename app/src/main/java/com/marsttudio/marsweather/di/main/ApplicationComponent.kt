package com.marsttudio.marsweather.di.main

import com.marsttudio.marsweather.presentation.weather.presenters.WeatherPresenter
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AppModule::class))
interface ApplicationComponent {

    fun inject(presenter: WeatherPresenter)
}