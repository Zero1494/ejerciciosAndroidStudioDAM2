package com.example.imagenesyaudio

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.imagenesyaudio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mediaPlayer = MediaPlayer.create(this, R.raw.mario)

        binding.btn1.setOnClickListener{
            mediaPlayer.start()
        }

        binding.btn2.setOnClickListener{
            mediaPlayer.stop()
            mediaPlayer = MediaPlayer.create(this, R.raw.mario)
        }



    }
}