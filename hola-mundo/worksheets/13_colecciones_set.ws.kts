val listaDeLaCompra = setOf("Harina", "Huevos", "Sal")
val listaDeLaCompra2 = setOf<String>("Harina", "Huevos", "Sal")
val listaDeLaCompraMutable = mutableSetOf("Harina", "Huevos", "Sal")

listaDeLaCompra.size
listaDeLaCompra.count()
listaDeLaCompra.contains("Patatas")
"Patatas" in listaDeLaCompra
listaDeLaCompra.elementAt(1)
listaDeLaCompra.first()
listaDeLaCompra.last()

val listaDeLaCompraOrdenada = listaDeLaCompra.sorted()
listaDeLaCompraOrdenada
listaDeLaCompra.random()
listaDeLaCompraMutable.add("Patatas")
listaDeLaCompraMutable.remove("Harina")
listaDeLaCompraMutable

// listaDeLaCompraMutable.clear()
listaDeLaCompraMutable
listaDeLaCompra

listaDeLaCompra.union(listaDeLaCompraMutable)

setOf(1, 2).equals(setOf(2, 1)) // true porque tiene los mismos elementos



