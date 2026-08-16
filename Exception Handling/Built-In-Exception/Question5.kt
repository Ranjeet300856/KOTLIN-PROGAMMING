//Write a Kotlin program that takes two numbers as String input from the user and performs integer division.
fun main()
{
    print("Enter Number 1 : ")
    val input1 = readln().trim()
    print("Enter Number 2 : ")
    val input2 = readln().trim()
    if(input1.isBlank() || input2.isBlank())
    {
        println("Invalid Input!")
        return
    }

    try {
        val number1 = input1.toInt()
        val number2 = input2.toInt()
        val result = number1 / number2
        println("Result : $result")
    } catch(e: NumberFormatException) {
        println("Error: Please enter valid integers.")
    } catch(e: ArithmeticException) {
            println("Error: Cannot divide by zero.")
    }

    println("Calculation process completed.")
}