/*
    Question 8 — SharedFlow: Basic Event Emission
    Task:
    Create a Kotlin program using MutableSharedFlow<String> that demonstrates basic event emission and collection. 
*/

package org.Flow.HotFlow.SharedFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val sharedFlow = MutableSharedFlow<String>()
    coroutineScope {
        val collector = launch {
            sharedFlow.collect {
            println("Received : $it")
        }
        }

        delay(500)
        sharedFlow.emit("Hello")
        delay(500)
        sharedFlow.emit("Welcome")
        delay(500)
        sharedFlow.emit("GoodBye")

        delay(2000)
        collector.cancel()
    }
}