package org.example

import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Main Started")

    launch {
        delay(1000)
        println("Coroutine Executed")
    }

    println("Main Ended")
}