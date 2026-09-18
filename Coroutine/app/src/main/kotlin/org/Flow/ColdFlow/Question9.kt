//Question 9 — Advanced: Cold Flow + map + filter + catch
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

    numbers.filter {
        it % 2 == 0
    }
    .map {
        if(it == 8) {
            throw Exception("Invalid number: $it")
        }
        Pair(it, it * it)
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
        println("Collected Value : $value and Square : $square")
    }
}