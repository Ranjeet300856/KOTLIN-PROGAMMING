//Q8th
/*
    Write a Kotlin function that takes an integer n as input and:

    If n is less than or equal to 0 → return "Invalid Input"
    Count how many digits are in the number
    If the number of digits is even → return "Even Digits"
    If the number of digits is odd → return "Odd Digits"
*/

fun digitIs(n: Int): String
{
    if(n <= 0) return "Invalid Input"
    var number = n
    var count = 0
    while(number != 0)
    {
        count++
        number /= 10
    }

    if(count % 2 == 0) return "Even Digit"
    return "Odd Digit"
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

    println(digitIs(number))
}