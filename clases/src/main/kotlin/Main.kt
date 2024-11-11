package io.spring.training.boot

import Juego
import Ordenador
import segundo
import tercero

fun main() {
    var miRectangulo = Rectangulo()

    println("miRectangulo tien un ancho de ${miRectangulo.ancho} y un alto de ${miRectangulo.alto}")
    miRectangulo.ancho = 2.0
    miRectangulo.alto = 3.0

    println("miRectangulo tien un ancho de ${miRectangulo.ancho} y un alto de ${miRectangulo.alto}")
    val area = miRectangulo.obtenerArea()
    println("El area de miRectagulo es $area")

    // Rectangulo2 contructores
    var miRectangulo2 = Rectangulo2(5.5, 6.3)

    var miRectangulo3 = Rectangulo3(3.4, 7.8)
    miRectangulo3.alto = 9.0
    // miRectangulo3.ancho = 8.0 al serv ancho de tipo val no puedo reasignar

    println(miRectangulo3.esCuadrado)

    val miDireccion = Direccion("Mayora", 28, 23456, "Madríd")
    println(miDireccion.toString())

    val miDireccion2 = Direccion("Mayora", 28, 23456, "Madríd")
    println("Es miDirección = a miDireccion2 -> ${miDireccion.equals(miDireccion2)}")

    val miDireccion3 = miDireccion.copy(numero = 33)
    println(miDireccion3.toString())

    var colorSalmon = Color.SALMON.hex
    println(DiasDeLaSemana.LUNES.ordinal)
    println(DiasDeLaSemana.LUNES.name)

    for (dia in DiasDeLaSemana.values()) {
        println(dia.name)
    }
    println(DiasDeLaSemana.valueOf("LUNES"))
    println(DiasDeLaSemana.LUNES < DiasDeLaSemana.MARTES)

    // Extender
    val nombre = "Salva"
    val primerCaracter = nombre.first()
    val segundoCaracter = nombre.segundo()

    val tercerCaracter = nombre.tercero

    val miProcesador = Ordenador.Procesador(4, 2.5)
    miProcesador.mostrarEspecificaciones()

    val miJuego = Juego()
    val miMarcador = miJuego.Marcador()
    miMarcador.incrementar(20)
    println("La puntuacion del juego es ${miJuego.puntuacion}")
}