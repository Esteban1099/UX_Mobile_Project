package com.receta.proyectoux

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.receta.proyectoux.ui.theme.ProyectoUXTheme

class MenuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

        findViewById<Button>(R.id.button).setOnClickListener{
            startActivity(Intent(this, RecetasActivity::class.java))
        }

        findViewById<Button>(R.id.button1).setOnClickListener{
            startActivity(Intent(this, AlarmasActivity::class.java))
        }

        findViewById<TextView>(R.id.textView5).setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}