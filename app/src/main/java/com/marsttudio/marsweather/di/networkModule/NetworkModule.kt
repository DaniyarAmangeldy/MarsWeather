package com.marsttudio.marsweather.di.networkModule

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by marsstudio on 13.07.17.
 */

@Module(includes = arrayOf(RetrofitModule::class))
class NetworkModule {
    val BASE_URL = "http://marsweather.ingenology.com/v1/"

    @Singleton
    @Provides
    fun provideRetrofit(builder: Retrofit.Builder): Retrofit {
        return builder
                .baseUrl(BASE_URL)
                .build()
    }
}