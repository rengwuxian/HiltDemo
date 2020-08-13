package com.hencoder.hiltsample.hilt

import com.hencoder.hiltsample.data.User
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class HiltModule {
  @Binds abstract fun bindAny(user: User): Any
}