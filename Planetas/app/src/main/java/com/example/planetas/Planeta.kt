package com.example.planetas

class Planeta(
    val nombre: String,
    val masa: Double,
    val radio: Double,
    val distanciaSol: Int,
    val tipo: TipoPlaneta,
    val gravedad: Double,
) {


    override fun toString(): String {
        return "Planeta(nombre='$nombre', masa=$, radio=$radio, distanciaAlSol=$distanciaSol, tipo=$tipo, gravedad=$gravedad)"
    }
}

enum class TipoPlaneta {
    Rocoso, Gaseoso, Helado
}

