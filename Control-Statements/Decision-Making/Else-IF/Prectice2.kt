//Q2nd
/*
    Problem Statement (English format for GitHub):
    Write a Kotlin program that takes a student's marks (integer) as input and prints the corresponding grade using an else-if ladder.
    Grading Criteria:
    Marks ≥ 90 → Grade A
    Marks ≥ 75 and < 90 → Grade B
    Marks ≥ 60 and < 75 → Grade C
    Marks ≥ 40 and < 60 → Grade D
    Marks < 40 → Grade F
*/

fun main()
{
    print("Enter Marks : ")
    val marks = readln().trim().toIntOrNull()
    if(marks == null || marks < 0 || marks > 100)
    {
        println("Invalid Marks! Please enter a value between 0 and 100.")
        return
    }

    if(marks >= 90) println("Grade A")
    else if(marks >= 75) println("Grade B")
    else if(marks >= 60) println("Grade C")
    else if(marks >= 40) println("Grade D")
    else println("Grade F")
}