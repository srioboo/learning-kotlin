package io.spring.training.boot

class Rectangulo2(var ancho: Double, var alto: Double, val grosor: Int = 1) {

    constructor(rectangulo: Rectangulo2): this(rectangulo.ancho, rectangulo.alto, rectangulo.grosor)
    init {
        if(ancho < 0 || alto < 0) {
            throw IllegalArgumentException("El ancho y el alto no pueden ser negativos")
        }
    }

    fun obtenerArea() = ancho * alto
}