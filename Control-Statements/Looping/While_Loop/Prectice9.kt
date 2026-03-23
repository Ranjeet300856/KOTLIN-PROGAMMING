//Q9th
/*
    Write a Kotlin program using nested while loops to print the following pattern:
    Pattern:
    *
    * *
    * * *
    * * * *
    * * * * *
*/

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
    while(i <= number)
    {
        var j = 1
        while(j <= i)
        {
            print("* ")
            j++
        }
        println()
        i++
    }
}