package com.escritor.teresaj.daggertests

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivitiesModule::class])
interface ApplicationComponent {

    fun inject(application: TestApplication)


    @Component.Builder
    interface Builder {
        fun build(): ApplicationComponent

        @BindsInstance
        fun applicationBind(application: TestApplication): Builder
    }
}