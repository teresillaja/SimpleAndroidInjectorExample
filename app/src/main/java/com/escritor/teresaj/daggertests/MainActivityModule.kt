package com.escritor.teresaj.daggertests

import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityModule {

    @Binds
    abstract fun provideObject(testObject: ClassA): IntefaceContract.interface1

}