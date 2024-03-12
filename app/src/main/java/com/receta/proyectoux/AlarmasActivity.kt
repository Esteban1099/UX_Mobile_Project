package com.receta.proyectoux

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.receta.proyectoux.ui.theme.ProyectoUXTheme

class AlarmasActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.alarmas)

        findViewById<ImageView>(R.id.imageView2).setOnClickListener{
            startActivity(Intent(this, MenuActivity::class.java))
        }

        findViewById<Button>(R.id.button).setOnClickListener{
            startActivity(Intent(this, CrearAlarmaActivity::class.java))
        }
    }
}