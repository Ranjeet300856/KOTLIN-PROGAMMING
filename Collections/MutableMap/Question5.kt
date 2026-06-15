/*
    Question 5 — Student Grade Lookup System
    Problem Statement
    Create a Kotlin program that works as a Student Grade Lookup System using a MutableMap.

    The program should store:
    Key = Student Name (String)
    Value = Grade (Char) 
*/

fun main()
{
    val studentData = mutableMapOf<String, Char>()
    studentData.put("Ranjeet", 'A')
    studentData.put("Mohit", 'B')
    studentData.put("Aman", 'A')
    studentData.put("Rahul", 'C')

    println("Grade of Aman : ${studentData.get("Aman")}")

    var countAGrade = 0
    for(value in studentData.values)
        if(value == 'A') countAGrade++
    
    println("Students with Grade A : $countAGrade")

    studentData.replace("Rahul", 'B')

    println("\nDisplay Data Using Entries")
    for(entrie in studentData.entries)
    {
        val name = entrie.key
        val grade = entrie.value

        println("Student Name : $name")
        println("Grade        : $grade")
    }
}