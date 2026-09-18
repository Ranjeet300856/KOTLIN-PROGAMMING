//Question 6 — Intermediate: Cold Flow + Error Handling
package org.Flow.ColdFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.*

suspend fun main()
{
    val numbers = flow {
        for(i in 1..10) {
            if(i == 5) {
                throw Exception("Invalid number: $i")
            }

            emit(i)
        }
    }

    numbers
    .onCompletion {
        println("Flow Processing Finished")
    }
    .catch {
        exception ->
        println("Error: ${exception.message}")
    }
    .collect {
        number ->
        println("Received Number : $number")
    }
}