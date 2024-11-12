package io.spring.training.boot

fun main() {
    // esto no es seguro porque 5 podría ser 5.5 y eso da un error
    val numero: Number = 5
    val entero: Int = numero as Int
    println(entero)

    // operacion seguro de conversion
    val numero2: Number = 5.5
    val entero2: Int? = numero2 as? Int
    println(entero2)
}