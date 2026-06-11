/*
    Question 3 — Dynamic Number Validator Using Function as Parameter
    Problem Statement - Create a Kotlin program that validates a number using different normal functions passed into a Higher Order Function.

    This program should demonstrate how one Higher Order Function can dynamically perform different validations. 
*/

fun isEven(number: Int): Boolean = number % 2 == 0
fun isPositive(number: Int): Boolean = number > 0
fun isPalindrom(number: Int): Boolean = number.toString() == number.toString().reversed()

fun validateNumber(number: Int, validate: (Int) -> Boolean): Boolean = validate(number)

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Number")
        return
    }

    println("\nIs Even       : ${validateNumber(number, ::isEven)}")
    println("Is Positive   : ${validateNumber(number, ::isPositive)}")
    println("Is Palindrome : ${validateNumber(number, ::isPalindrom)}")
}