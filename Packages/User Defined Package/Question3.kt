/*
    Question 3 — Nested Package Creation and Access
    Problem Statement
    Create a Kotlin program that demonstrates the use of Nested Packages in Kotlin.

    Requirements
    1. Create a Nested Package: college.student
    2. Inside this nested package, create a function: getStudentDetails()
    This function should:
    take student name
    take student course
    return a formatted string

    3. Create another Kotlin file for main() function
    4. Import the function from the Nested Package
    5. Take input from the user
    Take:
    student name
    student course

    6. Display Output
*/

import college.student.getStudentDetails

fun main()
{
    print("Enter Student Name   : ")
    val name = readln().trim()
    print("Enter Student Course : ")
    val course = readln().trim()
    if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace()} || !course.all { it.isLetter() || it.isWhitespace()})
    {
        println("Invalid Name")
        return
    }

    if(course.isBlank() || !course.all { it.isLetter() || it.isWhitespace()})
    {
        println("Invalid Course")
        return
    }

    println(getStudentDetails(name, course))
}