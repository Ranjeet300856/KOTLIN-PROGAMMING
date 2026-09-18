/*
    Question 4 — Intermediate: Cold Flow with Multiple Collectors
    Goal: Understand one of the most important properties of a Cold Flow — each collector gets a new execution of the Flow. 
*/

package org.Flow.ColdFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.*

suspend fun main()
{
    val users = flow {
        println("Fetching user data...")
        delay(1000)
        emit("Alice")
        delay(500)
        emit("Bob")
        delay(500)
        emit("Charlie")
    }

    users.collect {
        user ->
        println("Collector 1 -> User : $user")
    }

    println()
    users.collect {
        user ->
        println("Collector 2 -> User : $user")
    }
}