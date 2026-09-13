/*
    Write a Kotlin program using coroutineScope {} that starts two child coroutines using launch.

    The first child should wait for 1 second and print "Task 1 completed".
    The second child should wait for 2 seconds and print "Task 2 completed".
    After both child coroutines are completed, print "All tasks completed".
    The program must demonstrate that the code outside coroutineScope {} runs only after all its child coroutines have completed.
*/

package org.coroutineScope
import kotlinx.coroutines.*
suspend fun main()
{
    coroutineScope {
        launch {
            delay(1000)
            println("Task 1 Completed")
        }

        launch {
            delay(2000)
            println("Task 2 Completed")
        }
    }

    println("All Task Completed")
}