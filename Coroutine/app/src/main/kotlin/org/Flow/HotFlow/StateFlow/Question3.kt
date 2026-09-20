/*
    Question 3 — StateFlow: Multiple Collectors
    Task:
    Create a Kotlin program that demonstrates how multiple collectors can observe the same MutableStateFlow. 
*/

package org.Flow.HotFlow.StateFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val x = MutableStateFlow(0)
    coroutineScope {
        val collector1 = launch {
            x.collect {
                println("\nCollector 1 : $it")
            }
        }

        val collector2 = launch {
            x.collect {
                println("Collector 2 : $it")
            }
        }

        launch {
            for(i in 1..3) {
                delay(100)
                x.value += 10
            }

            collector1.cancel()
            collector2.cancel()
        }
    }
}