/*
    Question 8 — Number Comparison System using Higher Order Function and Lambda
    Problem Statement

    Create a Kotlin program where:

    You create a Higher Order Function named compareNumbers.
    The function should:
    take two Int numbers
    take one Lambda parameter for comparison
    The Lambda should compare the numbers in different ways. 
*/

import kotlin.math.abs

fun compareNumbers(number1: Int, number2: Int, comparison: (Int, Int) -> Int): Int = comparison(number1, number2)
fun compareNumbersEquality(number1: Int, number2: Int, comparison: (Int, Int) -> String): String = comparison(number1, number2)

fun main()
{
    print("Enter First Number  : ")
    val number1 = readln().trim().toIntOrNull()
    print("Enter Second Number : ")
    val number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Invalid Input")
        return
    }

    val findMax = {
        firstNumber: Int, secondNumber: Int ->
        if(firstNumber > secondNumber) firstNumber
        else secondNumber
    }

    val findMin = {
        firstNumber: Int, secondNumber: Int ->
        if(firstNumber < secondNumber) firstNumber
        else secondNumber
    }

    val checkEquality = {
        firstNumber: Int, secondNumber: Int ->
        if(firstNumber == secondNumber) "Numbers are equal"
        else "Numbers are not equal"
    }

    val absoluteDifference = {
        firstNumber: Int, secondNumber: Int ->
        abs(firstNumber - secondNumber)
    }

    println("\nGreater Number      : ${compareNumbers(number1, number2, findMax)}")
    println("Smaller Number      : ${compareNumbers(number1, number2, findMin)}")
    println("Equality Status     : ${compareNumbersEquality(number1, number2, checkEquality)}")
    println("Absolute Difference : ${compareNumbers(number1, number2, absoluteDifference)}")
}