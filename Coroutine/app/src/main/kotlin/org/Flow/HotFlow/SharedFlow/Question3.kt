/*
    Question 3 — SharedFlow: replayCache
    Task:
    Create a Kotlin program using MutableSharedFlow<Int> that demonstrates how to inspect the values currently stored in the replay cache. 
*/

package org.Flow.HotFlow.SharedFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val sharedFlow = MutableSharedFlow<Int>(replay = 3)
    var x = 10  
    coroutineScope {
        coroutineScope {
            launch {
            for(i in 1..5) {
                sharedFlow.emit(x)
                x += 10
            }

            println("Replay Cache : ${sharedFlow.replayCache}")
        }
        }

        val collector1 = launch {
            delay(1000)
            sharedFlow.collect {
                println("Collector Received : $it")
            }
        }

        delay(2000)
        collector1.cancel()
    } 
}