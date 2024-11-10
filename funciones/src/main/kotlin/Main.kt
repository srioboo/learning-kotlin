package io.spring.training.boot

import java.time.LocalDateTime
import kotlin.math.PI
import kotlin.math.ceil
import kotlin.math.pow

fun main() {
    println("Comienza la ejecución del programa")
    mostrarFecha()
    saludar("Salva")
    saludar("Ana")
    felicitarCumple("Pedro", 24)
    saludarConDefault()
    saludarConDefault("Ana")
    felicitarCumpleConDefault() // o no se ponen ninguno o los dos
    // para salterme uno tengo que poner el nombre del parametro
    felicitarCumpleConDefault(edad = 29)
    felicitarCumpleConDefault(nombre = "Pedro")
    felicitarCumpleConDefault(edad = 30, nombre = "Salva") // puedo invertilos si pongo el nombre de los parametros

    val area = areaDelCirculo(2.5)
    println("El area es: $area")

    val resultado = cuadrado(5.0)
    println("$resultado")

    val areaRectagulo = calcularAreaRestangulo(0.5, 3.5)

    println(calcularMedia(6.7, 8.9, 3.4))
    println(calcularMedia(6.7, 8.9, 3.4, 5.6, 7.8))
    println(calcularMedia(6.7, 8.9, 3.4, 5.6, 7.8, x="hola"))
    val misValores = doubleArrayOf(2.3, 3.4)
    println(calcularMedia(*misValores, 8.9, 7.0))
}

fun mostrarFecha() {
    val fechaLocal = LocalDateTime.now()
    println("La fecha actual es $fechaLocal")
}

fun saludar(nombre: String) { // esto realmente devuelve un tipo Unit
    println("Hola, $nombre")
}

fun saludarConDefault(nombre: String = "Extraño") {
    println("Hola, $nombre")
}

fun felicitarCumple(nombre: String, edad: Int) {
    println("Felicidades $nombre, cumples $edad años")
}

fun felicitarCumpleConDefault(nombre: String = "Extraño", edad: Int = 28) {
    println("Felicidades $nombre, cumples $edad años")
}

// esta funcion devuelve un docuble
fun areaDelCirculo(radio: Double): Double {
    return PI * radio.pow(radio)
}

// funciones de una expresión
/* fun cuadrado(numero: Double): Double {
    return numero * numero
} */
fun cuadrado(numero: Double) = numero * numero // escrito en una sola linea

// fun mostrarMensaje(mensaje: String) = println(mensaje) // este no se recomienda porque no es claro y no devuelves nada

fun calcularNumeroDeBaldosas(anchoEstancia: Double, largoEstancia: Double, anchoBaldosa: Double, largoBaldosa: Double): Int {
    fun comprobarDimensiones(ancho: Double, largo: Double) {
        if (ancho <= 0 || largo <= 0) {
            throw IllegalArgumentException("No se puede realizar el calculo. Las dimensiones deben ser mayor que 0")
        }
    }
    comprobarDimensiones(anchoBaldosa, largoBaldosa)
    comprobarDimensiones(anchoEstancia, largoEstancia)
    val areaEstancia = calcularAreaRestangulo(anchoEstancia, largoEstancia)
    val areaBaldosa= calcularAreaRestangulo(anchoBaldosa, largoBaldosa)
    return ceil(areaEstancia / areaBaldosa).toInt()
}

fun calcularAreaRestangulo(ancho: Double, largo: Double): Double {
    return ancho * largo
}

// vararg se usa para numero indeterminado de valores
fun calcularMedia(vararg valores: Double): Double {
    var media = 0.0
    for (valor in valores) {
        media = media + valor
    }
    media = media / valores.size
    return media
}

fun calcularMedia(vararg valores: Double, x: String): Double { // vararg es mas comun ponerlo el ultimo
    var media = 0.0
    for (valor in valores) {
        media = media + valor
    }
    media = media / valores.size
    return media
}