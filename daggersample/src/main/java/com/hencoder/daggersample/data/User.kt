package com.hencoder.daggersample.data

import com.hencoder.daggersample.dagger.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
data class User(var id: Int, var name: String, var mood: String) {
  @Inject constructor() : this(1, "扔物线", "毫无波澜")
}