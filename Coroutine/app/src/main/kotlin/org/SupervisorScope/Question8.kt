/*
    Question 8 — Parent Cancellation in supervisorScope

    Problem Statement
    Write a Kotlin program using supervisorScope that launches three child coroutines using launch:
    File Upload
    Database Backup
    Cloud Sync 
*/

package org.SupervisorScope
import kotlinx.coroutines.*
suspend fun main()
{
    val job = Job()
    val scope = CoroutineScope(job)
    val parent = scope.launch {
        supervisorScope {
        launch {
            try {
                for(i in 1..10)
                {
                    delay(1000)
                    println("File Upload -> Working...$i")
                }
            } finally {
                println("File Uploading Work Cancelled")
            }
        }

        launch {
            try {
                for(i in 1..10)
                {
                    delay(1000)
                    println("Database Backup -> Working...$i")
                }
            } finally {
                println("Database Backup Work Cancelled")
            }
        }

        launch {
            try {
                for(i in 1..10)
                {
                    delay(1000)
                    println("Cloud Sync -> Working...$i")
                }
            } finally {
                println("Cloud Sync Work Cancelled")
            }
        }

        delay(2000)
        scope.cancel()
    }
    }
    parent.join()
    println("All operations have been cancelled")
}