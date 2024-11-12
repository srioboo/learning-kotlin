val nombre: String? = null // "Ana" // puedes ser nulable
val apellido = "Garcia"

// nombre.toUpperCase() // esto da un error
var nombreEnMayuscula = nombre?.toUpperCase()
println(nombreEnMayuscula)

var nombreEnMayuscula2 = nombre?.toUpperCase()?: "Extraño"
println(nombreEnMayuscula2)

apellido.toUpperCase()

//// Comprobar tipos
val dia: Any = "lunes"
dia is String
dia is Int
dia !is Int

//// conversion tipos inteligentes
fun mostrarLongitud(x: Any) {
    if (x !is String) return
    if (x is String) {
        println("El string $x tiene una longitud de ${x.length}")
    }
}
mostrarLongitud("x")
mostrarLongitud(6)

if (dia is String && dia.length > 3) {
    println("Es correcto")
}