/*
    Question 6 — Partial Success Dashboard

    Write a Kotlin program using supervisorScope to simulate loading data for a Dashboard from multiple independent services.
    Services
    Profile Service
    Orders Service
    Messages Service
    Recommendations Service
    Weather Service 
*/

package org.SupervisorScope
import kotlinx.coroutines.*

suspend fun processData(serviceName: String, deferredData: Deferred<String>)
{
    try {
        println("$serviceName -> ${deferredData.await()}")
    } catch(e: Exception) {
        println("$serviceName -> ${e.message}")
    }
}

suspend fun main() 
{
    supervisorScope {
        val profileService = async {
            delay(500)
            "SUCCESS: Profile Loaded"
        }

        val orderService = async {
            delay(1000)
            throw Exception("FAILED: Order Service Unavailable")
        }

        val messageService = async {
            delay(1500)
            "SUCCESS: Messages Loaded"
        }

        val recommendationService = async {
            delay(2000)
            throw Exception("FAILED: Recommendation API Failed")
        }

        val weatherService = async {
            delay(2500)
            "SUCCESS: Weather Loaded"
        }

        processData("Profile Service" ,profileService)
        processData("Order Service" ,orderService)
        processData("Message Service" ,messageService)
        processData("Recommendation Service" ,recommendationService)
        processData("Weather Service" ,weatherService)
    }

    println("Dashboard Loading Completed")
}