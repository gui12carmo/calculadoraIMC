package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes da EditText
        // Criar uma variavel e associar o componente de UI<TextInputEditText>
        // Recuperar botão da tela

        // Colocar ação no botão
        // Recuperar o texto digitado no edt peso
        // Recuperar o texto digitado no edt altura

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_Calcular)

        btnCalcular.setOnClickListener {
            val peso = edtPeso.text
            val altura = edtAltura.text


            println("Gui o melhor cara do mundo " + altura)
        }

    }
}