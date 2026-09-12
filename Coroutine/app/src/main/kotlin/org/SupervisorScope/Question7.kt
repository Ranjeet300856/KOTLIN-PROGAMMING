/*
    Question 7 — SupervisorScope with CoroutineExceptionHandler

    Problem Statement
    Write a Kotlin program using supervisorScope that launches three independent launch coroutines representing:
    Payment Service
    Email Service
    Logging Service 
*/

package org.SupervisorScope
import kotlinx.coroutines.*
suspend fun main()
{
    val handler = CoroutineExceptionHandler {
        _, exception ->
        println(exception.message)
    }

    supervisorScope {
        launch(handler) {
            println("Payment Service Started")
            delay(1000)
            throw Exception("Payment Service → FAILED: Payment Processing Failed")
        }

        launch {
            println("Email Service Started")
            delay(2000)
            println("Email Service → SUCCESS")
        }

        launch {
            println("Logging Service Started")
            delay(3000)
            println("Logging Service → SUCCESS")
        }
    }

    println("All payment-related tasks have finished")
}