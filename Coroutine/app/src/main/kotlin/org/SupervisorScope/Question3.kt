/*
    Question 3 — Handling Independent Task Results

    Write a Kotlin program using supervisorScope that launches three independent async coroutines representing:
    User Profile
    User Orders
    User Recommendations 
*/

package org.SupervisorScope
import kotlinx.coroutines.*
suspend fun main()
{
    supervisorScope {
        val userProfile = async {
            delay(1000)
            "Profile Loaded"
        }

        val userOrders = async {
            delay(2000)
            throw Exception("Order Failed!")
        }

        val userRecom = async {
            delay(3000)
            "Recommendations Loaded"
        }

        println("User Profile Result : ${userProfile.await()}")
        println("User Recom. Result  : ${userRecom.await()}")
        println("User Orders Result  : ${userOrders.await()}")
    }
}