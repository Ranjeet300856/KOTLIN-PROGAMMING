/*
    Question 1 — Student Directory Lookup
    Problem Statement

    Create a Kotlin program to manage a small student directory using an Immutable Map.

    Requirements
    Create an immutable map named students.
    Store the following data:
    101 -> "Ranjeet"
    102 -> "Mohit"
    103 -> "Ravi"
    104 -> "Amit"
    105 -> "Neha"

    Print the complete map.
    Print the total number of students.
    Print all student IDs.
    Print all student names.
    Print the name of the student whose ID is 103.
    Check whether student ID 106 exists or not.
    Check whether the student name "Neha" exists or not.
    Print appropriate messages for all checks. 
*/

fun main()
{
    val students = mapOf(
        101 to "Ranjeet",
        102 to "Mohit",
        103 to "Ravi",
        104 to "Amit",
        105 to "Neha"
    )

    println("All Pairs         : $students")
    println("Total Students    : ${students.size}")
    println("All Students Ids  : ${students.keys}")
    println("All Students Name : ${students.values}")

    println("\nStudent Name whose is 103 : ${students[103]}")
    
    if(students.containsKey(106)) println("\nYes Student Id 106 is exists")
    else println("\nStudent Id 106 dose not exists")

    if(students.containsValue("Neha")) println("Student Name Neha is exists")
    else println("Student Name Neha dose not exists")
}