package io.spring.training.boot

import kotlin.math.PI

abstract class Forma(var x: Int, var y: Int) { // abstract es heredablen o hace falta especificar open
    abstract fun obtenerArea(): Double
    abstract fun obtenerPerimetro(): Double
    fun trasladar(movimientoX: Int, movimientoY: Int) {
        x = x + movimientoX
        y = y + movimientoY
    }
}

class Rectangulo(val ancho: Double, val alto: Double): Forma() {
    override fun obtenerArea() = ancho * alto
    override fun obtenerPerimetro() = 2 * ancho + 2 * alto
}

class Circulo(val radio: Double): Forma() {
    override fun obtenerArea() = PI * radio * radio
    override fun obtenerPerimetro() = 2 * PI * radio
}