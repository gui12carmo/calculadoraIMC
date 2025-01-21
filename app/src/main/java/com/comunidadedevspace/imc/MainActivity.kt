package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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
            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                // Mostra uma mensagem de erro ao user

                Snackbar.make(
                    edtPeso,
                    "Por favor preencha todos os campos",
                    Snackbar.LENGTH_LONG
                )
                    .show()

            } else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                // Navegar para a proxima tela
                // Criar o layout da proxima tela
                // Passar dados (resultado) para proxima tela

                // intent - Class do proprio android

                val intent = Intent(this, resultActivity::class.java)
                startActivity(intent)

                println("o valor do seu IMC é de: " + resultado)
            }

        }

    }
}