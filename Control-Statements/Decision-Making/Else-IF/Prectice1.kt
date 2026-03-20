//Q1st
/*
    Write a Kotlin program that takes three integer inputs from the user and determines the largest number among them using an else-if ladder.
    Requirements:
    If all three numbers are equal, print:
    "All numbers are equal"
    Otherwise, print:
    "The largest number is: X" (where X is the largest number)
    You must use else-if ladder (not built-in functions like maxOf)
*/

fun main()
{
    print("Enter 1st Number : ")
    val number1 = readln().trim().toIntOrNull()
    print("Enter 2nd Number : ")
    val number2 = readln().trim().toIntOrNull()
    print("Enter 3rd Number : ")
    val number3 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null || number3 == null)
    {
        println("Invalid Input! Please Entar a Valid Input")
        return
    }

    if(number1 == number2 && number2 == number3) println("All numbers are equal")
    else if(number1 >= number2 && number1 >= number3) println("The largest number is: $number1")
    else if(number2 >= number1 && number2 >= number3) println("The largest number is: $number2")
    else println("The largest number is: $number3")
}