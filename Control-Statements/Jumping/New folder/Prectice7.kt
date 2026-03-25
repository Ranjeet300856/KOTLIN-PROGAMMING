//Q7th
/*
    Write a Kotlin program to print a pattern of stars (*).
    Stop printing further rows when the row number becomes 4 using break.
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

    for(i in 1..number)
    {
        if(i == 4)
        {
            break
        }
        for(j in 1..i)
        {
            print("* ")
        }

        println()
    }
}