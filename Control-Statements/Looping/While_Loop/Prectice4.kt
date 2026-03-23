//Q4th
//Write a Kotlin program using a while loop to reverse a given number.
fun main()
{
    print("Enter a Number : ")
    var number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    if(number == 0)
    {
        println(number)
        return
    }

    val isNegative = number < 0
    number = kotlin.math.abs(number)
    
    var reverse = 0
    while(number != 0)
    {
        reverse = (reverse * 10) + (number % 10)
        number /= 10
    }

    if(isNegative) reverse = -reverse
    println("Reverse = $reverse")
}