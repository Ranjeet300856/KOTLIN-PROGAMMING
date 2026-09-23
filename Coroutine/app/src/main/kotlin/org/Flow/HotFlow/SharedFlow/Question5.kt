/*
    Question 5 — SharedFlow: asSharedFlow() & Read-Only Exposure
    Task:
    Create a Kotlin program that demonstrates how MutableSharedFlow can be kept private while exposing only a read-only SharedFlow to the outside. 
*/

package org.Flow.HotFlow.SharedFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

class EventManager {
    private val _events = MutableSharedFlow<String>()
    val events: SharedFlow<String> = _events.asSharedFlow()

    suspend fun sendEvents(event: String) {
        _events.emit(event)
    }
}

suspend fun main()
{
    val eventManager = EventManager()
    coroutineScope {
        val collector1 = launch {
            eventManager.events.collect {
                println("Collector 1 : $it")
            }
        }

        val collector2 = launch {
            eventManager.events.collect {
                println("Collector 2 : $it")
            }
        }

        launch {
            eventManager.sendEvents("Login Successful")
            eventManager.sendEvents("Data Updated")
            eventManager.sendEvents("Logout")
            collector1.cancel()
            collector2.cancel()
        }
    }
}