package com.angel.aplicacionsaludo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Conexión XML -> Kotlin
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)

        // Manejo de eventos
        btnSaludar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()

            if (nombre.isEmpty()) {
                Toast.makeText(this, getString(R.string.error_nombre), Toast.LENGTH_SHORT).show()
            } else {
                tvSaludo.text = getString(R.string.saludo, nombre)
            }
        }
    }
}