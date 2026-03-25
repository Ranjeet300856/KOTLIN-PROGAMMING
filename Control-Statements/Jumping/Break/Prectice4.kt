//Q4th
/*
    Write a Kotlin program to check whether a given number is prime or not.
    Use break to stop checking as soon as a divisor is found.
*/

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    if(number <= 1)
    {
        println("Not Prime")
        return
    }
    var isPrime = true
    for (i in 2..number / 2) 
    {
        if (number % i == 0) 
        {
            isPrime = false
            break
        }
    }

    if (isPrime)  println("Prime")
    else  println("Not Prime")
}