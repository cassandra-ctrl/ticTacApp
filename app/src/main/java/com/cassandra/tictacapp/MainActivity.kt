package com.cassandra.tictacapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //pasar de una pantalla a otra
    fun nextScreen(v:View){
        //Extraemos el nombre de los jugadores y los guardamos en las variables
        var player1 = findViewById<EditText>(R.id.etJugador1)
        var player2 = findViewById<EditText>(R.id.etJugador2)

        //estoy en applicationContext y me quiero ir a la pantalla GameActivity
        var intento = Intent(applicationContext,GameActivity::class.java)
        //Se coloca el nombre de los jugadores en la pantalla nueva
        intent.putExtra("player1:", player1.text.toString())
        intent.putExtra("player2:", player2.text.toString())
        startActivity(intent)
    }
}