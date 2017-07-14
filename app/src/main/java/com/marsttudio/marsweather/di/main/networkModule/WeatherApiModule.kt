package com.marsttudio.marsweather.di.main.networkModule

@dagger.Module(includes = arrayOf(RetrofitModule::class))
class WeatherApiModule {

    @javax.inject.Singleton
    @dagger.Provides
    fun provideWeatherApi(retrofit: retrofit2.Retrofit): com.marsttudio.marsweather.data.network.WeatherApi {
        return retrofit.create(com.marsttudio.marsweather.data.network.WeatherApi::class.java)
    }

}