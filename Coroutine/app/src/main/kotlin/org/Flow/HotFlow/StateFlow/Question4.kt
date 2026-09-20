/*
    Question 4 — StateFlow: Read-Only StateFlow
    Task:
    Create a Kotlin program that demonstrates the difference between MutableStateFlow and StateFlow 
    by keeping the mutable state private and exposing it as a read-only StateFlow. 
*/

package org.Flow.HotFlow.StateFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

class StateFlowExample {
    private val mutableState = MutableStateFlow(0)
    var immutableState: StateFlow<Int> = mutableState

    suspend fun updateState() {
        for(i in 1..3) {
            delay(500)
            mutableState.value += 10
        }
    }
}

suspend fun main()
{
    val state = StateFlowExample()
    coroutineScope {
        val collector = launch {
            state.immutableState.collect {
                println("Current State : $it")
            }
        }

        launch {
            state.updateState()
            collector.cancel()
        }
    }
}