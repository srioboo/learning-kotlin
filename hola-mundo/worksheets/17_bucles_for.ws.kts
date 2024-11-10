for (i in 1..100) {
    println(i)
}

val animales = arrayOf("perro", "gato", "elefante")
for (animal in animales) {
    println("$animal tiene ${animal.length} letras")
}

for (indice in animales.indices) {
    if (indice % 2 == 0) {
        println(animales.get(indice))
    }
}

for ((indice, valor) in animales.withIndex()) {
    if (indice % 2 == 0) {
        println(valor)
    }
}

val nombre = "Maria"
var numeroDeAes = 0
for (letra in nombre) {
    if (letra.equals('a')) numeroDeAes++
}
println("El nunmero de aes es $numeroDeAes")
