package com.marsttudio.marsweather.di.main

import android.content.Context
import com.marsttudio.marsweather.Application.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val application: App){

    @Provides
    @Singleton
    fun provideContext(): Context{
        return application
    }



}