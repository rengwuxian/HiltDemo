package com.hencoder.hiltsample.view

import android.content.Context
import android.util.AttributeSet
import com.hencoder.hiltsample.MainActivity
import com.hencoder.hiltsample.data.User
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class UserView(context: Context, attrs: AttributeSet?) :
  androidx.appcompat.widget.AppCompatTextView(context, attrs) {
  @Inject lateinit var user: User

  override fun onAttachedToWindow() {
    super.onAttachedToWindow()

    text = "${user.name}的心情变成了：${user.mood}"
  }
}