package com.receta.proyectoux

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity


class RecetasActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listado_recetas)

        findViewById<ImageView>(R.id.imageView).setOnClickListener{
            startActivity(Intent(this, MenuActivity::class.java))
        }

        findViewById<Button>(R.id.receta_name1).setOnClickListener{
            startActivity(Intent(this, PasosActivity::class.java))
        }
        findViewById<Button>(R.id.receta_name2).setOnClickListener{
            startActivity(Intent(this, PasosActivity::class.java))
        }
        findViewById<Button>(R.id.receta_name3).setOnClickListener{
            startActivity(Intent(this, PasosActivity::class.java))
        }
        findViewById<Button>(R.id.receta_name4).setOnClickListener{
            startActivity(Intent(this, PasosActivity::class.java))
        }
        findViewById<Button>(R.id.receta_name5).setOnClickListener{
            startActivity(Intent(this, PasosActivity::class.java))
        }
        findViewById<Button>(R.id.receta_name6).setOnClickListener{
            startActivity(Intent(this, PasosActivity::class.java))
        }
        findViewById<Button>(R.id.receta_name7).setOnClickListener{
            startActivity(Intent(this, PasosActivity::class.java))
        }
    }
}