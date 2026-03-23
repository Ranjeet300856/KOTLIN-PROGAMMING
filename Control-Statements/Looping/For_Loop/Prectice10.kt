//Q10th
//Write a Kotlin program to print the Fibonacci series up to N terms using a for loop.
fun main()
{
    print("Enter a Number : ")
    val n = readln().trim().toIntOrNull()
    if(n == null || n <= 0)
    {
        print("Invalid Input")
        return
    }

    print("Fibonacci Series: ")
    var a = 0
    var b = 1
    for (i in 1..n) 
    {
        print("$a ")
        val next = a + b
        a = b
        b = next
    }
}