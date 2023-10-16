package com.example.controleseventosidiomas

import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textoCentral:TextView
    lateinit var botonDerecho:Button
    lateinit var botonCentro:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonDerecho = findViewById(R.id.btnDer)
        botonCentro = findViewById(R.id.btnCentro)
        botonDerecho.setOnClickListener{

        }

        botonCentro.setOnClickListener {
            /*escribirToast()
            Toast.makeText(this, resources.getString(R.string.mensajeToast), Toast.LENGTH_LONG).show()

             */
            Toast.makeText(this,"Este texto sale desde el centro, estamos a 2/10",Toast.LENGTH_SHORT).show()
        }
    }

    private fun cambiarDesdeIzq(v:View){
        Log.d("CCM","Entro en la funcion cambiarDesdeIzquierdo")
        textoCentral = findViewById(R.id.lblTextoCentral)
        textoCentral.text="Cambiado desde Izquierdo"
    }

    private fun cambiarDesdeDer(v:View){
        textoCentral = findViewById(R.id.lblTextoCentral)
        textoCentral.text="Cambiado desde Derecho"
        Log.d("btnDer","Entramos en la funcion desde boton derecho")
    }

    private fun central() {

    }
}
