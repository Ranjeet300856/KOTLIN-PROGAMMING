//Q2nd
//Write a Kotlin program to calculate the sum of first N natural numbers using a do-while loop.
fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null || number <= 0)
    {
        println("Invalid Input")
        return
    }

    var i = 1
    var sum = 0
    do
    {
        sum += i
        i++
    }while(i <= number)

    println("Sum = $sum")
}