package io.github.bayu1993.basekotlin

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import io.github.bayu1993.basekotlin.di.component.AppComponent
import io.github.bayu1993.basekotlin.di.component.DaggerAppComponent
import io.github.bayu1993.basekotlin.di.module.AppModule
import javax.inject.Inject

@SuppressLint("Registered")
/**
 * Created by Bayu teguh pamuji on 8/25/18.
 * email : bayuteguhpamuji@gmail.com.
 */

class BaseApp: Application(){
    val appComponent:AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}