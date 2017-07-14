package com.marsttudio.marsweather.di.weather

import com.marsttudio.marsweather.presentation.weather.presenters.WeatherPresenter
import dagger.Subcomponent


/**
 * Created by daniyaramangeldy on 15.07.17.
 */
@Subcomponent(modules = arrayOf(WeatherModule::class))
@WeatherScope
interface WeatherComponent {
    fun inject(presenter: WeatherPresenter)
}