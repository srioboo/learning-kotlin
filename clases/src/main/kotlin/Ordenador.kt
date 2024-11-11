class Ordenador(val RamGB: Double, val procesador: Procesador) {
    class Procesador(val numeroDeNucleos: Int, val frecuencia: Double) {
        fun mostrarEspecificaciones() {
            println("Numero de nucleos: $numeroDeNucleos, frecuencia: $frecuencia")
        }
    }
}