//Question 7 — Intermediate: Cold Flow + onStart() + onEach() + onCompletion()
package org.Flow.ColdFlow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.*

suspend fun main()
{
    val numbers = flow {
        for(i in 1..5) {
            emit(i)
        }
    }

    numbers
    .onStart {
        println("Flow Started")
    }    
    .onEach {
        println("Emitting : $it")
    }    
    .onCompletion {
        println("Flow Completed")
    }
    .collect {
        println("Collected : $it")
    }
}