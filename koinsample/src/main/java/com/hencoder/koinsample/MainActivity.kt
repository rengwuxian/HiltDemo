package com.hencoder.koinsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hencoder.koinsample.data.User
import com.hencoder.koinsample.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
  private val user: User by inject()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

//    binding.userTextView.text = "${user.name}使用 Koin 的心情是：${user.mood}"
    user.mood = "奇怪"
  }
}