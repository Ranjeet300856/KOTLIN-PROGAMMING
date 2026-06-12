/*
    Question 5 — Grade Evaluation System
    Problem Statement
    Create a Kotlin program that works as a Grade Evaluation System using an Immutable Map.

    Requirements
    Create an immutable map named gradeRemarks.
    Store the following data:
    'A' -> "Excellent"
    'B' -> "Very Good"
    'C' -> "Good"
    'D' -> "Average"
    'F' -> "Fail"

    Create a variable:
    val studentGrade = 'B'
    Check whether the grade exists in the map.
    If the grade exists, print:
    Grade : B
    Remark : Very Good
    If the grade does not exist, print:
    Invalid Grade

    Additional Test Cases
    Create the following variables:
    val grade1 = 'A'
    val grade2 = 'D'
    val grade3 = 'X'
    Check each grade and print appropriate output.

    Important Requirement
    After printing the remark, also print the following result:
    Rules
    Excellent  -> Scholarship Eligible
    Very Good  -> Scholarship Eligible
    Good       -> Improvement Recommended
    Average    -> Improvement Recommended
    Fail       -> Must Repeat Course 
*/

fun checkGrade(gradeRemarks: Map<Char, String>, grade: Char)
{
    if(gradeRemarks.containsKey(grade))
    {
        println("Grade  : $grade")
        println("Remark : ${gradeRemarks[grade]}")

        val remark = gradeRemarks[grade]
        when(remark)
        {
            "Excellent" -> println("Result : Scholarship Eligible\n")
            "Very Good" -> println("Result : Scholarship Eligible\n")
            "Good" -> println("Result : Improvement Recommended\n")
            "Average" -> println("Result : Improvement Recommended\n")
            "Fail" -> println("Result : Must Repeat Course\n")
        }
    }
    else println("Invalid Grade\n")
}

fun main()
{
    val gradeRemarks = mapOf(
        'A' to "Excellent",
        'B' to "Very Good",
        'C' to "Good",
        'D' to "Average",
        'F' to "Fail"
    )

    val studentGrade = 'B'
    checkGrade(gradeRemarks, studentGrade)

    val grade1 = 'A'
    checkGrade(gradeRemarks, grade1)

    val grade2 = 'D'
    checkGrade(gradeRemarks, grade2)

    val grade3 = 'X'
    checkGrade(gradeRemarks, grade3)
}