//Q8th
//Check whether a number is a perfect number using break

fun main() 
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if (number == null || number <= 0) 
    {
        println("Invalid Input")
        return
    }

    var sum = 0
    for (i in 1 until number) 
    {
        if (number % i == 0)  sum += i
        if (sum > number) break
    }

    if (sum == number) println("$number is a Perfect Number")
    else println("$number is Not a Perfect Number")
}