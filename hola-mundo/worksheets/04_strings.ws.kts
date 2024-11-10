var nombre = "Manuel"
var apellido = "Garcia"

var nombreCompleto = nombre + " " + apellido
println(nombreCompleto)

nombre[3]
nombre.length
var nombreEnMayusculas = nombre.toUpperCase()

nombreCompleto.contains(nombre)

// string templates
println("Mi nombre es " + nombre + " y mi apellido es " + apellido)
// con plantilla
println("Mi nombre es $nombre y mi apellido es $apellido")

var edad = 25
println("${if (edad >=18) "Si" else "No"} soy mayor de edad")


