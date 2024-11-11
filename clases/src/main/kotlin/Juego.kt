class Juego() {
    var puntuacion = 0

    inner class Marcador() { // inner hace se pueda acceder a ls propiedades de la clase padre
        fun  incrementar(puntos: Int) {
            puntuacion = puntuacion + puntos
        }
        fun decrementar(puntos: Int) {
            puntuacion = puntuacion - puntos
        }
    }
}