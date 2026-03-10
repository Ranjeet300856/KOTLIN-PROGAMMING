fun factorial(n: Int): Long = if (n == 0) 1L else n * factorial(n - 1) 
fun main()
{
    //Q5th
    /*
    Write a Kotlin program that defines a Single Expression Function named factorial.
    The function should:
    Take one integer parameter n
    Return the factorial of the number
    */

    print("Enter a Number (1-20) : ")
    val number = readln().trim().toIntOrNull()
    if(number == null || number < 0 || number > 20)
    {
        println("Invalid Input! Please Enter a Valid Integer")
        return
    }

    println("Factorial of $number = ${factorial(number)}")
}