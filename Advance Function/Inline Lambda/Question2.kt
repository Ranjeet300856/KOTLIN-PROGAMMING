/*
    Question 2: Inline Number Calculator with Custom Operation
    Problem Statement:
    Create a Kotlin program to develop an Inline Number Calculator System that performs custom mathematical operations using Inline Lambda.

    Requirements:
    1. Create an inline function named calculateNumber().

    2. The function should accept three parameters:
       - firstNumber (Int)
       - secondNumber (Int)
       - operation (Lambda parameter that accepts two Int values and returns an Int)

    3. Inside the inline function:
       - Display both numbers.
       - Execute the lambda operation using the given numbers.
       - Store the returned result in a variable.
       - Display the final calculated result.

    4. In the main() function:
       - Call calculateNumber() multiple times with different operations such as:
           - Addition
           - Subtraction
           - Multiplication
           - Division

    5. Handle division carefully to avoid runtime errors.
*/

inline fun calculateNumber(number1: Int, number2: Int, operation: (Int, Int) -> Double)
{
    println("\nFirst Number  : $number1")
    println("Second Number : $number2")
    val result = operation(number1, number2)
    println("Result        : %.2f".format(result))
}

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

    calculateNumber(number1, number2) {
        firstNumber: Int, secondNumber: Int ->
        (firstNumber + secondNumber).toDouble()
    }

    calculateNumber(number1, number2) {
        firstNumber: Int, secondNumber: Int ->
        (firstNumber - secondNumber).toDouble()
    }

    calculateNumber(number1, number2) {
        firstNumber: Int, secondNumber: Int ->
        (firstNumber * secondNumber).toDouble()
    }

    calculateNumber(number1, number2) {
        firstNumber: Int, secondNumber: Int ->
        if(secondNumber == 0)
        {
            println("Divison By Zero Not Allowed")
            0.0
        }
        else firstNumber.toDouble() / secondNumber
    }
}