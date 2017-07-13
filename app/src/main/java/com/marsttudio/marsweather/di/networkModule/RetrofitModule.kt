package com.marsttudio.marsweather.di.networkModule

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Created by marsstudio on 13.07.17.
 */

@Module
class RetrofitModule {
    val TIMEOUT_SECONDS = 15L


    @Singleton
    @Provides
    fun provideRetrofitBuilder(client: OkHttpClient,converter:Gson): Retrofit.Builder{
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(converter))
                .client(client)
    }



    @Singleton
    @Provides
    fun provideClient(): OkHttpClient{
        return OkHttpClient().newBuilder()
                .connectTimeout(TIMEOUT_SECONDS,TimeUnit.SECONDS)
                .readTimeout(TIMEOUT_SECONDS,TimeUnit.SECONDS)
                .build()
    }

    @Singleton
    @Provides
    fun provideConverter(): Gson {
        return GsonBuilder()
                .create()
    }
}