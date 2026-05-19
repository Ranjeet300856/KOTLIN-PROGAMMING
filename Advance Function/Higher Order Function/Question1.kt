/*
    Question 1 — Basic Calculator Using Function as Parameter
    Problem Statement - Create a Kotlin program to understand the basic concept of Higher Order Function using Normal Functions. 
*/

//Normal Function
fun add(number1: Int, number2: Int): Int = number1 + number2
fun sub(number1: Int, number2: Int): Int = number1 - number2
fun multi(number1: Int, number2: Int): Int = number1 * number2

//Higher Order Function
fun calculator(number1: Int, number2: Int, operation: (Int, Int) -> Int): Int
{
    val result = operation(number1, number2)
    return result
}

//Main Function
fun main()
{
    print("Enter 1st Number : ")
    val number1 = readln().trim().toIntOrNull()
    print("Enter 2nd Number : ")
    val number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        print("Invalid Input")
        return
    }

    val addition = calculator(number1, number2, ::add)
    val subtraction = calculator(number1, number2, ::sub)
    val multiplication = calculator(number1, number2, ::multi)

    println("Addition Result       : $addition")
    println("Subtraction Result    : $subtraction")
    println("Multiplication Result : $multiplication")
}