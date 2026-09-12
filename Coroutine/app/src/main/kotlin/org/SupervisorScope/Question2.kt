/*
    Question 2 — SupervisorScope with Different Completion Times

    Write a Kotlin program using supervisorScope that launches three independent child coroutines using launch:
    Database Sync
    Remote API Sync
    Cache Refresh 
*/

package org.SupervisorScope
import kotlinx.coroutines.*
suspend fun main() 
{
    supervisorScope {
        val databaseSync = launch {
            println("Database Sync Started")
            delay(3000)
            println("Database Sync Completed")
        }

        val remoteAPISync = launch {
            println("Remote API Sync Started")
            delay(1000)
            throw Exception("Remote API Sync Failed")
        }

        val cacheRefresh = launch {
            println("Cache Refresh Started")
            delay(2000)
            println("Cache Refresh Completed")
        }
    }

    println("All synchronization tasks have finished")
}