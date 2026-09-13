//Write a Kotlin program using coroutineScope {} to simulate fetching data from two independent sources
package org.coroutineScope
import kotlinx.coroutines.*
suspend fun fetchUserProfile(): String
{
    delay(1000)
    return "User Profile Data"
}

suspend fun fetchUserOrders(): String
{
    delay(2000)
    return "User Orders Data"
}

suspend fun loadUserData()
{
    coroutineScope {
        val result1 = async {
            fetchUserProfile()
        }

        val result2 = async {
            fetchUserOrders()
        }

        println("User Profile : ${result1.await()}")
        println("User Orders  : ${result2.await()}")
    }


    println("User data loaded successfully")
}

suspend fun main()
{
    loadUserData()
}