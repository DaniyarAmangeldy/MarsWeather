package com.marsttudio.marsweather.Application

import android.app.Application
import com.marsttudio.marsweather.di.main.AppModule
import com.marsttudio.marsweather.di.main.ApplicationComponent
import com.marsttudio.marsweather.di.main.DaggerApplicationComponent


class App : Application() {

    companion object {
        @JvmStatic lateinit var graph: ApplicationComponent

    }

    override fun onCreate() {
        super.onCreate()
        graph = DaggerApplicationComponent.builder().appModule(AppModule(this)).build()
    }

    fun applicationComponent() = graph

}