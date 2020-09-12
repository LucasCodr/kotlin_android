package com.lucas.estacaohackcurso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {

            val email = edtLoginEmail.text.toString().trim().toLowerCase()
            val senha = edtLoginPassword.text.toString().trim()

            if (email.isEmpty()) {

                edtLoginEmail.error = "Campo obrigatório."
                edtLoginEmail.requestFocus()

            } else if (senha.isEmpty()) {

                edtLoginPassword.error = "Campo obrigatório."
                edtLoginPassword.requestFocus()

            } else {

                Toast.makeText(this, "Email ou senha inválidos!", Toast.LENGTH_SHORT)
                    .show();
            }
        }

        btnLoginCadastro.setOnClickListener {

            val cadastroIntent = Intent(this, CadastroActivity::class.java)
            startActivity(cadastroIntent)
        }
    }
}