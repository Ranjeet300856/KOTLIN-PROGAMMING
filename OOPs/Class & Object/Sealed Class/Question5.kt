/*
    Question 5 — Sealed Class with Nested Sealed Hierarchy

    Task:
    Create a Kotlin program using a sealed class named AppResult to represent the result of an application operation.

    The result should have two main categories:

    Success
    Failure

    Failure itself must be a sealed class with different failure types:

    NetworkError — contains an error message.
    DatabaseError — contains an error message.
    AuthenticationError — contains an error message.

    Success should contain the returned data. 
*/

sealed class AppResult
class Success(val dataValue: String) : AppResult()
sealed class Failure : AppResult()
class NetworkError(val message: String) : Failure()
class DatabaseError(val message: String) : Failure()
class AuthenticationError(val message: String) : Failure()

fun showInfo(appResult: AppResult) {
    when(appResult) {
        is Success -> println(appResult.dataValue)
        is NetworkError -> println(appResult.message)
        is DatabaseError -> println(appResult.message)
        is AuthenticationError -> println(appResult.message)
    }
}

fun main()
{
    val success = Success("Success: User data loaded")
    val networkError = NetworkError("Network Error: No internet connection")
    val databaseError = DatabaseError("Database Error: Unable to read user data")
    val authenticationError = AuthenticationError("Authentication Error: Invalid credentials")

    showInfo(success)
    showInfo(networkError)
    showInfo(databaseError)
    showInfo(authenticationError)
}