package com.receta.proyectoux

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity


class PasosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listado_pasos)

        findViewById<TextView>(R.id.textView6).setOnClickListener{
            startActivity(Intent(this, RecetasActivity::class.java))
        }
    }
}