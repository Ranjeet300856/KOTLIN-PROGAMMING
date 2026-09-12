/*
    Question 4 — Independent async Tasks with Partial Success

    Write a Kotlin program using supervisorScope that fetches data from four independent services using async:
    User Profile Service
    Order Service
    Recommendation Service
    Notification Service 
*/

package org.SupervisorScope
import kotlinx.coroutines.*
suspend fun main()
{
    supervisorScope {
        val userProfileService = async {
            delay(1000)
            "User Profile Services"
        }

        val orderService = async {
            delay(2000)
            throw Exception("Order Failed!")
        }

        val recommendationService = async {
            delay(3000)
            "Recommendation Services"
        }

        val notificationService = async {
            delay(4000)
            throw Exception("Notification Service Failed!")
        }

        try {
            println("${userProfileService.await()}")
            println("${recommendationService.await()}")
            println("${orderService.await()}")
            println("${notificationService.await()}")
        } catch(e: Exception) {
            println(e.message)
        }
    }
}