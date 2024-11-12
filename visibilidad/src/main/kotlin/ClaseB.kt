package paquete1

open class ClaseB() {
    protected val propiedadX = 25
    private val propiedadY = 25

    protected fun miFuncion() {
        val miVariable = propiedadX * 2
    }
    fun miOtraFuncion() {
        miFuncion()
    }

}

fun funcionPrimerNivel() {
    val miObjeto = ClaseB()
    miObjeto.miOtraFuncion()
}

class ClaseD: ClaseB() {
    fun unaFuncion(){
        val unaVariable = propiedadX
        // val otraVariable = propiedadY // es private no puedo acceder
        miFuncion()
    }
}