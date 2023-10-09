package com.example.variosactivitiescondatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variosactivitiescondatos.databinding.ActivityMainBinding
import com.example.variosactivitiescondatos.databinding.ActivityVentanaNumero2Binding
import modelo.almacenPersonas

class ventanaNumero2 : AppCompatActivity() {

    lateinit var binding:ActivityVentanaNumero2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_ventana_numero2)

        binding= ActivityVentanaNumero2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var nombre = intent.getStringExtra("nombre")
        var edad = intent.getStringExtra("edad")
        var persona: Persona = Persona(nombre,edad)
        binding.cajaNombre.setText(nombre)
        binding.cajaEdad.setText(edad)

        almacenPersonas.aniadirPersona(persona)
        var cadena: String = ""
        var i: int = 1
        for(p in almacenPersonas.personas){
            cadena+=" "+i+". "+ p.nombre+" "p.edad +"\n"
            i++
            binding.multiLine.setText(cadena)
        }

        binding.boton.setOnClickListener {
            finish()
        }

    }


}