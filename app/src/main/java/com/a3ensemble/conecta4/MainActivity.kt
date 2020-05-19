package com.a3ensemble.conecta4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bSalir = findViewById<Button>(R.id.boton_salir)
        bSalir.setOnClickListener { finish() }

        /*
        Testeo
         */
        val tablero = Tablero()
        println(tablero.toString())
        tablero.insertarFicha(0, "rojo")
        println(tablero.toString())
        tablero.insertarFicha(2, "azul")
        println(tablero.toString())
        tablero.insertarFicha(2, "rojo")
        println(tablero.toString())
        /*
        Fin testeo
         */
    }
}
