//Q3rd
/*
    Write a Kotlin function that takes an integer marks as input and returns grade based on the following rules:

    If marks is less than 0 or greater than 100 → return "Invalid Marks"
    If marks is 90 or above → return "Grade A"
    If marks is 75 to 89 → return "Grade B"
    If marks is 50 to 74 → return "Grade C"
    If marks is below 50 → return "Fail" 
*/

fun result(marks: Int): String
{
    if(marks < 0 || marks > 100) return "Invalid Marks"
    if(marks >= 90) return "Grade A"
    if(marks >= 75) return "Grade B"
    if(marks >= 50) return "Grade C"
    else return "Fail"
}

fun main()
{
    print("Enter Marks : ")
    val marks = readln().trim().toIntOrNull()
    if(marks == null)
    {
        println("Invalid Input")
        return
    }

    println(result(marks))
}