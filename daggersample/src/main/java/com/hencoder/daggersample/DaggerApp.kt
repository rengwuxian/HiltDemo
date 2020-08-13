package com.hencoder.daggersample

import android.app.Application
import com.hencoder.daggersample.dagger.AppComponent
import com.hencoder.daggersample.dagger.DaggerAppComponent

class DaggerApp : Application() {
  lateinit var appComponent: AppComponent

  override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent.create()
  }
}