package com.a3ensemble.conecta4

class Tablero() {

    val casillasTablero = List(7) {List(6) {Casilla()} }

    var posicionesLibres = Array(7) {0}

    init {
        for (posicion in posicionesLibres) {
            posicionesLibres[posicion] = 0
        }

    }

    override fun toString(): String {
        var s:String = ""
        for (j in 5 downTo 0) {
            for (i in 0..6) {
                s+=casillasTablero[i][j].colorCasilla + "   "
            }
            s+="\n"
        }
        return s
    }

    fun toStringReal(): String {
        var s:String = ""
        for (i in 0..6) {
            for (j in 0..5) {
                s+=casillasTablero[i][j].colorCasilla + "  "
            }
            s+="\n"
        }
        return s
    }

    fun insertarFicha(columna:Int, color:String): Boolean {
        return if (posicionesLibres[columna]<6){
            casillasTablero[columna][posicionesLibres[columna]].ocupadaCasilla=true
            casillasTablero[columna][posicionesLibres[columna]].colorCasilla=color
            posicionesLibres[columna]++
            true
        } else false
    }
}