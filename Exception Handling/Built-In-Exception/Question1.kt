//Write a Kotlin program that takes two integers from the user and performs integer division.
fun main()
{
    print("Enter dividend : ")
    val number1 = readln().trim().toIntOrNull()
    print("Enter divisor : ")
    val number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Invalid Number!")
        return
    }

    try {
        val result = number1 / number2
        println("Result : $result")
    }
    catch(e: ArithmeticException) {
        println("Error: Cannot divide by zero.")
    }
    println("Operation completed.")
}