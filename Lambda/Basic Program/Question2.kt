/*
    Question 2 — Lambda With Parameters and Return Value
    Problem Statement - Write a Kotlin program that demonstrates a Lambda Function with: Parameters and Return Value

    Your program should:
    Create a lambda that takes two integer numbers as parameters.
    The lambda should return the multiplication of both numbers.
    Store the lambda inside a variable.
    Call the lambda using different test values.
    Also create the same functionality using a normal function for comparison.
*/

//Normal Function
fun multiplicationUsingNormalFun(number1: Int, number2: Int): Int
{
    return number1 * number2
}

fun main()
{
    //Lambda Function
    val multiplicationUsingLambda = { 
        number1: Int, number2: Int ->
        number1 * number2
    }

    //Input Numbers and Validation
    print("Enter 1st Number : ")
    val number1 = readln().trim().toIntOrNull()
    print("Enter 2nd Number : ")
    val number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Invalid Input")
        return
    }

    //Calling Lambda Function
    val multiplication1 = multiplicationUsingLambda(number1, number2)
    
    //Calling Normal Function
    val multiplication2 = multiplicationUsingNormalFun(number1, number2)

    //Output
    println("Using Lambda Function : $number1 x $number2 = $multiplication1")
    println("Using Normal Function : $number1 x $number2 = $multiplication2")
}