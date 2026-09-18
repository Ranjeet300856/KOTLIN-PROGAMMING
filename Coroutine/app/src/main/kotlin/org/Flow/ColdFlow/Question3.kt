/*
    Create a Cold Flow that simulates receiving data from a server.

    The Flow should emit the following values one by one:
    10
    20
    30
    40
    50

    There should be a 1-second delay between each emission.

    When the Flow is collected:
    Print each received value.
    For every value, print whether it is Even or Odd.
    Print the square of the value.
    After the complete Flow finishes, print:
    Data Processing Completed 
*/

package org.Flow.ColdFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.*

suspend fun main()
{
    val numbers = flow {
        emit(10)
        delay(1000)
        emit(20)
        delay(1000)
        emit(30)
        delay(1000)
        emit(40)
        delay(1000)
        emit(50)
    }

    numbers
    .onCompletion {
        println("Data Processing Completed")
    }
    .collect {
        number ->
        println("\nReceived Number  : $number")
        println("Type of Number   : ${if(number % 2 == 0) "Even" else "Odd"}")
        println("Square of Number : ${number * number}")
    }
}