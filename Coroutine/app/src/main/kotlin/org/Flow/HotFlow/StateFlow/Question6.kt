/*
    Question 6 — StateFlow: StateFlow with Data Class
    Task:
    Create a Kotlin program that uses MutableStateFlow with a data class to represent the state of a user profile. 
*/

package org.Flow.HotFlow.StateFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

data class UserState(
    val name: String,
    val age: Int,
    val isLoggedIn: Boolean
)

suspend fun main()
{
    val user = UserState("Guest", 0, false)
    val state = MutableStateFlow(user)

    coroutineScope {
        val collector = launch {
            state.collect {
                println(it)
            }
        }

        launch {
            state.value = state.value.copy(
                name = "Ranjeet",
                age = 20,
                isLoggedIn = false
            )
            delay(1000)

            state.value = state.value.copy(
                name = "Ranjeet",
                age = 20,
                isLoggedIn = true
            )
            delay(1000)

            state.value = state.value.copy(
                name = "Ranjeet",
                age = 21,
                isLoggedIn = true
            )
            delay(1000)

            collector.cancel()
        }
    }
}