/*
    Question 10 — SharedFlow: Basic Replay
    Task:
    Create a Kotlin program using MutableSharedFlow<String> that demonstrates the basic behavior of the replay parameter. 
*/

package org.Flow.HotFlow.SharedFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val sharedFlow = MutableSharedFlow<String>(replay = 1)
    coroutineScope {
        sharedFlow.emit("First Event")
        val collector = launch {
            sharedFlow.collect {
                println("Collector Receive : $it")
            }
        }

        delay(500)
        sharedFlow.emit("Second Event")
        sharedFlow.cancel()
    }
}