package com.hencoder.koinsample

import android.app.Application
import com.hencoder.koinsample.data.User
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class KoinApp : Application() {
  val appModule = module {
    single { User() }
  }

  override fun onCreate() {
    super.onCreate()
    startKoin{
      androidLogger()
      androidContext(this@KoinApp)
      modules(appModule)
    }
  }
}