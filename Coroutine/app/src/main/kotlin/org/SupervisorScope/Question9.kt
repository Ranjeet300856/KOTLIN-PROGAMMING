/*
    Question 9 — supervisorScope vs coroutineScope
    Write a Kotlin program that demonstrates the difference between coroutineScope and supervisorScope when one child coroutine fails. 
*/

package org.SupervisorScope
import kotlinx.coroutines.*

suspend fun runWithCoroutineScope() 
{
    coroutineScope {
        launch {
            try {
                delay(1000)
                println("Task A in Coroutine Scope")
            } finally {
                println("Task A in Coroutine Scope Completed")
            }
        }

        launch {
            try {
                delay(2000)
                throw Exception("Error in Task B in Coroutine Scope")
            } finally {
                println("Task B in Coroutine Scope Finally Block Executed")
            }
        }

        launch {
            try {
                delay(3000)
                println("Task C in Coroutine Scope")
            } finally {
                println("Task C in Coroutine Scope Cancelled")
            }
        }
    }
}

suspend fun runWithSupervisorScope()
{
    var handler = CoroutineExceptionHandler {_, exception ->
        println(exception.message)
    }
    supervisorScope {
        launch {
            try {
                delay(1000)
                println("Task A in Supervisor Scope") 
            } finally {
                println("Task A in Supervisor Scope Completed")
            }
        }

        launch(handler) {
            try {
                delay(2000)
                throw Exception("Error in Task B in Supervisor Scope")
            } finally {
                println("Task B in Supervisor Scope Finally Block Executed")
            }
        }

        launch {
            try {
                delay(3000)
                println("Task C in Supervisor Scope")
            }
         finally {
            println("Task C in Supervisor Scope Completed")
        }
    }
    }
}

suspend fun main() 
{
    try {
        runWithCoroutineScope()
    } catch(e: Exception) {
        println(e.message)
    }

    println()
    runWithSupervisorScope()
}