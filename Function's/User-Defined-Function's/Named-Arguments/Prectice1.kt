/*
Question 1: Student Information Printer using Named Arguments

This program defines a function that prints student information.
The function is called using named arguments with a different order
to demonstrate Kotlin's named argument feature.
*/

fun printStudentInfo(name: String, age: Int, course: String)
{
    println("Student Name: $name")
    println("Student Age: $age")
    println("Course: $course")
}
fun main()
{
    print("Enter Student Name   : ")
    val name = readln().trim()
    print("Enter Student Age    : ")
    val age = readln().trim().toIntOrNull()
    print("Enter Student Course : ")
    val course = readln().trim()
    if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace() } ||  !course.all { it.isLetter() || it.isWhitespace() } ||course.isBlank() || age == null || age <= 0)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    printStudentInfo(age = age, course = course, name = name)
}