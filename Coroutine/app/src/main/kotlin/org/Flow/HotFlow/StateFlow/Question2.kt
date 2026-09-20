/*
    Question 2 — StateFlow: Updating and Observing Current State
    Task:
    Create a Kotlin program that uses MutableStateFlow<Int> to manage a counter and demonstrates how its current state can be accessed and observed. 
*/

package org.Flow.HotFlow.StateFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val count = MutableStateFlow(0)
    println("Initial Value : ${count.value}")
    coroutineScope {
        val collector = launch {
            count.collect {
                println("State Updated : $it")
            }
        }

        launch {
            for(i in 1..5) {
                delay(100)
                count.value += 10
            }

            collector.cancel()
        }
    }

    println("Final Value : ${count.value}")
}