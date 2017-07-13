package com.marsttudio.marsweather.Application

import android.app.Application
import com.marsttudio.marsweather.di.ApplicationComponent
import com.marsttudio.marsweather.di.DaggerApplicationComponent
import com.marsttudio.marsweather.di.appModule.AppModule


class App : Application() {

    companion object {
        @JvmStatic lateinit var graph: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
        graph = DaggerApplicationComponent.builder().appModule(AppModule(this)).build()


    }

}