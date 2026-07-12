//Question 10: Student Attendance Management System
class StudentAttendance(val studentName: String, private val totalClasses: Int, private var attendedClasses: Int)
{
    private fun attendancePercentage(): Double = if(totalClasses > 0) (attendedClasses.toDouble() * 100) / totalClasses else 0.0
    fun markAttendance(classes: Int)
    {
        if(classes > 0)
        {
            if(classes + attendedClasses <= totalClasses)
            {
                attendedClasses += classes
                println("Attendance marked successfully")
            }
            else println("Attendance cannot exceed total classes.!")
        }
        else println("Invalid number of classes.")
    }

    fun displayAttendance()
    {
        println("\nStudent Name          : $studentName")
        println("Total Classes         : $totalClasses")
        println("Attended Classes      : $attendedClasses")
        println("Attendance Percentage : %.2f".format(attendancePercentage()))
    }
}

fun inputName(): String
{
    while(true)
    {
        print("Enter Student Name : ")
        val name = readln().trim()
        if(name.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return name
    }
}

fun inputTotalClasses(): Int
{
    while(true)
    {
        print("Enter Total Classes : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputClasses(totalClasses: Int): Int
{
    while(true)
    {
        print("Enter Attended Classes : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0 || input > totalClasses)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    val studentName = inputName()
    val totalClasses = inputTotalClasses()
    val attendedClasses = inputClasses(totalClasses)
    val student = StudentAttendance(studentName, totalClasses, attendedClasses)

    while(true)
    {
        println("\n1. Mark Attendance")
        println("2. Display Attendance")
        println("3. Exit")

        print("\nEnter your choice (1..3) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> {
                val attendance = inputClasses(totalClasses)
                student.markAttendance(attendance)
            }
            2 -> student.displayAttendance()
            3 -> {
                println("Program Exited")
                return
            }

            else -> println("Invalid Choice! Please Enter 1..3")
        }
    }
}