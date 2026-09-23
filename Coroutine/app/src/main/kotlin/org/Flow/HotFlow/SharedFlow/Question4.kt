/*
    Question 4 — SharedFlow: emit() vs tryEmit()
    Task:
    Create a Kotlin program that demonstrates the difference between emit() and tryEmit() when working with MutableSharedFlow. 
*/

package org.Flow.HotFlow.SharedFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val numbers = MutableSharedFlow<Int>(replay = 1)
    coroutineScope {
        val collector1 = launch {
            numbers.collect {
                println("Collector Received : $it")
            }
        }

        launch {
            numbers.emit(10)
            numbers.emit(20)
            numbers.emit(30)
        }

        launch {
            delay(3000)
            println("tryEmit(40) Result : ${numbers.tryEmit(40)}")
            println("tryEmit(50) Result : ${numbers.tryEmit(50)}")
            println("tryEmit(60) Result : ${numbers.tryEmit(60)}")

            delay(500)
            collector1.cancel()
        }
    }
}