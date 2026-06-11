/*
    Question 2 — Custom Message Formatter using Higher Order Function and Lambda
    Problem Statement
    Create a Kotlin program where:

    You create a Higher Order Function named formatMessage.
    The function should:
    take a String message
    take one Lambda parameter for formatting
    The Lambda should modify the message in different ways.

    Operations to Perform
    Call the Higher Order Function using different Lambdas for:
    Convert message to Uppercase
    Convert message to Lowercase
    Reverse the message
    Add decorative symbols before and after the message 
*/

fun formatMessage(text: String, formatter: (String) -> String): String = formatter(text)

fun main()
{
    print("Enter a message : ")
    val message = readln().trim()
    if(message.isBlank())
    {
        println("Invalid Message")
        return
    }

    val convertUppercase = { text: String -> text.uppercase() }
    val convertLowercase = { text: String -> text.lowercase() }
    val reverse = { text: String -> text.reversed() }
    val addDecorativeSymbols = { text: String -> "*** $text ***" }

    println("\nOriginal Message : $message \n")
    println("Message in uppercase   : ${formatMessage(message, convertUppercase)}")
    println("Message in lowercase   : ${formatMessage(message, convertLowercase)}")
    println("Message in reversed    : ${formatMessage(message, reverse)}")
    println("Message in new version : ${formatMessage(message, addDecorativeSymbols)}")
}