package com.example.recicledview

import Modelo.Personaje
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recicledview.databinding.ActivityMain2Binding
import modelo.personaje

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var p  = intent.getSerializableExtra("obj") as personaje
        binding.txtPersona2.text = p.toString()

        binding.btnVolver.setOnClickListener {
            finish()
        }
    }
}