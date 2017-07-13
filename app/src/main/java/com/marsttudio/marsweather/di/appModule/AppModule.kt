package com.marsttudio.marsweather.di.appModule

import android.content.Context
import com.marsttudio.marsweather.Application.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by marsstudio on 13.07.17.
 */
@Module
class AppModule(private val application: App){

    @Provides
    @Singleton
    fun provideContext(): Context{
        return application
    }


}