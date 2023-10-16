package com.example.ejemplosbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnPulsame:Button
    lateinit var edTexto:EditText
    lateinit var chkLicencia:CheckBox
    lateinit var rb1:RadioButton
    lateinit var rb2:RadioButton
    lateinit var rb3:RadioButton
    lateinit var rb4:RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edTexto = findViewById(R.id.edTexto)
        btnPulsame = findViewById(R.id.btnPulsame)
        chkLicencia = findViewById(R.id.chkLicencia)
        rb1=findViewById(R.id.rb1)
        rb2=findViewById(R.id.rb2)
        rb3=findViewById(R.id.rb3)

        btnPulsame.setOnClickListener {
            if (chkLicencia.isChecked) {
                edTexto.setText("Licencia aceptada")
            } else {
                edTexto.setText("Licencia sin aceptar")
            }

        }

        chkLicencia.setOnClickListener {
            if (chkLicencia.isChecked) {
                chkLicencia.setText("Licencia aceptada")
            } else {
                chkLicencia.setText("Licencia sin aceptar")
            }
        }

        rb1.setOnClickListener {
            if (rb1.isChecked) {
                Toast.makeText(this, "Usted ha marcado la opcion 1", Toast.LENGTH_SHORT).show()
            } else {
                if (rb2.isChecked) {
                    edTexto.setText("Usted ha marcado la opcion 2")
                } else {
                    if (rb3.isChecked) {
                        edTexto.setText("Usted ha marcado la opcion 3")
                    }
                }
            }
        }


    }
        //hola que tal
}