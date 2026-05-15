/*
    Question 7 — Multi-Package Student Management Utility System
    Problem Statement
    Create a Kotlin program that demonstrates how multiple User Defined Packages can work together in a small utility-based project.

    Requirements
    1. Create TWO different packages
    Package 1 - studentutils
    Create these functions:
    Function 1 - validateStudentName()
    Rules:
    name should not be blank
    name should contain only letters and spaces
    return true or false

    Function 2 - formatStudentName()
    Rules:
    convert first letter of every word to uppercase


    Package 2 - gradeutils
    Create these functions:
    Function 1 - calculatePercentage()
    Rules:
    take obtained marks and total marks
    return percentage

    Function 2 - calculateGrade()
    Rules:
    Percentage	Grade
    90+	    A
    75–89	B
    60–74	C
    40–59	D
    Below 40	F
    Return grade as String.

    2. Create another Kotlin file for main() function
    3. Import required functions from both packages
    4. Take input from user
    Take:
    student name
    obtained marks
    total marks

    5. Display Output
    Formatted Name   : value
    Percentage       : value
    Grade            : value 
*/

import studentutils.validateStudentName
import gradeutils.calculatePercentage
import gradeutils.calculateGrade
import studentutils.formatStudentName

fun main()
{
    print("Enter Student Name : ")
    val name = readln().trim()

    print("Enter Obtained Marks : ")
    val marks = readln().trim().toIntOrNull()
    print("Enter Total Marks    : ")
    val totalMarks = readln().trim().toIntOrNull()
    if(marks == null || marks < 0 || totalMarks == null || totalMarks < 0)
    {
        println("Invalid Input")
        return
    }

    if(!validateStudentName(name)) 
    {
        println("Invalid Input")
        return
    }

    if(totalMarks == 0 || marks > totalMarks)
    {
        println("Invalid marks details")
        return
    }

    val percentage = calculatePercentage(marks, totalMarks)

    println("Formatted Name   : ${formatStudentName(name)}")
    println("Percentage       : $percentage")
    println("Grade            : ${calculateGrade(percentage)}")
}