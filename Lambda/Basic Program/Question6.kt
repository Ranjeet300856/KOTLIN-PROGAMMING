/*
    Question 6 — Type Inference in Lambda
    Problem Statement - Write a Kotlin program that demonstrates:
    Lambda Type Inference
    Parameters
    Return Value

    Your program should:
    Create a lambda that checks whether a number is even or odd.
    Explicitly define the function type in one lambda.
    Create another lambda that performs the same task but uses type inference.
    Call both lambdas using multiple test values.

    Also create the same functionality using a normal function for comparison. 
*/

fun normalFunction(number: Int): String
{
    if(number % 2 == 0) return "$number is Even"
    else return "$number is Odd"
}

fun main()
{
    //Create Lambda Function using Explicitly define the function type
    val lambdaWithExplicitType: (Int) -> String = {
        number ->
        if(number % 2 == 0) "$number is Even"
        else "$number is Odd"
    }

    //Create Lambda Function using type inference
    val lambdaWithTypeInference = {
        number: Int ->
        if(number % 2 == 0) "$number is Even"
        else "$number is Odd"
    }

    val result1 = lambdaWithExplicitType(2)
    val result2 = lambdaWithExplicitType(3)
    println("Using Explicit Lambda : $result1")
    println("Using Explicit Lambda : $result2")
    println()

    val result3 = lambdaWithTypeInference(4)
    val result4 = lambdaWithTypeInference(5)
    println("Using Inferred Lambda : $result3")
    println("Using Inferred Lambda : $result4")
    println()

    val result5 = normalFunction(6)
    val result6 = normalFunction(7)
    println("Using Normal Function : $result5")
    println("Using Normal Function : $result6")
}