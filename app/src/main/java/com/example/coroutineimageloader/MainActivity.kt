package com.example.coroutineimageloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import com.example.coroutineimageloader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.image1.load(R.drawable.image1){
            crossfade(true)
            crossfade(1000)
        }
        binding.image2.load(R.drawable.image2){
            crossfade(true)
            crossfade(1000)
        }
    }
}