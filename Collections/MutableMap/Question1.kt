/*
    Question 1 — Student Directory Management System (Basic Level)
    Problem Statement
    Create a Kotlin program that works as a Student Directory Management System using a MutableMap.

    The program should store student records where:
    Key = Student ID (Int)
    Value = Student Name (String) 
*/

fun manageStudents(studentData: MutableMap<Int, String>, studentRecord: (MutableMap<Int, String>) -> Unit) = studentRecord(studentData)

fun main()
{
    val students = mutableMapOf<Int, String>()

    manageStudents(students) {
        studentData: MutableMap<Int, String> ->

        studentData.put(101, "Ranjeet")
        studentData.put(102, "Mohit")
        studentData.put(103, "Aman")

        for((key, value) in studentData)
        {
            println("Student ID   : $key")
            println("Student Name : $value")
        }

        studentData[102] = "Mohit Sharma"

        if(studentData.containsKey(103)) println("\nStudent Found")
        else println("Student Not Found")

        val removeKey = studentData.remove(101)
        if(removeKey != null) println("Student Removed Successfully")
        else println("Student ID not found")

        println("\nFinal Student Record: ")
        for((key, value) in studentData)
        {
            println("Student ID   : $key")
            println("Student Name : $value")
        }
    }
}