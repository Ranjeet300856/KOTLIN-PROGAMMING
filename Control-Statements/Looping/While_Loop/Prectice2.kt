//Q2nd
//Write a Kotlin program using a while loop to print the sum of first N natural numbers.
fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null || number <= 0)
    {
        println("Invalid Input")
        return
    }

    var sum = 0
    var i = 1
    while(i <= number)
    {
        sum += i 
        i++
    }

    println("Sum : $sum")
}