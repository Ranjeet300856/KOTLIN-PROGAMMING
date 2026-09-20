/*
    Question 9 — StateFlow: Search Query State
    Task:
    Create a Kotlin program that uses MutableStateFlow<String> to simulate a search query state. 
*/

package org.Flow.HotFlow.StateFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun main()
{
    val state = MutableStateFlow("")
    coroutineScope {
        val collector = launch {
            state.filter {
                it.length >= 3
            } .collect {
                println("Search Query : $it")
            }
        }

        launch {
            state.value = "A"
            delay(500)

            state.value = "An"
            delay(500)

            state.value = "And"
            delay(500)

            state.value = "Andr"
            delay(500)

            state.value = "Android"
            delay(500)

            collector.cancel()
        }
    }
}