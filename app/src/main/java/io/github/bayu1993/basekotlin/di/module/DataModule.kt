package io.github.bayu1993.basekotlin.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import io.github.bayu1993.basekotlin.di.scope.ApplicationContext
import javax.inject.Singleton
import io.github.bayu1993.basekotlin.data.local.PreferenceManager
/**
 * Created by Bayu teguh pamuji on 8/25/18.
 * email : bayuteguhpamuji@gmail.com.
 */
@Module
class DataModule {
    @Provides
    @Singleton
    fun providePreferenceManager(@ApplicationContext context: Context): PreferenceManager = PreferenceManager (context)
}