/*
    Create a Kotlin program where:
    You have separate normal functions for:
    Addition
    Subtraction

    Create a Higher Order Function named:
    getOperation()
    that:
    takes a Char parameter
    returns a function 
*/

//Addition
fun addition(number1: Int, number2: Int): Int = number1 + number2

//Subtraction
fun subtraction(number1: Int, number2: Int): Int = number1 - number2

//Higher Order
fun getOperation(ch: Char): (Int, Int) -> Int
{
    if(ch == '+') return ::addition
    else if(ch == '-') return ::subtraction
    else return { _, _ -> 0 }
}

//Main Function
fun main()
{
    print("Enter First Number  : ")
    val number1 = readln().trim().toIntOrNull()
    print("Enter Second Number : ")
    val number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Invalid Number")
        return
    }

    print("Enter Operation ( + or - ) : ")
    val input = readln().trim()
    if(input.isBlank() || input.length != 1 || input !in "+-")
    {
        println("Invalid Operation")
        return
    }

    val ch: Char = input[0]

    val result = getOperation(ch)
    val answer = result(number1, number2)

    println("Answer : $answer")
}