fun isPrime(n: Int): Boolean = n > 1 && (2 until n).none { n % it == 0 }
fun main()
{
    //Q8th
    /*
    Write a Kotlin program that defines a Single Expression Function named isPrime.
    The function should:
    Take one integer parameter n
    Return true if the number is prime
    Return false otherwise
    A prime number is a number that:
    Is greater than 1
    Has only two divisors → 1 and itself
    Examples:
    2  → Prime
    3  → Prime
    4  → Not Prime
    5  → Prime
    9  → Not Prime
    After defining the function
    Read an integer from the user
    Call the function
    Print whether the number is Prime or Not Prime
    */

    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input! Please Entar a Valid Integer")
        return 
    }

    if(isPrime(number)) println("$number is a Prime Number")
    else println("$number Not a Prime Number")
}