package io.github.bayu1993.basekotlin.di.component

import dagger.Subcomponent
import io.github.bayu1993.basekotlin.di.module.ActivityModule
import io.github.bayu1993.basekotlin.di.scope.ActivityScope

/**
 * Created by Bayu teguh pamuji on 8/25/18.
 * email : bayuteguhpamuji@gmail.com.
 */

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    @Subcomponent.Builder
    interface Builder{
        fun activityModule(activityModule: ActivityModule):Builder
        fun build():ActivityComponent
    }
}