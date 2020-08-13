package com.hencoder.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hencoder.daggersample.dagger.scope.ActivityScope
import com.hencoder.daggersample.data.User
import com.hencoder.daggersample.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
  @Inject lateinit var user: User

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    (application as DaggerApp).appComponent.inject(this)

//    binding.userTextView.text = "${user.name}使用 Dagger 的心情是：${user.mood}"
    user.mood = "难受"
  }
}