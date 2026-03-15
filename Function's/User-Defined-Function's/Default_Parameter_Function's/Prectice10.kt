/*
Question 10: Logger System using Default Parameters

Write a Kotlin function logMessage(message: String,
level: String = "INFO",
timestamp: Boolean = true)
that prints log messages in a structured format.

Demonstrate different ways of calling the function
using default parameters and named arguments.
*/

import java.time.LocalDateTime

fun logMessage(message: String, level: String = "INFO", timestamp: Boolean = true)
{
    if(timestamp)
    {
        val time = LocalDateTime.now()
        println("[$level] $time : $message")
    }
    else
    {
        println("[$level] : $message")
    }
}

fun main()
{
    logMessage("Application started")
    logMessage("File not found", level = "ERROR")
    logMessage("User logged in", timestamp = false)
    logMessage("Database connected", "DEBUG", false)
}