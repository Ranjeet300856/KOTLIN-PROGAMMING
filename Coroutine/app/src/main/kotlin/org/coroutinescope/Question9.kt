//Write a Kotlin program using coroutineScope {} that combines Coroutine Context, cancellation, and exception handling in a realistic scenario.
package org.coroutineScope
import kotlinx.coroutines.*

suspend fun processDownload()
{
    coroutineScope {
        val dispatcher = Dispatchers.Default
        val name = CoroutineName("DownloadManager")

        launch(dispatcher + name) {
            coroutineScope {
                launch {
                    try {
                        for(i in 1..10) {
                            println("${coroutineContext[CoroutineName]?.name} | ${Thread.currentThread().name} | Download $i ")
                            delay(400)
                        } 
                    } finally {
                        println("Download Task Cancelled")
                    }
                }

                launch {
                    delay(1200)
                    throw Exception("File validation failed")
                }

                launch {
                    try {
                        for(i in 1..10) {
                            delay(400)
                            println("${coroutineContext[CoroutineName]?.name} | ${Thread.currentThread().name} | Monitor $i ")
                        }
                    } finally {
                        println("Monitoring task cancelled")
                    }
                }
            }
        } 
    }
}

suspend fun main()
{
    try {
        processDownload()
    } catch(e: Exception) {
        println(e.message)
        println("Download operation failed")
    }
}