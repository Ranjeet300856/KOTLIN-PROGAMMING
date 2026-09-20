/*
    Question 8 — StateFlow: Filtering State Changes
    Task:
    Create a Kotlin program that uses MutableStateFlow<Int> to manage a counter and demonstrates how to observe only specific state changes. 
*/

package org.Flow.HotFlow.StateFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val counter = MutableStateFlow(0)
    coroutineScope {
        val collector = launch {
            counter.filter {
                it % 2  == 0
            } . collect {
                println("Even State : $it")
            }
        }

        launch {
            for(i in 1..10) {
                delay(500)
                counter.value += 1
            }

            collector.cancel()
        }
    }
}