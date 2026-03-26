//Q9th
/*
    Write a Kotlin program that takes an integer input n from the user.
    Print numbers from 1 to n.
    But:
    - Skip all prime numbers using the continue statement
    - Print only non-prime numbers 
*/

fun isPrime(number: Int): Boolean
{
    if(number <= 1) 
    {
        return false
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

    return isPrime
}
fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    if(number <= 0)
    {
        println("Please Enter a Valid Integer")
        return
    }

    for(i in 1..number)
    {
        if(isPrime(i))
        {
            continue
        }

        print("$i ")
    }
}