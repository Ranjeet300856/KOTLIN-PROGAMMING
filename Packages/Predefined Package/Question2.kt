/*
    Write a Kotlin program that analyzes a user-entered string using Kotlin predefined packages.

    Your program should:

    Take a full string input from the user.
    Display:
    Original String
    Uppercase Version
    Lowercase Version
    Trimmed String
    Total Length
    Total Words
    Reversed String
    First Character
    Last Character
    Check and display:
    Whether the string is empty
    Whether the string is palindrome or not (ignore case)
    Format the output professionally. 
*/

fun main()
{
    //Input String and Validation
    print("Enter a Text : ")
    val text = readln()
    if(text.isBlank())
    {
        println("Invalid Input")
        return
    }

    //Analyzes
    println("\n-------- String Analysis Report --------\n")

    println("Original String : $text")
    println("Uppercase       : ${text.uppercase()}")
    println("Lowercase       : ${text.lowercase()}")
    println("Trimmed String  : ${text.trim()}")
    println("Total Length    : ${text.length}")
    println("Total Words     : ${text.split(" ").size}")
    println("Reversed String : ${text.reversed()}")
    println("First Character : ${text.first()}")
    println("Last Character  : ${text.last()}")
    println("Is Empty        : ${text.isEmpty()}")
    println("Is Palindrome   : ${text.lowercase().reversed() == text.lowercase()}")
}