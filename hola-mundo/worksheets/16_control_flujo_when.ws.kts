// reemplaza a switch
val mes = "enero"
var numeroDeDias = 0
when(mes) {
    "enero", "marzo", "julio" -> numeroDeDias = 31
    "febrero" -> numeroDeDias = 28
    else -> numeroDeDias = -1
}

println("El mes $mes tiene $numeroDeDias dias")

var diasDelMes = when(mes) {
    "enero", "marzo", "julio" ->  31
    "febrero" -> 28
    else -> -1
}
println("El mes $mes tiene $diasDelMes dias")

val edad = 16
when(edad){
    in 0..2 -> println("Es un niño")
    in 2..18 -> println("Es un niño")
    else -> println("Es un anciano")
}
