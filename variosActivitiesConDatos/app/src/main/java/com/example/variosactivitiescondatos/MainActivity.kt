package com.example.variosactivitiescondatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variosactivitiescondatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener {
            irAVentana2()
        }

    }

    private fun irAVentana2() {
        //aqui se crea el objeto para cambiar de ventana
        var miIntent = Intent(this,ventanaNumero2::class.java)
        //Aqui podemos pasar los atributos creados en los elementos de texto que estan en
        //nuestra primera ventana
        //miIntent.putExtra("nombre",binding.cajaNombre.text.toString())
        //miIntent.putExtra("edad",binding.cajaEdad.text.toString())
        startActivity(miIntent)

    }


}