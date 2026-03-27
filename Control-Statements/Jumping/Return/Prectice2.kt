//Q2nd
/*
    Write a Kotlin function that takes an integer n as input and:

    If n is less than or equal to 1, return "Not Prime"
    Check whether n is a prime number or not
    If a divisor is found, immediately return "Not Prime" (use early return)
    If no divisor is found, return "Prime" 
*/

fun isPrime(n: Int): String
{
    if(n <= 1) return "Not Prime"
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) 
    {
        if (n % i == 0) 
        {
            return "Not Prime"
        }
    }

    return "Prime"
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

    println(isPrime(number))
}