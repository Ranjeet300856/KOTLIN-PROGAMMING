//Q1st
/*
    Write a Kotlin program to print all natural numbers from 1 to N using a for loop.
    Also calculate and print the sum of all numbers from 1 to N.
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null || number <= 0)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    var sum = 0
    for(i in 1..number)
    {
        print("$i  ")
        sum += i
    }

    println()
    println("Sum of All Numbers : $sum")
}