// pueden tener tipos variables
var miArray  = arrayOf(25, "perro", 'a', 22.2, true)

// para limitar los tipos
var miArrayDeInt = arrayOf<Int>(5, 6, 7)

// de una forma más eficiente
var miArrayDeIntAtl = intArrayOf(5, 6, 7)

// operaciones con arrays
miArrayDeInt[2]
miArrayDeInt.get(2)

miArrayDeInt[2] = 96
miArrayDeInt[2]
miArrayDeInt.set(2, 23)
miArrayDeInt[2]

miArrayDeInt.size

miArrayDeInt.contains(25)
miArrayDeInt.contains(5)

miArrayDeInt.indexOf(5)
miArrayDeInt.indexOf(25)


