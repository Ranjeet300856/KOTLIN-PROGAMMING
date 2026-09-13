/* 
    Write a Kotlin program that demonstrates the difference between coroutineScope {} and supervisorScope {} 
    when one child coroutine throws an exception.
*/

package org.coroutineScope
import kotlinx.coroutines.*

suspend fun runWithCoroutineScope()
{
    coroutineScope {
        launch {
            delay(500)
            println("Task 1 completed")
        }

        launch {
            delay(1000)
            throw Exception("Taks 2 Failed")
        }

        launch {
            try {
                for(i in 1..10) {
                    delay(500)
                    println("Taks 3 Working...$i")
                }
            } finally {
                println("Task 3 Executed")
            }
        }
    }
}

suspend fun runWithSupervisorScope()
{
    var handler = CoroutineExceptionHandler {
        _, exception ->
        println(exception.message)
    }

    supervisorScope {
        launch {
            delay(500)
            println("Task 1 completed")
        }

        launch(handler) {
            delay(1000)
            throw Exception("Taks 2 Failed")
        }

        launch {
            try {
                for(i in 1..10) {
                    delay(500)
                    println("Taks 3 Working...$i")
                }
            } finally {
                println("Task 3 Executed")
            }
        }
    }
}

suspend fun main()
{
    println("===== coroutineScope =====")
    try {
        runWithCoroutineScope()
    } catch(e: Exception) {
        println(e.message)
    }

    println("\n===== supervisorScope =====")
    runWithSupervisorScope()
}