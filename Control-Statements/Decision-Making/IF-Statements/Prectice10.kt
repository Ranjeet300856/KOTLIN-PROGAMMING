//Q10th
/*
    Check if a year is in the 21st century
    Write a Kotlin program that takes a year as input and checks whether the year belongs to the 21st century.
    The 21st century includes years from 2001 to 2100.
    If the year is between 2001 and 2100 (inclusive), print:
    The year belongs to the 21st century
    If the year does not belong to the 21st century, the program should print nothing.
*/

fun main()
{
    print("Enter a Year to check year is in the 21st century : ")
    val year = readln().trim().toIntOrNull()
    if(year == null)
    {
        println("Invalid Input! Please Enter a Valid Integer")
        return
    }

    if(year >= 2001 && year <= 2100) println("The year belongs to the 21st century")
}