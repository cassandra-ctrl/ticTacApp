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
        setContentView(R.layout.activity_main)
    }

    //pasar de una pantalla a otra
    fun nextScreen(v:View){
        var player1 = findViewById<EditText>(R.id.etPlayer1)
        var player2 = findViewById<EditText>(R.id.etPlayer2)

        val intent = Intent(this, GameActivity::class.java)
        intent.putExtra("player1", player1.text.toString())
        intent.putExtra("player2", player2.text.toString())
        startActivity(intent)


    }
}