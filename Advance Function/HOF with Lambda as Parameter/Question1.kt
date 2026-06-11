/*
    Question 1 — Basic Calculator using Higher Order Function and Lambda

    Problem Statement
    Create a Kotlin program where:

    You create a Higher Order Function named calculate.
    The function should:
    take two Int numbers
    take one Lambda parameter for operation
    The Lambda should perform a mathematical operation on the two numbers.
    Call the Higher Order Function multiple times using different Lambdas for:

    Addition
    Subtraction
    Multiplication
    Division 
*/

fun calculate(number1: Int, number2: Int, operation: (Int, Int) -> Int): Int = operation(number1, number2)

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

    val addition = { firstNumber: Int, secondNumber: Int -> firstNumber + secondNumber }
    val subtraction = { firstNumber: Int, secondNumber: Int -> firstNumber - secondNumber }
    val multiplication = { firstNumber: Int, secondNumber: Int -> firstNumber * secondNumber }
    val division = { firstNumber: Int, secondNumber: Int -> firstNumber / secondNumber }

    println("Addition       : ${calculate(number1, number2, addition)}")
    println("Subtraction    : ${calculate(number1, number2, subtraction)}")
    println("Multiplication : ${calculate(number1, number2, multiplication)}")

    if(number2 != 0)
        println("Division       : ${calculate(number1, number2, division)}")
    else
        println("Division by 0 is not allowed")
}