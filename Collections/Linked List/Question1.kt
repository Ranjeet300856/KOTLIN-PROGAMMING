/*
    Question 1: Student Name Management System Using LinkedList
    Problem Statement:
    Create a Kotlin program to develop a Student Name Management System using LinkedList Collection.

    The program should perform the following operations:
    Requirements:
    Create a LinkedList that stores student names (String data type).
    Add the following student names into the LinkedList:
    Rahul
    Aman
    Neha
    Priya

    Add a new student:
    Add "Vikas" at the beginning of the LinkedList.
    Add "Rohit" at the end of the LinkedList.

    Access and display:
    The first student name.
    The last student name.
    The student name available at index 3.

    Update:
    Change "Aman" to "Amit".
    Remove:
    Remove the first student.
    Remove the student "Neha" from the LinkedList.

    Search and Check:
    Check whether "Priya" is available in the LinkedList or not.
    Display the total number of students.
    Display all student names using a loop. 
*/

import java.util.LinkedList

//Display Function
fun display(list: LinkedList<String>)
{
    var i = 1
    for(value in list)
    {
        println("$i. $value")
        i++
    }
}

//Main Function
fun main()
{
    //Creation and Display Linked List
    val studentNames = LinkedList<String>()
    studentNames.add("Rahul")
    studentNames.add("Aman")
    studentNames.add("Neha")
    studentNames.add("Priya")
    println("List after creation:")
    display(studentNames)

    //Add Operation
    studentNames.addFirst("Vikas")
    studentNames.addLast("Rohit")
    println("\nList after add first and add last operation:")
    display(studentNames)

    //Access and Display
    println("\nFirst Student      : ${studentNames.first()}")
    println("Last Student       : ${studentNames.last()}")
    println("Student at index 3 : ${studentNames.get(3)}")

    //Update Operation
    if(studentNames.contains("Aman"))
    {
        val index = studentNames.indexOf("Aman")
        studentNames[index] = "Amit"
    }
    else println("Aman not found")
    println("\nList after update operation:")
    display(studentNames)

    //Remove Operation
    if(studentNames.isNotEmpty())
    {
        studentNames.removeFirst()
        if(studentNames.contains("Neha")) studentNames.remove("Neha")
        else println("Neha not found")
    }
    else println("\nList is empty")
    println("\nList after remove operation:")
    display(studentNames)

    //Search Operation
    if(studentNames.contains("Priya")) println("\nPriya is available")
    else println("\nPriya is not available")

    //Total Students
    println("Total Students : ${studentNames.size}")
    println("Final List:")
    display(studentNames)
}