//Q4th
//Write a Kotlin program to count the number of digits in a given integer using a do-while loop.
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
    var count = 0
    do
    {
        count++
        number /= 10
    }while(number != 0)

    println("Total Digits = $count")
}