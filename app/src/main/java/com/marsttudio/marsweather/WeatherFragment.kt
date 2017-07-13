package com.marsttudio.marsweather


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class WeatherFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater!!.inflate(R.layout.fragment_weather, container, false)
    }

    companion object {
        private val KEY_SAMPLE = "sample"

        fun newInstance(): WeatherFragment {
            val fragment = WeatherFragment()
            val args = Bundle()
            args.putString(KEY_SAMPLE,"hello")
            fragment.arguments = args
            return fragment
        }
    }

}
