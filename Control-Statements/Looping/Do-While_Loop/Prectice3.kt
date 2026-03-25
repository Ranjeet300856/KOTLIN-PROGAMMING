//Q3rd
//Write a Kotlin program to reverse a given integer using a do-while loop.
fun main()
{
    print("Enter a Number : ")
    var input = readln().trim().toIntOrNull()
    if(input == null)
    {
        println("Invalid Number")
        return
    }

    var number = kotlin.math.abs(input)
    var reverse = 0

    if(number == 0)
    {
        println("Reverse = 0")
        return
    }

    do
    {
        val lastDigit = number % 10
        reverse = reverse * 10 + lastDigit
        number /= 10
    }while(number != 0)

    if (input < 0) reverse = -reverse
    println("Reversed number = $reverse")
}