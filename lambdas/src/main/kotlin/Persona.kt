package io.spring.training.boot

data class Persona(val nombre: String, val edad: Int)

fun encontrarAlMayor(personas: List<Persona>) : Persona {
    var  mayorPersona: Persona = personas[0]
    for (persona in personas) {
        if (persona.edad > mayorPersona.edad) {
            mayorPersona = persona
        }
    }
    return mayorPersona
}

fun main() {
    println("Hello World!")
    val personas = listOf(Persona("Salva", 24), Persona("Marta", 32))
    val mayor = encontrarAlMayor(personas)
    println("La persona de mayor edad de la lista es $mayor")

    // alternativa con funcion de orden superior, las llaves es una expresión landa
    val mayor2 = personas.maxBy { it.edad }
    println("La persona de mayor edad de la lista es $mayor2")

    // una lambda
    val suma = {x: Int, y: Int -> x + y}
    val resultadoSuma = suma(5, 9)
    println(resultadoSuma)

    // trabajar con coleccioens
    var numeros = listOf(1, 6 ,7 ,8 ,9 ,12, 34)
    var nombres = listOf("Salva", "Pedro", "Juan", "Alonso")

    val numerosMayores = numeros.filter {it > 5}
    println(numerosMayores)

    val nombresConN = nombres.filter {it.contains('n')}
    println(nombresConN)

    println(nombres.map {it.toUpperCase()})

    println(nombres.any{it.startsWith('A')})
    println(nombres.all{it.startsWith('A')})
    println(nombres.none{it.startsWith('A')})

    println(nombres.find{it.contains('n')})
    println(nombres.count{it.contains('n')})
}