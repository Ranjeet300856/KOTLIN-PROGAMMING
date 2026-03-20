//Q6th
/*
    Write a Kotlin program that determines whether a student is eligible for a scholarship using an else-if ladder.
    Inputs:
    Marks (integer)
    Annual family income (integer)

    Eligibility Rules:
    If marks ≥ 90 and income ≤ 200000 →
    "Full Scholarship"
    Else if marks ≥ 75 and income ≤ 300000 →
    "Partial Scholarship"
    Else if marks ≥ 60 and income ≤ 500000 →
    "Eligible for Financial Aid"
    Else →
    "Not Eligible"
*/

fun main()
{
    print("Enter Marks                : ")
    val marks = readln().trim().toIntOrNull()
    print("Enter Annual Family Income : ")
    val income = readln().trim().toIntOrNull()
    if(marks == null || income ==  null || marks < 0 || marks > 100 || income < 0)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    if(marks >= 90 && income <= 200000) println("Full Scholarship")
    else if(marks >= 75 && income <= 300000) println("Partial Scholarship")
    else if(marks >= 60 && income <= 500000) println("Eligible for Financial Aid")
    else println("Not Eligible")
}