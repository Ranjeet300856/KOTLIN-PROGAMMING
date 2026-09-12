/*
    Question 5 — Exception Handling with supervisorScope

    Write a Kotlin program using supervisorScope that launches four independent async tasks representing:
    User Profile Service
    Order Service
    Recommendation Service
    Notification Service 
*/

package org.SupervisorScope
import kotlinx.coroutines.*

suspend fun printData(str: Deferred<String>)
{
    try {
        println("${str.await()}")
    } catch(e: Exception) {
        println(e.message)
    }
}

suspend fun main()
{
    supervisorScope {
        val userProfileService = async {
            delay(1000)
            "User Profile Service -> SUCCESS"
        }

        val orderService = async {
            delay(2000)
            throw Exception("Order Service -> FAILED")
        }

        val recommendationService = async {
            delay(3000)
            "Recommendation Service -> SUCCESS"
        }

        val notificationService = async {
            delay(4000)
            throw Exception("Notification Service -> FAILED")
        }

        printData(userProfileService)
        printData(orderService)
        printData(recommendationService)
        printData(notificationService)
    }

    println("All services have been processed")
}