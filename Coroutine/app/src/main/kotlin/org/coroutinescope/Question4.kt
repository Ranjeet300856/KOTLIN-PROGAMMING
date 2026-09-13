/*
    Write a Kotlin program using coroutineScope {} to demonstrate cancellation
    propagation from a parent coroutine to its child coroutines.

    The parent coroutine should be cancelled after approximately 1.2 seconds.
    Cancellation should propagate from the parent to both child coroutines.
*/

package org.coroutineScope
import kotlinx.coroutines.*
suspend fun performTasks() {
    coroutineScope {
        launch {
            try {
                for (i in 1..10) {
                    delay(500)
                    println("Task 1 : Working")
                }
            } finally {
                println("Task 1 : Cancelled")
            }
        }

        launch {
            try {
                for (i in 1..15) {
                    delay(500)
                    println("Task 2 : Working")
                }
            } finally {
                println("Task 2 : Cancelled")
            }
        }
    }
}

suspend fun main() {
    coroutineScope {
        val parentJob = launch {
            performTasks()
        }

        delay(1200)
        parentJob.cancelAndJoin()
        println("Parent coroutine cancelled")
    }
}