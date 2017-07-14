package com.marsttudio.marsweather.presentation.weather.views

import android.os.Bundle
import android.support.v4.app.Fragment
import com.marsttudio.marsweather.BaseActivity
import com.marsttudio.marsweather.R
import kotlinx.android.synthetic.main.activity_weather.*

class WeatherActivity : BaseActivity() {


    override fun getFragment(): Fragment? = WeatherFragment()

    override fun getLayout(): Int  = R.layout.activity_weather

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)
    }
}
