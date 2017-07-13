package com.marsttudio.marsweather.di

import com.marsttudio.marsweather.WeatherFragment
import com.marsttudio.marsweather.di.appModule.AppModule
import com.marsttudio.marsweather.di.networkModule.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by marsstudio on 13.07.17.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class, NetworkModule::class))
interface ApplicationComponent {

    fun inject(fragment: WeatherFragment)
}