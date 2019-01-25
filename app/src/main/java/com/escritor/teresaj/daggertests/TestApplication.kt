package com.escritor.teresaj.daggertests

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class TestApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent.builder()
            .applicationBind(this)
            .build()
            .inject(this)

        System.out.print("hello")

    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector
}