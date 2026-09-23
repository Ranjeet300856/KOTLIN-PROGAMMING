/*
    Question 1 — Basic SharedFlow: Event Broadcasting
    Task:
    Create a Kotlin program using MutableSharedFlow<Int>
    that demonstrates how a single SharedFlow can broadcast emitted values to multiple collectors. 
*/

package org.Flow.HotFlow.SharedFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val sharedFlow = MutableSharedFlow<Int>()
    coroutineScope {
        val collector1 = launch {
            sharedFlow.collect {
                println("Collector 1 received: $it")
            }
        }

        val collector2 = launch {
            sharedFlow.collect {
                println("Collector 2 received: $it")
            }
        }

        launch {
            delay(500)
            sharedFlow.emit(10)
            delay(500)
            sharedFlow.emit(20)
            delay(500)
            sharedFlow.emit(30)
            delay(500)

            collector1.cancel()
            collector2.cancel()
        }
    }
}