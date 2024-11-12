package io.spring.training.boot

fun main() {
    /* val miAnimal = Animal()
    miAnimal.dormir()

    val miPerro = Perro()
    miPerro.dormir()
    miPerro.ladrar()*/
    val miGato = Gato(8)
    println("Mi gato es de tipo ${miGato.tipo} y tiene ${miGato.edad} años")
    miGato.comer()

    val miPerro = Perro(5)
    println("Mi perro es de tipo ${miPerro.tipo} y tiene ${miPerro.edad} años")
    miPerro.comer()
}