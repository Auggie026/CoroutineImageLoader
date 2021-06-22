package com.example.coroutineimageloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import com.example.coroutineimageloader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val link = "https://i0.wp.com/volatileinnovation.com/wp-content/uploads/2020/09/landscape-mountains-sky-4843193.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.image1.load(link){
            placeholder(R.drawable.ic_launcher_background)
            crossfade(true)
            crossfade(500)
            transformations(
                    CircleCropTransformation(),
                    GrayscaleTransformation()

                )
        }
        binding.image2.load(R.drawable.image2){
            crossfade(true)
            crossfade(1000)
            transformations(RoundedCornersTransformation(100f))
            transformations(CircleCropTransformation())
        }
    }
}