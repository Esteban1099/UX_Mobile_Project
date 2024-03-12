package com.receta.proyectoux

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.ComponentActivity


class CrearAlarmaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crear_alarma)

        findViewById<TextView>(R.id.textView).setOnClickListener{
            startActivity(Intent(this, AlarmasActivity::class.java))
        }

        val spinner: Spinner = findViewById(R.id.spinner)

        // Define los datos para el Spinner
        val datos = listOf("7:00 am", "7:30 am", "8:00 am")

        // Crea un adaptador para el Spinner utilizando los datos
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, datos)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Asigna el adaptador al Spinner
        spinner.adapter = adaptador

        val spinner1: Spinner = findViewById(R.id.spinner1)

        // Define los datos para el Spinner
        val datos1 = listOf("Vibrar", "Alarm beep", "Bugle")

        // Crea un adaptador para el Spinner utilizando los datos
        val adaptador1 = ArrayAdapter(this, android.R.layout.simple_spinner_item, datos1)
        adaptador1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Asigna el adaptador al Spinner
        spinner1.adapter = adaptador1
    }
}