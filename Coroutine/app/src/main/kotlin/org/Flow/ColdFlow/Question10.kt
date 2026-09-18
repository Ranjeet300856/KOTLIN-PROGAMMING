//Question 10 — Advanced: Cold Flow + Multiple Operators + Error Handling
package org.Flow.ColdFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.*

suspend fun main()
{
    val numbers = flow {
        for(i in 1..10) {
            emit(i)
        }
    }

    numbers.onStart {
        println("Flow Started")
    }
    .filter {
        it % 2 == 0
    }
    .map {
        Pair(it, it * it)
    }
    .onEach {
        (value, square) ->
        println("Processing Square : $square")
        if(square == 64) {
            throw Exception("Invalid Square : $square")
        }
    }
    .catch {
        exception ->
        println(exception.message)
    }
    .onCompletion {
        println("Flow Completed")
    }
    .collect {
        (value, square) ->
        println("Final Result : $square")
    }
}