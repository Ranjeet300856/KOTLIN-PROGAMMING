/*
    Create a Cold Flow that emits the numbers from 1 to 20.

    When the Flow is collected:
    Check each emitted number.
    If the number is even, calculate its square.
    If the number is odd, calculate its cube.
    Print the original number and the calculated result.
    After all values have been processed, print:
    Processing Completed 
*/

package org.Flow.ColdFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.*

suspend fun main()
{
    val numbersFlow = flow {
        for(i in 1..20) {
            emit(i)
        }
    }

    numbersFlow    
    .onCompletion {
        println("Processing Completed")
    }
    .collect {
        number ->
        if(number % 2 == 0) {
            println("Number $number : Square: ${number * number}")
        } else {
            println("Number $number : Cube: ${number * number * number}")
        }
    }

}