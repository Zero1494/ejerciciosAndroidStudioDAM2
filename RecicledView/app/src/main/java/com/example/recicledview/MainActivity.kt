package com.example.recicledview

import adaptadores.miAdaptadorRecycler
import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recicledview.databinding.ActivityMainBinding
import modelo.Almacen
import modelo.factoriaListaPersonaje

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var miRecyclerView:RecyclerView
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var contextoPrincipal: Context
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        //Comprobad que sólo permite Vertical
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Almacen.personajes = factoriaListaPersonaje.generaLista(12)
        Log.e("ACSCO", Almacen.personajes.toString())

        miRecyclerView = binding.listaPersonajesRecycler as RecyclerView
        miRecyclerView.setHasFixedSize(true)//hace que se ajuste a lo que has diseñado
        miRecyclerView.layoutManager = LinearLayoutManager(this)//se dice el tipo de Layout, dejampos este.
        //esta es la clave. Creo un objeto de tipo Mi Adaptador y le paso la lista que he creado prevaimente más arriba.
        //aquí, es donde inflará y pintará cada CardView.
        var miAdapter = miAdaptadorRecycler(Almacen.personajes, this)
        //aquí es donde hace la "magia", al pasarle a mi Recicler View, el adaptador creado.
        miRecyclerView.adapter = miAdapter

        contextoPrincipal = this




    }
}