/*
    Question 4 — Number Transformer using Higher Order Function and Lambda

    Problem Statement
    Create a Kotlin program where:
    You create a Higher Order Function named transformNumber.
    The function should:
    take one Int number
    take one Lambda parameter for transformation
    The Lambda should perform different transformations on the number.
    Operations to Perform

    Call the Higher Order Function using different Lambdas for:
    Find Square of Number
    Find Cube of Number
    Check if Number is Even or Odd
    Reverse the Number 
*/

fun transformNumber(number: Int, transform: (Int) -> Int): Int = transform(number)
fun transformNumber2(number: Int, transform2: (Int) -> String): String = transform2(number)

fun main()
{
    print("Enter a number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    val square = { number: Int -> number * number }
    val cube = { number: Int -> number * number * number }
    val reverse = { number: Int -> number.toString().reversed().toInt() }
    val checkEvenOdd = { number: Int -> if(number % 2 == 0) "Even" else "Odd" }

    println("\nSquare   : ${transformNumber(number, square)}")
    println("Cube     : ${transformNumber(number, cube)}")
    println("Reversed : ${transformNumber(number, reverse)}")
    println("Even/Odd : ${transformNumber2(number, checkEvenOdd)}")
}