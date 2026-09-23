/*
    Question 6 — SharedFlow: Event Broadcasting with replay
    Task:
    Create a Kotlin program that demonstrates how replay allows a new collector to receive previously emitted events. 
*/

package org.Flow.HotFlow.SharedFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val sharedFlow = MutableSharedFlow<String>(replay = 2)
    coroutineScope {
        val collector1 = launch {
            sharedFlow.collect {
                println("Collector 1 received : $it")
            }
        }

        launch {
            sharedFlow.emit("Event A")
            sharedFlow.emit("Event B")
            sharedFlow.emit("Event C")
        }

        val collector2 = launch {
            delay(2000)
            sharedFlow.collect {
                println("Collector 2 received : $it")
            }
        }

        delay(2500)
        sharedFlow.emit("Event D")
        collector1.cancel()
        collector2.cancel()
    }
}