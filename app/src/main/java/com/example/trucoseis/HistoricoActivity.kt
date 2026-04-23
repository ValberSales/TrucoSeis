package com.example.trucoseis

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HistoricoActivity : AppCompatActivity() {

    var vitoriasNos = 0
    var vitoriasEles = 0

    lateinit var tvVitoriaNos: TextView
    lateinit var tvVitoriaEles: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_historico)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        vitoriasNos = intent.getIntExtra("vitoriasNos", 0)
        vitoriasEles = intent.getIntExtra("vitoriasEles", 0)

        tvVitoriaNos = findViewById(R.id.tvVitoriaNos)
        tvVitoriaEles = findViewById(R.id.tvVitoriaEles)

        tvVitoriaNos.text = vitoriasNos.toString()
        tvVitoriaEles.text = vitoriasEles.toString()

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            finish()
        }

    }


}

