/*
    Question 1 — Basic Lambda Introduction
    Problem Statement - Write a Kotlin program that demonstrates the basic usage of a Lambda Function.

    Your program should:
    Create a lambda that prints:
    Welcome to Kotlin Lambda
    Store the lambda inside a variable.
    Call the lambda using the variable.
    Also create the same functionality using a normal function for comparison. 
*/

fun printMessageUsingNormalFunction()
{
    println("Message with Normal Function : Welcome to Kotlin Lambda")
}

fun main()
{
    val message = { println("Message with Lambda Function : Welcome to Kotlin Lambda") }
    message()

    printMessageUsingNormalFunction()      // Calling the normal function
}
