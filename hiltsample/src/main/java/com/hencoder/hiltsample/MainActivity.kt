package com.hencoder.hiltsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hencoder.hiltsample.data.User
import com.hencoder.hiltsample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
  @Inject lateinit var user: User
  @Inject lateinit var any: Any

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val anyUser = any as User
    binding.userTextView.text = "${anyUser.name}的心情是：${anyUser.mood}"
//    user.mood = "有点想笑"
  }
}