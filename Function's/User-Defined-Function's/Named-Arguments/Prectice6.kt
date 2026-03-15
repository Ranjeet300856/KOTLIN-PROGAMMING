/*
Question 6: Student Grade Calculator using Named Arguments and Default Parameters

This program calculates a student's grade based on the marks obtained.
It demonstrates the use of named arguments, default parameters,
input validation, and conditional logic.
*/

fun calculateGrade(studentName: String, marks: Double, passingMarks: Double = 40.0)
{
    val grade = when
    {
        marks >= 90.0 -> 'A'
        marks >= 75.0 -> 'B'
        marks >= 60.0 -> 'C'
        marks >= passingMarks -> 'D'
        else -> 'F' 
    }

    println("Student Name : $studentName")
    println("Marks        : %.2f".format(marks))
    println("Grade        : $grade")
}

fun main()
{
    print("Enter Student Name : ")
    val name = readln().trim()
    print("Enter Marks        : ")
    val marks = readln().trim().toDoubleOrNull()
    if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace() } ||marks == null || marks < 0 || marks > 100)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    calculateGrade(studentName = name, marks = marks)
}