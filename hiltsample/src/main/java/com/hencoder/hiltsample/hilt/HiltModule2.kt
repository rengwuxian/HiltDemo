package com.hencoder.hiltsample.hilt

import com.hencoder.hiltsample.data.User
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object HiltModule2 {
  @Provides
  fun provideUser(): User {
    val user = User()
    user.name = "丢物线"
    user.mood = "难过"
    return user
  }
}