package com.marsttudio.marsweather

import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_weather.*

class WeatherActivity : BaseActivity() {


    override fun getFragment(): Fragment? = WeatherFragment()

    override fun getLayout(): Int  = R.layout.activity_weather

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)
    }
}
