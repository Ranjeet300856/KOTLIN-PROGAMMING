fun printSum(num1: Int, num2: Int)
{
    println("Sum of $num1 + $num2 = ${num1 + num2}")
}
fun main()
{
    //Q7th
    /*
    Write a Kotlin program that defines a function printSum(a: Int, b: Int) which prints the sum of two numbers.
    */

    print("Enter 1st Number : ")
    var number1 = readln().toIntOrNull()
    print("Enter 2nd Number : ")
    var number2 = readln().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    printSum(number1,number2)
}