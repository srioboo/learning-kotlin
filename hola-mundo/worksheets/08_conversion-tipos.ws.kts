var miShort: Short = 5

var miInt: Int = miShort.toInt()

val miLong: Long = 300_000_000
val miOtroInt: Int = miLong.toInt()
println(miOtroInt)

// si el rango sale de ranto se produce un desbordamiento
val miLong2: Long = 3_000_000_000
val miOtroInt2: Int = miLong2.toInt()
println(miOtroInt2)

val miDouble = 5.2
val miOtroShort: Short = miDouble.toShort()
println(miOtroShort)

val edad = "28"
val edadNumerica = edad.toInt()
println(edadNumerica)


