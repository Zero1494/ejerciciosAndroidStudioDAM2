package com.example.recicledview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.recicledview.databinding.ActivityMainBinding
import modelo.Almacen
import modelo.factoriaListaPersonaje

class MainActivity : AppCompatActivity{
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        //Comprobad que sólo permite Vertical
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Almacen.personajes = factoriaListaPersonaje.generaLista(12)
        Log.e("ACSCO", Almacen.personajes.toString())

    }
}