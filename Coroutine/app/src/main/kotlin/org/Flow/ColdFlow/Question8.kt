//Question 8 — Intermediate: Cold Flow + collectLatest()
package org.Flow.ColdFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.*

suspend fun main()
{
    val numbers = flow {
        for(i in 1..5) {
            emit(i)
            delay(500)
        }
    }

    numbers.onCompletion {
        println("Flow Completed")
    }
    .collectLatest {
        println("Processing : $it")
        delay(1000)
        println("Completed : $it")
    }
}