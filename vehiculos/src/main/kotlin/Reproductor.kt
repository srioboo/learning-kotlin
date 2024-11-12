package io.spring.training.boot

interface Reproductor {
    fun play(cancion: String) {
        println("Reproducir cancion $cancion")
    }
    fun stop()
    fun pause()
}