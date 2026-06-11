/*
    Question 1 — Unique Student Registration System

    Problem Statement:
    Create a Kotlin program for a college workshop registration system
    using MutableSet. The system should store only unique student names,
    check registrations, remove a student, and display updated details.
*/

fun main()
{
    val collegeStudents = mutableSetOf("Ranjeet", "Aman", "Neha", "Ravi", "Aman", "Neha")

    println("\nAll registered students : $collegeStudents")
    println("Total registered students : ${collegeStudents.size}")
    
    if("Ravi" in collegeStudents) println("\nRavi is registered")
    else println("\nRavi is not registered")

    if("Mohit" in collegeStudents) println("Mohit is registered")
    else println("Mohit is not registered")

    if("Neha" in collegeStudents)
    {
        collegeStudents.remove("Neha")
        println("\nNeha removed successfully")
    }
    else println("\nNeha not registered in list")
    
    println("Updated registered list                 : $collegeStudents")
    println("Total registered students after updated : ${collegeStudents.size}")
} 