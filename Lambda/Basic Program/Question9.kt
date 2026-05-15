/*
    Question 9 — Lambda as a Function Object
    Problem Statement - Write a Kotlin program that demonstrates:
    Lambda as a Function Object
    Function Variable Behavior
    Calling Lambda Using Variable Reference

    Your program should:
    Create a lambda that calculates the area of a rectangle.
    Store the lambda inside a variable.
    Print the lambda variable itself.
    Call the lambda using the variable.
    Also demonstrate that the lambda variable behaves like a function reference.

    Create the same functionality using a normal function for comparison. 
*/

fun calculateRectangleArea(length: Double, width: Double)
{
    println("Area using Normal Function : %.2f".format(length * width))
}

fun main()
{
    //Create Lambda
    val lambdaFunction = {
        length: Double, width: Double ->
        println("Area using Lambda Function : %.2f".format(length * width))
    }

    print("Enter Rectangle Length : ")
    val length = readln().trim().toDoubleOrNull()
    print("Enter Rectangle Width  : ")
    val width = readln().trim().toDoubleOrNull()
    if(length == null || width == null)
    {
        println("Invalid Input")
        return
    }

    println("Lambda Variable : $lambdaFunction")
    lambdaFunction(length, width)
    calculateRectangleArea(length, width)
}