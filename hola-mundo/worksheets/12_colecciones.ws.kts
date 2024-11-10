val nombres = listOf("Ana", "Sara", "Juan", "Lara", "Alejandro", "Juan")
val edades = mutableListOf(19, 22, 34, 56, 70, 23, 12, 23)

nombres[0]
edades.get(0)
nombres.indexOf("Sara")
nombres.indexOf("Juan")
nombres.count()
nombres.size

edades.last()
edades.contains(22)
22 in edades

val edadesOrdenadas = edades.sorted()
edadesOrdenadas

val nombresOrdenados = nombres.sorted()
nombresOrdenados
edades

edades.max()
edades.sum()

edades.average()

edades[2] = 24
edades
edades[2] = 24
edades

edades.add(38)
edades
edades.add(2, 38)
edades
edades.remove(23)
edades.removeAt(0)
edades
// nombres.remove("Ana") // no permitido

