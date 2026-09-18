/*
    Create a Cold Flow that emits the numbers from 1 to 10.

    When the Flow is collected:
    Print every emitted number.
    Print the square of each number.
    After all numbers have been emitted and collected, print:
    Flow Completed 
*/

package org.Flow.ColdFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.*

suspend fun main()
{
    val _flow = flow {
        for(i in 1..10)
        emit(i)
    }

    _flow
    .onCompletion {
        println("Flow Completed")
    }
    .collect {
        number ->
        println("Number $number : Square : ${number * number}")
    }
}