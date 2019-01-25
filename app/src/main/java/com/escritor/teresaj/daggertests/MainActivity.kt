package com.escritor.teresaj.daggertests

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject


class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var testObject: IntefaceContract.interface1

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testObject.doSomething()
    }
}
