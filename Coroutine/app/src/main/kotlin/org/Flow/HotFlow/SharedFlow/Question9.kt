/*
    Question 9 — SharedFlow: Multiple Collectors
    Task:
    Create a Kotlin program using MutableSharedFlow<String> that demonstrates how multiple collectors receive the same emitted events. 
*/

package org.Flow.HotFlow.SharedFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val sharedFlow = MutableSharedFlow<String>()
    coroutineScope {
        val collector1 = launch {
            sharedFlow.collect {
                println("Collector 1 : $it")
            }
        }

        val collector2 = launch {
            sharedFlow.collect {
                println("Collector 2 : $it")
            }
        }

        delay(500)
        sharedFlow.emit("Event 1")
        delay(500)
        sharedFlow.emit("Event 2")
        delay(500)
        collector1.cancel()
        collector2.cancel()
    }
}