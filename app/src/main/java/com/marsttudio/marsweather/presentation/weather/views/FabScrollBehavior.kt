package com.marsttudio.marsweather.presentation.weather.views

import android.content.Context
import android.support.design.widget.AppBarLayout
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.FloatingActionButton
import android.util.AttributeSet
import android.view.View

/**
 * Created by daniyaramangeldy on 15.07.17.
 */
class FabScrollBehavior constructor(context: Context?, attrs: AttributeSet?) : CoordinatorLayout.Behavior<FloatingActionButton>(context, attrs) {

    override fun layoutDependsOn(parent: CoordinatorLayout?, child: FloatingActionButton?, dependency: View?): Boolean {
        return dependency is AppBarLayout
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout?, fab: FloatingActionButton?, dependency: View?): Boolean {
        if (dependency is AppBarLayout){
            val layoutParams = fab?.layoutParams as CoordinatorLayout.LayoutParams
            val bottomMargin = layoutParams.bottomMargin
            val distanceToScroll = fab.height + bottomMargin as Float
            fab.translationY = -distanceToScroll
        }
        return true
    }
}