/*
    Question 7 — SharedFlow: subscriptionCount

    Task:
    Create a Kotlin program using MutableSharedFlow<Int> 
    that demonstrates how subscriptionCount can be used to observe the number of active collectors. 
*/

package org.Flow.HotFlow.SharedFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val numbers = MutableSharedFlow<Int>()
    coroutineScope {
        val subscriptionMonitor = launch {
            numbers.subscriptionCount.collect {
                println("Active collectors : $it")
            }
        }

        val collector1 = launch {
            numbers.collect {
                println("Collector 1 received : $it")
            }
        }

        numbers.subscriptionCount.first { it == 1 }

        val collector2 = launch {
            numbers.collect {
                println("Collector 2 received : $it")
            }
        }

        numbers.subscriptionCount.first { it == 2 }

        numbers.emit(10)
        collector1.cancel()
        numbers.subscriptionCount.first { it == 1 }
        collector2.cancel()
        numbers.subscriptionCount.first { it == 0 }
        subscriptionMonitor.cancel()
    }
}