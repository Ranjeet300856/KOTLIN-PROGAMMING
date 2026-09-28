/*
    Question 1 — Basic Sealed Class: Result States

    Task:
    Create a Kotlin program using a sealed class named Result to represent the three possible states of an operation:

    Success — contains a success message.
    Error — contains an error message.
    Loading — represents an operation that is currently in progress.

    Create objects/instances for all three states and use a when expression to handle each state and print an appropriate message. 
*/

sealed class Result()
class Success(val message: String) : Result() 
class Error(val message: String) : Result()
class Loading() : Result()

fun showData(result: Result) {
    when(result) {
        is Success -> println("${result.message}")
        is Error -> println("${result.message}")
        is Loading -> println("Loading: Please wait...")
    }
}

fun main()
{
    val result1 = Success("Success: Data loaded successfully")
    val result2 = Error("Error: Failed to load data")
    val result3 = Loading()

    showData(result1)
    showData(result2)
    showData(result3)
}