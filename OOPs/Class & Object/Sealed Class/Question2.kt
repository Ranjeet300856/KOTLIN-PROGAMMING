/*
    Question 2 — Sealed Class with Data Classes
    Task:
    Create a Kotlin program using a sealed class named NetworkResult to represent the result of a network operation. 
*/

sealed class NetworkResult
data class Success(val _data: String) : NetworkResult()
data class Error(val message: String) : NetworkResult()
class Loading : NetworkResult()

fun showData(result: NetworkResult) {
    when(result) {
        is Success -> println(result._data)
        is Error -> println(result.message)
        is Loading -> println("Loading: Fetching data...")
    }
}

fun main() 
{
    val result1 = Success("Success: User data received")
    val result2 = Error("Error: Network connection failed")
    val result3 = Loading()

    showData(result1)
    showData(result2)
    showData(result3)
}