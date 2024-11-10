var listX = listOf(8, 9 ,6, 2 , 5)
var listY = listOf(5, 3 , 6, 7, 9)

for (x in listX) {
    for (y in listY) {
        if (x == y) {
            println("$x esta en ambas")
            break
        }
    }
}

bucle_externo@for (x in listX) {
    for (y in listY) {
        if (x == y) {
            println("Al menos hay un numero repetido")
            break@bucle_externo
        }
    }
}

val frase = "el numero es un pañuelo"

for (ch in frase)  {
    if (ch == ' ') continue
    print(ch)
}
