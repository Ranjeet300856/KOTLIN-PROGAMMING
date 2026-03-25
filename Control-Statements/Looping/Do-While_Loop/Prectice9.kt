//Q9th
//Write a Kotlin program to find the largest digit in a given number using a do-while loop.
fun main()
{
    print("Enter a Number : ")
    var input = readln().trim().toIntOrNull()
    if(input == null)
    {
        println("Invalid Input")
        return
    }

    var number = kotlin.math.abs(input)
    var max = 0
    do
    {
        var digit = number % 10
        if(digit > max) max = digit

        number /= 10
    }while(number != 0)

    println("Largest Number = $max")
}