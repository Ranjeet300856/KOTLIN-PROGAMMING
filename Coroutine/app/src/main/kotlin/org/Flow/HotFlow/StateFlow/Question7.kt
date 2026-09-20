/*
    Question 7 — StateFlow: Login State Management
    Task:
    Create a Kotlin program that uses MutableStateFlow to manage the login state of a user. 
*/

package org.Flow.HotFlow.StateFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

suspend fun login(state: MutableStateFlow<Boolean>) {
    state.value = true
}

suspend fun logout(state: MutableStateFlow<Boolean>) {
    state.value = false
}

suspend fun main()
{
    val state = MutableStateFlow(false)
    coroutineScope {
        val collector = launch {
            state.collect {
            if(it) {
                println("User is Logged In")
            } else {
                println("User is Logged Out")
            }
            }
        }

        launch {
            login(state)
            delay(500)
            logout(state)
            delay(500)
            login(state)
            delay(500)

            collector.cancel()
        }
    }
}