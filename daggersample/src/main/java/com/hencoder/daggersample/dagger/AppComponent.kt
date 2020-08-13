package com.hencoder.daggersample.dagger

import com.hencoder.daggersample.MainActivity
import com.hencoder.daggersample.dagger.scope.ActivityScope
import com.hencoder.daggersample.view.UserView
import dagger.Component

@ActivityScope
@Component
interface AppComponent {
  fun inject(mainActivity: MainActivity)
  fun inject(userView: UserView)
}