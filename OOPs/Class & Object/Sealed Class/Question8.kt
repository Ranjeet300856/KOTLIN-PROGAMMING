/*
    Question 8 — Sealed Class with Generic Type
    Task:
    Create a Kotlin program using a generic sealed class named Result<T> to represent the result of a generic operation. 
*/

sealed class Result<T>
class Success<T>(val message: T) : Result<T>()
class Error(val errorMessage: String) : Result<Nothing>()
class Loading : Result<Nothing>()

fun <T> handleResult(result: Result<T>) {
    when(result) {
        is Success -> println("Success : ${result.message}")
        is Error -> println(result.errorMessage)
        is Loading -> println("Loading: Please wait...")
    }
}

fun main()
{
    val successString = Success("User data")
    val successInt = Success(100)
    val successDouble = Success(88.90)
    val error = Error("Error: Something went wrong")
    val loading = Loading()

    handleResult(successString)
    handleResult(successInt)
    handleResult(successDouble)
    handleResult(error)
    handleResult(loading)
}