package io.github.bayu1993.basekotlin.di.module

import android.app.Activity
import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import io.github.bayu1993.basekotlin.di.scope.ActivityContext
import io.github.bayu1993.basekotlin.di.scope.ActivityScope

/**
 * Created by Bayu teguh pamuji on 8/25/18.
 * email : bayuteguhpamuji@gmail.com.
 */
@Module
class ActivityModule(private val activity:Activity){

    @Provides
    @ActivityScope
    fun provideActivity():Activity = activity

    @Provides
    @ActivityContext
    fun provideActivityContext(): Context = activity

}
