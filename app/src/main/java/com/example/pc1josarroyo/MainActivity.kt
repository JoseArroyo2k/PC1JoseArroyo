package com.example.pc1josarroyo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val examenParcialEditText = findViewById<EditText>(R.id.idExamenParcial)
        val examenFinalEditText = findViewById<EditText>(R.id.idExamenFinal)
        val pepEditText = findViewById<EditText>(R.id.idPEP)
        val calcularButton = findViewById<Button>(R.id.idCalcularButton)

        calcularButton.setOnClickListener {
            val examenParcialString = examenParcialEditText.text.toString()
            val examenFinalString = examenFinalEditText.text.toString()
            val pepString = pepEditText.text.toString()

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("EXAMEN_PARCIAL", examenParcialString)
            intent.putExtra("EXAMEN_FINAL", examenFinalString)
            intent.putExtra("PEP", pepString)
            startActivity(intent)
    }
}
}