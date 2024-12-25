package com.cassandra.tictacapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.cassandra.tictacapp.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {

    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var b7: Button
    lateinit var b8: Button
    lateinit var b9: Button
    lateinit var tvPlayer1: TextView
    lateinit var tvPlayer2: TextView

    //Variable para los turnos
    var jugadorActual:Int = 1

    //Puntaje de los jugadores al iniciar el juego
    var ScoreJugador1:Int = 0
    var ScoreJugador2:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        initUI()

    }

    private fun initUI() {
        //Inicializamos lo sbotones
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        tvPlayer1 = findViewById(R.id.tvPlayer1)
        tvPlayer2 = findViewById(R.id.tvPlayer2)

        //Recuperamos los valores ingresados por los jugadores
        tvPlayer1.text = intent?.extras?.getString("player1").toString()
        tvPlayer2.text = intent?.extras?.getString("player2").toString()
    }

    fun play(btn: View){
        //convierte en boton
        val myBtn: Button = btn as Button
        if(btn.text.toString().isEmpty()){
            //aun no han presionado el boton, por eso esta vacio
            if(jugadorActual == 1){
                //jugador1= X
                myBtn.text = "X"
                //Cambiamos de turno
                jugadorActual = 2;
            }else{
                //jugador2= O
                myBtn.text = "O"
                //Cambiamos de turno
                jugadorActual = 1;
            }

        }
    }


}