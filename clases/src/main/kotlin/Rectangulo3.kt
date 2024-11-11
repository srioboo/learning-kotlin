package io.spring.training.boot

class Rectangulo3(val ancho: Double, var alto: Double) {

    val esCuadrado: Boolean
    get() = ancho == alto

    var grosor: Int = 1
    set(value) {
        if (value <= 0) {
            throw IllegalArgumentException("El grosor no puede ser menor o igual a 0")
        }
        field = value // field es una palabra reservada
    }

    fun obtenerArea() = ancho * alto
}