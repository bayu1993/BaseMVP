package io.github.bayu1993.basekotlin.presentation.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import io.github.bayu1993.basekotlin.BaseApp
import io.github.bayu1993.basekotlin.di.component.ActivityComponent
import io.github.bayu1993.basekotlin.di.module.ActivityModule

/**
 * Created by Bayu teguh pamuji on 8/25/18.
 * email : bayuteguhpamuji@gmail.com.
 */

abstract class BaseActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityComponent = (application as BaseApp)
                .appComponent
                .activityComponent()
                .activityModule(ActivityModule(this))
                .build()

        injectModule(activityComponent)
    }
    abstract fun injectModule(activityComponent: ActivityComponent)
}