/* 
    Create a Cold Flow that emits numbers from 1 to 30.

    When the Flow is collected, perform the following processing:
    Keep only the numbers that are divisible by 3.
    For each remaining number, calculate its square.
    Print the original number and its square.
    After all values have been processed, print:
    Processing Completed
*/

package org.Flow.ColdFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.*

suspend fun main()
{
    val numbers = flow {
        for(i in 1..30) {
            emit(i)
        }
    }

    numbers
    .onCompletion {
        println("Processing Completed")
    }
    .filter {
        it % 3 == 0
    }    
    .map {
        Pair(it, it * it)
    }
    .collect {
        (originalNumber, square) ->
        println("Number : $originalNumber, Square -> $square")
    }    

}