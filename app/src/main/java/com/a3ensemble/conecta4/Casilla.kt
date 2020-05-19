package com.a3ensemble.conecta4

class Casilla(color:String? = "no", ocupada:Boolean = false) {
    var colorCasilla:String? = color
    var ocupadaCasilla = ocupada

    override fun toString(): String {
        return "Color: $colorCasilla \nOcupada: $ocupadaCasilla"
    }
}