package com.example.trucoseis

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var placarNos = 0
    var placarEles = 0
    var vitoriasNos = 0
    var vitoriasEles = 0

    lateinit var tvPlacarNos: TextView

    lateinit var tvPlacarEles: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        tvPlacarNos = findViewById(R.id.tvPlacarNos)
        tvPlacarEles = findViewById(R.id.tvPlacarEles)

        val btnPlusOneNos = findViewById<Button>(R.id.btnPlusOneNos)
        btnPlusOneNos.setOnClickListener {
            placarNos++
            verificarVencedor()
        }

        val btnPlusOneEles = findViewById<Button>(R.id.btnPlusOneEles)
        btnPlusOneEles.setOnClickListener {
            placarEles++
            verificarVencedor()
        }

        val btnPlusThreeNos = findViewById<Button>(R.id.btnPlusThreeNos)
        btnPlusThreeNos.setOnClickListener {
            placarNos += 3
            verificarVencedor()
        }

        val btnPlusThreeEles = findViewById<Button>(R.id.btnPlusThreeEles)
        btnPlusThreeEles.setOnClickListener {
            placarEles += 3
            verificarVencedor()
        }

        val btnPlusSixNos = findViewById<Button>(R.id.btnPlusSixNos)
        btnPlusSixNos.setOnClickListener {
            placarNos += 6
            verificarVencedor()
        }

        val btnPlusSixEles = findViewById<Button>(R.id.btnPlusSixEles)
        btnPlusSixEles.setOnClickListener {
            placarEles += 6
            verificarVencedor()
        }

        val btnPlusNineNos = findViewById<Button>(R.id.btnPlusNineNos)
        btnPlusNineNos.setOnClickListener {
            placarNos += 9
            verificarVencedor()
        }

        val btnPlusNineEles = findViewById<Button>(R.id.btnPlusNineEles)
        btnPlusNineEles.setOnClickListener {
            placarEles += 9
            verificarVencedor()
        }

        val btnPlusTwelveNos = findViewById<Button>(R.id.btnPlusTwelveNos)
        btnPlusTwelveNos.setOnClickListener {
            placarNos += 12
            verificarVencedor()
        }

        val btnPlusTwelveEles = findViewById<Button>(R.id.btnPlusTwelveEles)
        btnPlusTwelveEles.setOnClickListener {
            placarEles += 12
            verificarVencedor()
        }

        val btnHistorico = findViewById<Button>(R.id.btnHistorico)
        btnHistorico.setOnClickListener {
            historicoVitorias()
        }

        val btnZerarHistorico = findViewById<Button>(R.id.btnZerarHistorico)
        btnZerarHistorico.setOnClickListener {
            limparVitorias()
            verificarVencedor()
        }
    }

    fun verificarVencedor(){
        atualizarPlacar()
        if (placarNos >= 12){
            vitoriasNos++
            alertaVencedor("Nós")
            limparPontos()
            historicoVitorias()

        }
        if (placarEles >= 12){
            vitoriasEles++
            alertaVencedor("Eles")
            limparPontos()
            historicoVitorias()
        }
    }

    fun alertaVencedor(vencedor: String){
        Toast.makeText(this, "Acabou! Vencedor: $vencedor", Toast.LENGTH_SHORT).show()
    }

    fun atualizarPlacar(){
        tvPlacarNos.text = placarNos.toString()
        tvPlacarEles.text = placarEles.toString()
    }

    fun limparPontos(){
        placarNos = 0
        placarEles = 0
        atualizarPlacar()
    }

    fun historicoVitorias(){
        val intent = Intent(this, HistoricoActivity::class.java)
        intent.putExtra("vitoriasNos", vitoriasNos)
        intent.putExtra("vitoriasEles", vitoriasEles)
        this.startActivity(intent)
    }

    fun limparVitorias(){
        vitoriasNos = 0
        vitoriasEles = 0
    }

}