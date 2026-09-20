/*
    Question 1 — Basic StateFlow: Counter State
    Task:
    Create a Kotlin program that uses MutableStateFlow<Int> to manage a counter. 
*/

package org.Flow.HotFlow.StateFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main() 
{
    val count = MutableStateFlow(0)
    coroutineScope {
        val collector = launch {
            count.collect {
                println(it)
            }
        }

        launch {
            for(i in 1..5) {
                delay(100)
                count.value = i
            }

            collector.cancel()
        }
    }
}