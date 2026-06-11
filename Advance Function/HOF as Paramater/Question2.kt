/*
    Question 2 — Dynamic Message Processor Using Function as Parameter
    Problem Statement - Create a Kotlin program to understand how different functions can be passed dynamically into a Higher Order Function. 
*/

fun toUpperCaseMessage(message: String): String = message.uppercase()
fun toLowerCaseMessage(message: String): String = message.lowercase()
fun reverseMessage(message: String): String = message.reversed()

fun processMessage(message: String, process: (String) -> String): String = process(message)

fun main()
{
    print("Enter a message : ")
    val message = readln().trim()
    if(message.isBlank())
    {
        print("Invalid Input")
        return
    }

    val toUpperCase = processMessage(message, ::toUpperCaseMessage)
    val toLowerCase = processMessage(message, ::toLowerCaseMessage)
    val reverse = processMessage(message, ::reverseMessage)

    println("Original Message : $message")
    println()

    println("Uppercase Message : $toUpperCase")
    println("Lowercase Message : $toLowerCase")
    println("Reversed Message  : $reverse")
}