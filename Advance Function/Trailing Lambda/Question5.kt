/*
    Question 5 — Character Type Analyzer (Intermediate Level)
    Problem Statement
    Create a Kotlin program that analyzes a character using a Trailing Lambda.

    Requirements
    Create a Higher Order Function named analyzeCharacter.
    The function should accept:
    A character (Char)
    A lambda parameter that receives the character and returns Unit.

    Use Trailing Lambda Syntax while calling the function.
    Inside the lambda:
    Display the entered character.
    Determine and display whether the character is:
    Uppercase Letter
    Lowercase Letter
    Digit
    Special Character

    Use meaningful function and variable names.
    The program should work correctly for valid character inputs. 
*/

fun analyzeCharacter(ch: Char, checkChar: (Char) -> Unit) = checkChar(ch)

fun main()
{
    print("Enter Character : ")
    val input = readln().trim()
    if(input.isBlank() || input.length != 1)
    {
        println("Invalid Input")
        return
    }

    val character = input[0]

    analyzeCharacter(character) {
        ch: Char ->
        println("Character : $ch")

        if(ch.isUpperCase()) println("Type      : Uppercase Letter")
        else if(ch.isLowerCase()) println("Type      : Lowercase Letter")
        else if(ch.isDigit()) println("Type      : Digit")
        else println("Type      : Special Character")
    }
}