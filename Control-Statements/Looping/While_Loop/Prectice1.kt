//Q1st
//Write a Kotlin program using a while loop to print numbers from 1 to N.
fun main()
{
    print("Enter a Number : ")
    val n = readln().trim().toIntOrNull()
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    var i = 1
    while(i <= n)
    {
        println(i)
        i++
    }
}