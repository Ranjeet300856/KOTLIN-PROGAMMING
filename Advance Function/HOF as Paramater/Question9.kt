/*
    Question 9 — Dynamic Character Analyzer Using Function as Parameter
    Problem Statement - Create a Kotlin program that analyzes a character using different checking functions passed into a Higher Order Function.

    This program should demonstrate how one Higher Order Function can dynamically execute different character analysis logics. 
*/

fun isVowel(ch: Char): Boolean = ch in "aeiouAEIOU"
fun isDigitCharacter(ch: Char): Boolean = ch.isDigit()
fun isAlphabetCharacter(ch: Char): Boolean = ch.isLetter()

fun analyzeCharacter(ch: Char, analysisChar: (Char) -> Boolean): Boolean = analysisChar(ch)

fun main()
{
    print("Enter a Character : ")
    val input = readln().trim()
    if(input.isBlank() || input.length != 1)
    {
        println("Invalid Input")
        return
    }

    val ch: Char = input[0]
    
    println("\nVowel Status     : ${analyzeCharacter(ch, ::isVowel)}")
    println("Digit Status     : ${analyzeCharacter(ch, ::isDigitCharacter)}")
    println("Alphabet Status  : ${analyzeCharacter(ch, ::isAlphabetCharacter)}")
}