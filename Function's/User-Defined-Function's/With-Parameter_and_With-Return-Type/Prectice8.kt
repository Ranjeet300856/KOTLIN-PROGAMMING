fun calculateFactorial(number: Int): Long
{
    var factorial: Long = 1

    for(i in 2..number)
    {
        factorial *= i
    }

    return factorial
}
fun main()
{
    //Q8th
    /*
    Write a Kotlin program that defines a function calculateFactorial(number: Int) 
    which takes a positive integer as a parameter and returns the factorial of that number.
    The program should call this function from main() and print the returned result.
    */

    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null || number < 0)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    val factorial = calculateFactorial(number)
    println("Factorial of $number = $factorial")
}