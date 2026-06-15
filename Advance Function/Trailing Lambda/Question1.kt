/*
    Question 1 — Student Greeting Processor (Basic Level)
    Problem Statement
    Create a Kotlin program that processes a student's name using a Trailing Lambda.

    Requirements
    Create a Higher Order Function named processStudent.
    The function should accept:
    A student's name (String)
    A lambda parameter that receives the student's name and returns Unit.
    Use Trailing Lambda Syntax while calling the function.

    Inside the lambda:
    Display the student's name.
    Display the length of the student's name.
    Use meaningful function and variable names.
    The program should work correctly for any valid student name. 
*/

fun processStudent(name: String, studentInfo: (String) -> Unit) = studentInfo(name)

fun main()
{
    print("Enter Student Name : ")
    val studentName = readln().trim()
    if(studentName.isBlank() || !studentName.all { it.isLetter() || it.isWhitespace()})
    {
        println("Invalid Input")
        return
    }

    processStudent(studentName) {
        name: String ->
        println("Student Name : $name")
        println("Name Length  : ${name.length}")
    }
}