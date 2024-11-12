package io.spring.training.boot

open class Animal(val edad: Int, val tipo: TipoDeAnimal) { // open indica que esta clase se usa para heredar de ella
    init {
        println("Inicialización de animal")
    }
    fun dormir(){
        println("Estoy durmiendo")
    }
    open fun comer() { // hay que indicarla como open para que estén abiertas a sobreescritura
        println("Estoy comiendo")
    }
}

class Gato(edad: Int): Animal(edad, TipoDeAnimal.VERTEBRADO) { // hereda de animal
    init {
        println("Inicializacion de gato")
    }
    override fun comer(){ // sobreescribimos comer, la función debe estar abierta a sobreescritura (open)
        println("Estoy comiendo sardina")
    }
    fun maullar() {
        println("miau")
    }
}
class Perro(edad: Int): Animal(edad, TipoDeAnimal.VERTEBRADO) {
    fun ladrar() {
        println("guau")
    }
}
class Ave(edad: Int): Animal(edad, TipoDeAnimal.VERTEBRADO) {
    fun volar() {
        println("Estoy volando")
    }
}