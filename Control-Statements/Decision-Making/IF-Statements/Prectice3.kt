//Q3rd
/*
    Write a Kotlin program that takes an integer as input and checks whether the number is even.
    If the number is even, print:
    The number is even
    If the number is not even, the program should print nothing.
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input! Please Enter a Valid Integer")
        return
    }

    if(number % 2 == 0) println("The number is even")
}