/*
    Question 3 — Sealed Class with Object States
    Task:
    Create a Kotlin program using a sealed class named AuthState to represent the authentication state of a user.
    The application can have these three states:
    LoggedOut — user is not logged in.
    Loading — login operation is in progress.
    LoggedIn — user is successfully logged in and contains the user's username.
*/

sealed class AuthState
object LoggedOut : AuthState()
object Loading : AuthState()
data class LoggedIn(val username: String) : AuthState()

fun showData(result: AuthState) {
    when(result) {
        is LoggedIn -> println("Logged In: Welcome, ${result.username}")
        is LoggedOut -> println("Logged Out: Please login")
        is Loading -> println("Loading: Logging in...")
    }
}

fun main()
{
    val result1 = LoggedOut
    val result2 = Loading
    val result3 = LoggedIn("Ranjeet")

    showData(result1)
    showData(result2)
    showData(result3)
}