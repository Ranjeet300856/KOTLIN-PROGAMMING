//Question 4: Student Range Viewer Using TreeMap
import java.util.TreeMap

fun inputRollNumber(): Int
{
    while(true)
    {
        print("\nEnter Roll Number : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inpuStudentName(): String
{
    while(true)
    {
        print("Enter Student Name : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun addStudent(students: TreeMap<Int, String>)
{
    while(true)
    {
        val rollNumber = inputRollNumber()
        if(students.containsKey(rollNumber))
        {
            println("Student already exists.")
            continue
        }

        val studentName = inpuStudentName()
        students.putIfAbsent(rollNumber, studentName)
        println("Student Added Successfully")
        break
    }
}

fun hasStudents(students: TreeMap<Int, String>): Boolean
{
    if(students.isEmpty())
    {
        println("No student found.")
        return false
    }
    else return true
}

fun studentsBefore(students: TreeMap<Int, String>)
{
    if(!hasStudents(students)) return
    val rollNumber = inputRollNumber()
    val beforeRollNumber = students.headMap(rollNumber)
    if(beforeRollNumber.isEmpty()) println("No Student Found")
    else
    {
        println()
        for((key, value) in beforeRollNumber)
        println("$key -> $value")
    }
}

fun studentsAfter(students: TreeMap<Int, String>)
{
    if(!hasStudents(students)) return
    val rollNumber = inputRollNumber()
    val afterRollNumber = students.tailMap(rollNumber)
    if(afterRollNumber.isEmpty()) println("No Student Found")
    else
    {
        println()
        for((key, value) in afterRollNumber)
        println("$key -> $value")
    }
}

fun studentsBetween(students: TreeMap<Int, String>)
{
    if(!hasStudents(students)) return
    val startingRollNumber = inputRollNumber()
    val endingRollNumber = inputRollNumber()
    if(startingRollNumber >= endingRollNumber)
    {
        println("Invalid Range!")
        return
    }
    val subStudents = students.subMap(startingRollNumber, endingRollNumber)
    if(subStudents.isEmpty()) println("No Student Found")
    else
    {
        println()
        for((key, value) in subStudents)
        println("$key -> $value")
    }
}

fun main()
{
    println("\n===== Student Range Viewer =====\n")
    val students = TreeMap<Int, String>()
    while(true)
    {
        println("\n1. Add Student")
        println("2. Display Students Before Roll Number")
        println("3. Display Students After Roll Number")
        println("4. Display Students Between Two Roll Numbers")
        println("5. Exit")

        print("\nEnter your choice (1..5) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addStudent(students)
            2 -> studentsBefore(students)
            3 -> studentsAfter(students)
            4 -> studentsBetween(students)
            5 -> {
                println("Program Exited")
                break
            }

            else -> println("Invalid Choice! Enter 1..5")
        }
    }
}