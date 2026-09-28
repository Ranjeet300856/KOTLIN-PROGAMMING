/*
    Question 10 — Sealed Class with Nested States
    Task:

    Create a Kotlin program using a sealed class named UserState.

    It should contain:

    Loading → object state
    Success → contains username: String
    Error → contains message: String
    A nested sealed class Auth with:
    LoggedIn → contains username: String
    LoggedOut → object state 
*/

sealed class UserState
object Loading : UserState()
class Success(val username: String) : UserState()
class Error(val errorMessage: String) : UserState()

sealed class Auth : UserState()
class LoggedIn(val username: String) : Auth()
object LoggedOut : Auth()

fun handleUserState(state: UserState) {
    when(state) {
        is Loading -> println("Loading...")
        is Success -> println("Success : ${state.username}")
        is Error -> println("Error : ${state.errorMessage}")
        is LoggedIn -> println("Logged In Success : ${state.username}")
        is LoggedOut -> println("Logged Out!")
    }
}

fun main() 
{
    val loading = Loading
    val success = Success("Rahul")
    val error = Error("Something Went Wrong")
    val loggedIn = LoggedIn("Ranjeet")
    val loggedOut = LoggedOut

    handleUserState(loading)
    handleUserState(success)
    handleUserState(error)
    handleUserState(loggedIn)
    handleUserState(loggedOut)
}