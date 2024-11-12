package paquete1

import paquete2.ClaseC

class ClaseA() {
    val propiedadX = 25

    fun miFuncion() {
        val miObjetoB = ClaseB()
        // miObjetoB.miFuncion() // este no se permite el acceso

        val miObjetoC = ClaseC()
        miObjetoC.propiedadX
        miObjetoC.miFuncion()
    }
}