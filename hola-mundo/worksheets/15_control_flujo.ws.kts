var edad = 25
var esMayor: Boolean = false

if (edad >= 18) {
    esMayor = true
    println("Mayor de edad")
} else {
    println("Menor de edad")
}

var esMenor = if (edad >= 18) {
    false
} else {
    true
}
println(esMayor)

//
val precio: Double
if (edad < 5) {
    precio = 0.0
} else if (edad < 12) {
    precio = 0.5
} else {
    precio = 0.75
}
