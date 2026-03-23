//Q6th
/*
    Write a Kotlin program to check whether a given number N is a prime number using a for loop.
*/

fun main()
{
    print("Enter a Number : ")
    val n = readln().trim().toIntOrNull()
    if(n == null)
    {
        println("Invalid Input")
        return
    }

    if(n <= 1)
    {
        println("Not Prime")
        return
    }


    var isPrime = true
    for (i in 2..n / 2) 
    {
        if (n % i == 0) 
        {
            isPrime = false
            break
        }
    }

    if (isPrime)  println("Prime")
    else  println("Not Prime")
}