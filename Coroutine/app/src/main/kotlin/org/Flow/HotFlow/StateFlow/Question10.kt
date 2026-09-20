/*
    Question 10 — Advanced StateFlow: Complete User Profile State
    Task:
    Create a Kotlin program that simulates an Android ViewModel-style user profile state using MutableStateFlow. 
*/

package org.Flow.HotFlow.StateFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

data class UserProfileState(
    val name: String = "Guest",
    val age: Int = 0,
    val isLoggedIn: Boolean = false
)

class UserProfileViewModel(
    val user: UserProfileState
) {
    private val _state = MutableStateFlow(user)
    val readOnlyUser: StateFlow<UserProfileState> = _state

    fun login(name: String, age: Int) {
        _state.value = _state.value.copy(
            name = name,
            age = age,
            isLoggedIn = true
        )
    }

    fun logout() {
        _state.value = _state.value.copy(
            isLoggedIn = false
        )
    }

    fun updateAge(age: Int) {
        _state.value = _state.value.copy(
            age = age
        )
    }
}

suspend fun main() 
{
    val user = UserProfileState()
    val userProfile = UserProfileViewModel(user)
    coroutineScope {
        val collector = launch {
            userProfile.readOnlyUser.collect {
                println(it)
            }
        }

        launch {
            userProfile.login("Ranjeet", 20)
            delay(500)

            userProfile.updateAge(21)
            delay(500)

            userProfile.logout()
            delay(500)

            userProfile.login("Ranjeet", 22)
            delay(500)

            collector.cancel()
        }
    }
}