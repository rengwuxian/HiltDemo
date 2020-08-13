package com.hencoder.daggersample.view

import android.content.Context
import android.util.AttributeSet
import com.hencoder.daggersample.DaggerApp
import com.hencoder.daggersample.data.User
import javax.inject.Inject

class UserView(context: Context, attrs: AttributeSet?) :
  androidx.appcompat.widget.AppCompatTextView(context, attrs) {
  @Inject lateinit var user: User

  override fun onAttachedToWindow() {
    super.onAttachedToWindow()

    (context.applicationContext as DaggerApp).appComponent.inject(this)

    text = "${user.name}使用 Dagger 的心情变成了：${user.mood}"
  }
}