fun addNumbers(num1: Int, num2: Int): Int
{
    var sum = num1 + num2
    return sum
}
fun main()
{
    //Q1st
    /*
    Write a Kotlin program that defines a function addNumbers(a: Int, b: Int) which takes two parameters and returns their sum.
    The program should call this function from main() and print the returned result.
    */

    print("Enter 1st Number : ")
    var number1 = readln().trim().toIntOrNull()
    print("Enter 2nd Number : ")
    var number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    var sum = addNumbers(number1, number2)
    println("Sum of $number1 + $number2 = $sum")
}