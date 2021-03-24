package com.example.raionintern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.pass)
        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener{
            val Username = username.getText().toString()
            val Password = password.getText().toString()
            if (Username.isEmpty()||Password.isEmpty()){
                Toast.makeText(this, "Mohon Isi Terlebih Dahulu", Toast.LENGTH_SHORT).show()
            }
            if (Username == "tes" && Password == "tes"){
                Toast.makeText(this, "Berhasil Login", Toast.LENGTH_SHORT).show()
                val menuActivity = Intent(this, Menu::class.java)
                startActivity(menuActivity)
            } else{
                Toast.makeText(this, "Username atau Password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}