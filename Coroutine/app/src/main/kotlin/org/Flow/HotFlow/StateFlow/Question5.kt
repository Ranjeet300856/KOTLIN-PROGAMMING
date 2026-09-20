/*
    Question 5 — StateFlow: State Update Using value and emit()
    Task:
    Create a Kotlin program that demonstrates two different ways of updating a MutableStateFlow: using .value and using .emit(). 
*/

package org.Flow.HotFlow.StateFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val state = MutableStateFlow(0)
    coroutineScope {
        val collector = launch {
            state.collect {
                println("State : $it")
            }
        }

        launch {
            for(i in 1..2) {
                delay(500)
                state.value += 10
            }

            for(i in 1..2) {
                delay(500)
                state.emit(state.value + 10)
            }

            collector.cancel()
    }
}
}