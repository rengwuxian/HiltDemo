package com.hencoder.hiltsample.data

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScoped
data class User constructor(var id: Int, var name: String, var mood: String) {
  constructor() : this(1, "扔物线", "毫无波澜")
}