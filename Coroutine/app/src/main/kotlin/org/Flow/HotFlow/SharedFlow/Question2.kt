/*
    Question 2 — SharedFlow: Replay
    Task:
    Create a Kotlin program using MutableSharedFlow<Int> that demonstrates the behavior of the replay parameter. 
*/

package org.Flow.HotFlow.SharedFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val sharedFlow = MutableSharedFlow<Int>(replay = 2)
    coroutineScope {
        val collector1 = launch {
            sharedFlow.collect {
                println("Collector 1 received : $it")
            }
        }

        val collector2 = launch {
            delay(3000)
            sharedFlow.collect {
                println("Collector 2 received : $it")
            }
        }

        launch {
            sharedFlow.emit(10)
            delay(500)
            sharedFlow.emit(20)
            delay(500)
            sharedFlow.emit(30)
            delay(500)

            collector1.cancel()
            delay(3000)
            collector2.cancel()
        }
    }
}