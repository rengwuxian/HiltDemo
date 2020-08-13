package com.hencoder.koinsample.view

import android.content.Context
import android.util.AttributeSet
import com.hencoder.koinsample.data.User
import org.koin.core.KoinComponent
import org.koin.core.inject

class UserView(context: Context, attrs: AttributeSet?) :
  androidx.appcompat.widget.AppCompatTextView(context, attrs), KoinComponent {
  private val user: User by inject()

  override fun onAttachedToWindow() {
    super.onAttachedToWindow()
    text = "${user.name}使用 Koin 的心情变成了${user.mood}"
  }
}