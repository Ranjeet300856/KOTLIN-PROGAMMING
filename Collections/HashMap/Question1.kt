/*
    Question 1: Student Name Management System Using HashMap
    Problem Statement:
    Create a Kotlin program to develop a Student Name Management System using HashMap Collection.

    The program should allow users to manage student names through a Menu Driven Program.
    Features:

    1. Add a new student.
       - Student ID must be unique.
       - Student name should not be blank.
       - If Student ID already exists, display an appropriate message.

    2. Display all students.
       - Display Student ID and Student Name.

    3. Search a student by Student ID.
       - If Student ID exists, display the student details.
       - Otherwise display "Student not found."

    4. Update student name.
       - Update only if Student ID exists.
       - New student name should not be blank.

    5. Remove a student.
       - Remove only if Student ID exists.

    6. Display total number of students.
    7. Check whether the HashMap is empty.
    8. Exit.
*/

fun inputName(): String
{
    while(true)
    {
        print("Enter Student Name : ")
        val name = readln().trim()
        if(name.isBlank())
        {
            println("Invalid Student Name!")
            continue
        }

        return name
    }
}

fun inputId(): Int
{
    while(true)
    {
        print("Enter Student ID : ")
        val id = readln().trim().toIntOrNull()
        if(id == null || id <= 0)
        {
            print("Invalid Id!")
            continue
        }

        return id
    }
}

fun checkEmpty(students: HashMap<Int, String>): Boolean
{
    if(students.isEmpty())
    {
        println("No Data Available")
        return true
    }
    else return false
}

fun addNewStudent(students: HashMap<Int, String>) 
{
    val studentName = inputName()
    val studentId = inputId()
    if(!students.containsKey(studentId))
    {
        students.put(studentId, studentName)
        println("Student added successfully.")
    }
    else println("Student ID already exists.")
}

fun displayData(students: HashMap<Int, String>) 
{
    if(checkEmpty(students)) return
    println("Student Data:")
    for((key, value) in students.entries)
    println("$key  :  $value")
    println()
}

fun searchStudent(students: HashMap<Int, String>) 
{
    if(checkEmpty(students)) return
    val studentId = inputId()
    if(students.containsKey(studentId))
    {
        println("Student Found:")
        println("$studentId  :  ${students.get(studentId)}")
    }
    else println("Student not found.")
}

fun updateStudent(students: HashMap<Int, String>) 
{
    if(checkEmpty(students)) return
    val studentId = inputId()
    val newName = inputName()
    if(students.containsKey(studentId))
    {
        students.replace(studentId, newName)
        println("Student data updated successfully")
    }
    else println("This student id not exists")
}

fun removeStudent(students: HashMap<Int, String>) 
{
    if(checkEmpty(students)) return
    val studentId = inputId()

    if(students.containsKey(studentId))
    {
        students.remove(studentId)
        println("Student removed successfully")
    }
    else println("Student id not exists ")
}

fun displaySize(students: HashMap<Int, String>) = println("Total Students : ${students.size}")
fun checkHashMapEmpty(students: HashMap<Int, String>)
{
    if(students.isEmpty()) println("HashMap Is Empty")
    else println("HashMap Is Not Empty")
}

fun main()
{
    println("\n===== Student Grade Management System =====\n")
    val students = HashMap<Int, String>()
    while(true)
    {
        println("\n1. Add new student")
        println("2. Display all students.")
        println("3. Search a student")
        println("4. Update student name")
        println("5. Remove a student")
        println("6. Display total number of students.")
        println("7. Check whether the HashMap is empty.")
        println("8. Exit the program")

        print("\nEnter choice (1-8) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addNewStudent(students)
            2 -> displayData(students)
            3 -> searchStudent(students)
            4 -> updateStudent(students)
            5 -> removeStudent(students)
            6 -> displaySize(students)
            7 -> checkHashMapEmpty(students)
            8 -> {
                println("Program exit successfully")
                break
            }

            else -> println("Invalid Choice! Please Enter 1..8")
        }
    }
}