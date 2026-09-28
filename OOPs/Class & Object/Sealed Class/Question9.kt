/*
    Question 9 — Sealed Class with Multiple Data Types
    Task:

    Create a Kotlin program using a sealed class named ApiResult.

    It should contain these subclasses:

    Success → contains data: String
    Error → contains code: Int and message: String
    Loading → contains progress: Int 
*/

sealed class ApiResult 
class Success(val _data: String) : ApiResult()
class Error(val code: Int, val message: String) : ApiResult()
class Loading(val message: String) : ApiResult()

fun handleResult(result: ApiResult) {
    when(result) {
        is Success -> println("Success : ${result._data}")
        is Error -> println("Error Code : ${result.code} and Message : ${result.message}")
        is Loading -> println("Loading : ${result.message}")
    }
}

fun main()
{
    val success = Success("User data loaded")
    val error = Error(404, "User not found")
    val loading = Loading("75%")

    handleResult(success)
    handleResult(error)
    handleResult(loading)
}