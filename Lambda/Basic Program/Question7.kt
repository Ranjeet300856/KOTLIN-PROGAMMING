/*
    Question 7 — Single Parameter Lambda Using it
    Problem Statement - Write a Kotlin program that demonstrates:
    Single Parameter Lambda
    it Keyword
    Type Inference

    Your program should:
    Create a lambda that calculates the cube of a number using a normal parameter name.
    Create another lambda that performs the same task using the it keyword.
    Call both lambdas using multiple test values.

    Also create the same functionality using a normal function for comparison. 
*/

fun normalFunction(number: Int): Int = number * number * number

fun main()
{
    //Create Lambda using normal parameter name
    val normalLambda = {
        number: Int ->
        number * number * number
    }

    //Create Lambda using it keyword
    val lambdaUsingIt: (Int) -> Int = { it * it * it }

    val result1 = normalLambda(3)
    val result2 = normalLambda(4)
    println("Using Normal Parameter Lambda : Cube of 3 = $result1")
    println("Using Normal Parameter Lambda : Cube of 4 = $result2")
    println()

    val result3 = lambdaUsingIt(3)
    val result4 = lambdaUsingIt(4)
    println("Using it Keyword Lambda       : Cube of 3 = $result3")
    println("Using it Keyword Lambda       : Cube of 4 = $result4")
    println()

    val result5 = normalFunction(5)
    val result6 = normalFunction(6)
    println("Using Normal Function         : Cube of 5 = $result5")
    println("Using Normal Function         : Cube of 6 = $result6")
}