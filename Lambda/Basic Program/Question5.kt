/*
    Question 5 — Explicit Function Type in Lambda
    Problem Statement - Write a Kotlin program that demonstrates:
    Lambda with Explicit Function Type
    Parameters
    Return Value

    Your program should:
    Create a lambda that calculates the square of a number.
    Explicitly define the function type of the lambda.
    Store the lambda inside a variable.
    Call the lambda using multiple test values.

    Also create the same functionality using a normal function for comparison. 
*/

fun calculatesByNormalFun(number: Int): Int = number * number

fun main()
{
    //Create Lambda
    val calculatesByLambda: (Int) -> Int = { number ->
        number * number
    }

    println("Square of 5 using Lambda Function : ${calculatesByLambda(5)}")
    println("Square of 8 using Lambda Function : ${calculatesByLambda(8)}")
    println()

    println("Square of 5 using Normal Function : ${calculatesByNormalFun(5)}")
    println("Square of 8 using Normal Function : ${calculatesByNormalFun(8)}")
}