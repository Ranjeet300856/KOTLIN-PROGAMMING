package org.example

import kotlinx.coroutines.*

fun main() = runBlocking {

    launch {
        delay(1000)
        println("Hello from Coroutine!")
    }

    println("Hello from Main!")
}