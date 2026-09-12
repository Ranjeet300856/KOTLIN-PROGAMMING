/*
    Write a Kotlin program using supervisorScope that launches three child coroutines representing three independent tasks:
    User Profile Loading
    Posts Loading
    Notifications Loading 
*/

package org.SupervisorScope
import kotlinx.coroutines.*
suspend fun main()
{
    supervisorScope {
        launch {
            println("User Profile Loading Started")
            delay(2000)
            println("User Profile Loading Completed")
        }

        launch {
            println("Posts Loading Started")
            delay(2000)
            println("Posts Loading Completed")
        }

        launch {
            println("Notifications Loading Started")
            throw Exception("Notifications Loading Failed")
        }
    }

    println("All tasks inside supervisorScope have finished")
}