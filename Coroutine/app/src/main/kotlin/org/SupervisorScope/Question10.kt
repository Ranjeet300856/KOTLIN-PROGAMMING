/*
    Question 10 — Real-World Service Dashboard 
    Write a Kotlin program using supervisorScope + async/await that simulates a real-world dashboard loading data from 6 independent services. 
*/

package org.SupervisorScope
import kotlinx.coroutines.*

suspend fun processService(serviceName: String, serviceData: Deferred<String>)
{
    try {
        println("$serviceName -> ${serviceData.await()}")
    } catch(e: Exception) {
        println("$serviceName -> ${e.message}")
    }
}

suspend fun main()
{
    supervisorScope {
        val userProfileService = async {
            delay(1000)
            "User Profile Service Success"
        }

        val orderService = async {
            delay(2000)
            throw Exception("Order Service Failed")
        }

        val messageService = async {
            delay(3000)
            "Message Service Success"
        }

        val recomService = async {
            delay(4000)
            throw Exception("Recom. Service Failed")
        }

        val weatherService = async {
            delay(5000)
            "Weather Service Success"
        }

        val notificationService = async {
            delay(6000)
            "Notification Service Success"
        }

        processService("User Profile Service", userProfileService)
        processService("Order Service", orderService)
        processService("Message Service", messageService)
        processService("Recom. Service", recomService)
        processService("Weather Service", weatherService)
        processService("Notification Service", notificationService)
    }

    println("Dashboard Loading Completed")
}