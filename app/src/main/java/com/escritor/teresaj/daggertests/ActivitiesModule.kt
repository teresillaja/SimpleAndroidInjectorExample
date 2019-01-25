package com.escritor.teresaj.daggertests

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun contributeActivityAndroidInjector(): MainActivity
}