package io.github.bayu1993.basekotlin.di.component

import dagger.Component
import io.github.bayu1993.basekotlin.di.module.AppModule
import io.github.bayu1993.basekotlin.di.module.DataModule
import javax.inject.Singleton

/**
 * Created by Bayu teguh pamuji on 8/25/18.
 * email : bayuteguhpamuji@gmail.com.
 */
@Singleton
@Component(modules = [AppModule::class, DataModule::class])
interface AppComponent{
    fun activityComponent(): ActivityComponent.Builder
}