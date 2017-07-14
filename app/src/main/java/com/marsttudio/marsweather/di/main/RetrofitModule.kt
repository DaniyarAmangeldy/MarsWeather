package com.marsttudio.marsweather.di.main

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
class RetrofitModule {
    val TIMEOUT_SECONDS = 15L
    val BASE_URL = "http://marsweather.ingenology.com/v1/"

    @Singleton
    @Provides
    fun provideRetrofit(builder: Retrofit.Builder): Retrofit {
        return builder
                .baseUrl(BASE_URL)
                .build()
    }

    @Singleton
    @Provides
    fun provideRetrofitBuilder(client: OkHttpClient,converter:Gson): Retrofit.Builder{
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(converter))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
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