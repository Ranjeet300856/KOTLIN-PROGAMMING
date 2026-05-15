/*
    Question 6 — Utility Package with Multiple Operations
    Problem Statement
    Create a Kotlin program that demonstrates how a reusable Utility Package can be created and used in multiple operations.

    Requirements
    1. Create a package named: stringutils
    2. Inside this package, create FOUR functions
    Function 1
    toUpperCaseText()
    take a string parameter
    return uppercase string

    Function 2
    toLowerCaseText()
    take a string parameter
    return lowercase string

    Function 3
    reverseText()
    take a string parameter
    return reversed string

    Function 4
    countCharacters()
    take a string parameter
    return total number of characters

    3. Create another Kotlin file for main() function
    4. Import all required functions
    You may use:
    specific imports
    OR
    wildcard import
    (choice is yours)

    5. Take text input from the user
    6. Display Output
    Uppercase Text      : value
    Lowercase Text      : value
    Reversed Text       : value
    Total Characters    : value 
*/

import stringutils.*

fun main()
{
    print("Enter a Text : ")
    val text = readln().trim()
    if(text.isBlank())
    {
        println("Invalid Input")
        return
    }

    println("Uppercase Text      : ${toUpperCaseText(text)}")
    println("Lowercase Text      : ${toLowerCaseText(text)}")
    println("Reversed Text       : ${reverseText(text)}")
    println("Total Characters    : ${countCharacters(text)}")
}