/*
    Question 8 — Multi-line Lambda Function
    Problem Statement - Write a Kotlin program that demonstrates:
    Multi-line Lambda
    Multiple Statements Inside Lambda
    Automatic Return of Last Expression

    Your program should:
    Create a lambda that:
    Takes two integer numbers as parameters
    Prints both numbers
    Calculates their addition
    Returns the final result
    Store the lambda inside a variable.
    Call the lambda using multiple test values.

    Also create the same functionality using a normal function for comparison. 
*/

fun normalFunction(number1: Int, number2: Int): Int
{
    println("First Number  : $number1")
    println("Second Number : $number2")
    println()

    return number1 + number2
}

fun main()
{
    //Create Lambda
    val lambdaFunction = {
        number1: Int, number2: Int -> 
        println("First Number  : $number1")
        println("Second Number : $number2")

        number1 + number2
    }

    println("Output using Lambda Function: ")

    val result1 = lambdaFunction(10, 20)
    println("Addition : $result1")

    println()
    val result2 = lambdaFunction(30, 40)
    println("Addition : $result2")

    println("\nOutput using Normal Function: ")

    val result3 = normalFunction(50, 60)
    println("Addition : $result3")

    println()
    val result4 = normalFunction(70, 80)
    println("Addition : $result4")
}