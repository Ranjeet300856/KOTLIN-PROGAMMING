//Question 1: Student Marks Management System Using TreeMap
import java.util.TreeMap

fun inputRollNumber(): Int
{
    while(true)
    {
        print("Enter Roll Number : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputMarks(): Int
{
    while(true)
    {
        print("Enter Marks : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input < 0 || input > 100)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun checkEmpty(studentMarks: TreeMap<Int, Int>): Boolean
{
    if(studentMarks.isEmpty())
    {
        println("No Data Available")
        return false
    }
    return true
}

fun addStudent(studentMarks: TreeMap<Int, Int>)
{
    while(true)
    {
        var rollNumber = inputRollNumber()
        if(studentMarks.containsKey(rollNumber))
        {
            println("Student already exists.")
            continue
        }

        val marks = inputMarks()
        studentMarks[rollNumber] = marks
        println("Student Added Successfully")
        break
    }
}

fun updateMarks(studentMarks: TreeMap<Int, Int>)
{
    val rollNumber = inputRollNumber()
    if(!studentMarks.containsKey(rollNumber))
    {
        println("Student not found.")
        return
    }

    val newMarks = inputMarks()
    studentMarks.replace(rollNumber, newMarks)
    println("Updated Successfully")
}

fun searchStudent(studentMarks: TreeMap<Int, Int>)
{
    val rollNumber = inputRollNumber()
    if(!studentMarks.containsKey(rollNumber))
    {
        println("Student not found.")
        return
    }

    println("Student Found")
    println("Roll Number : $rollNumber")
    println("Marks       : ${studentMarks[rollNumber]}")
}

fun removeStudent(studentMarks: TreeMap<Int, Int>)
{
    val rollNumber = inputRollNumber()
    if(!studentMarks.containsKey(rollNumber))
    {
        println("Student not found.")
        return
    }

    studentMarks.remove(rollNumber)
    println("Student Removed")
}

fun displayInfo(studentMarks: TreeMap<Int, Int>)
{
    if(!checkEmpty(studentMarks)) return
    println("\nRoll No.\tMarks")
    for((key, value) in studentMarks.entries)
    println("$key\t\t$value")
}

fun displayFirstStudent(studentMarks: TreeMap<Int, Int>)
{
    if(!checkEmpty(studentMarks)) return
    println("First Student : ${studentMarks.firstEntry()}")
}

fun displayLastStudent(studentMarks: TreeMap<Int, Int>)
{
    if(!checkEmpty(studentMarks)) return
    println("Last Student : ${studentMarks.lastEntry()}")
}

fun main()
{
    val studentMarks = TreeMap<Int, Int>()
    println("\n===== Student Marks Management =====\n")
    while(true)
    {
        println("\n1. Add Student")
        println("2. Update Marks")
        println("3. Search Student")
        println("4. Remove Student")
        println("5. Display All Students")
        println("6. Display First Student")
        println("7. Display Last Student")
        println("8. Exit")

        print("\nEnter your choice : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addStudent(studentMarks)
            2 -> updateMarks(studentMarks)
            3 -> searchStudent(studentMarks)
            4 -> removeStudent(studentMarks)
            5 -> displayInfo(studentMarks)
            6 -> displayFirstStudent(studentMarks)
            7 -> displayLastStudent(studentMarks)
            8 -> {
                println("Program exited")
                break
            }

            else -> println("Invalid Choice! Please Enter 1..8")
        }
    }
}