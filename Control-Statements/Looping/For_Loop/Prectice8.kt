//Q8th
//Write a Kotlin program to print an inverted right-angled triangle star pattern using for loops.
fun main()
{
    print("Enter a Number : ")
    val n = readln().trim().toIntOrNull()
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    for(i in n downTo 1)
    {
        for(j in 1..i)
        {
            print("* ")
        }
        println()
    }
}