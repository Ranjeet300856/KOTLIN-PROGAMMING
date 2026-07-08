/*
    Create a Kotlin program to develop a Student Management System
    using Primary Constructor, Multiple Secondary Constructors,
    Constructor Chaining, MutableList, and a Menu Driven Program. 
*/

class Student(val studentId: Int, val studentName: String, var studentAge: Int, val studentCourse: String)
{
    init {
        if(studentAge !in 18..60)
        {
            println("Invalid student age! age assign 18 in autometic")
            studentAge = 18
        }
        println("Primary constructor executed")
    }

    constructor(studentName: String, studentAge: Int) : this(0, studentName, studentAge, "Not Assigned")
    {
        println("1st secondary constructor executed")
    }

    constructor(studentName: String) : this(studentName, 18)
    {
        println("2nd secondary constructor executed")
    }

    fun displayStudentDetails()
    {
        println("Student Id     : $studentId")
        println("Student Name   : $studentName")
        println("Student Age    : $studentAge")
        println("Student Course : $studentCourse")
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
            println("Invalid Name! Try Again")
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
            println("Invalid Input! Try Again")
            continue
        }

        return id    
    }
}

fun inputAge(): Int
{
    while(true)
    {
        print("Enter Student Age : ")
        val age = readln().trim().toIntOrNull()
        if(age == null || age <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return age   
    }
}

fun inputCourse(): String
{
    while(true)
    {
        print("Enter Student Course : ")
        val course = readln().trim()
        if(course.isBlank())
        {
            println("Invalid Name! Try Again")
            continue
        }

        return course
    }
}

fun main()
{
    val students = mutableListOf<Student>()
    println("\n-----------------------------")
    println("Student Management System")
    println("-----------------------------\n")
    
    while(true)
    {
        println("\n1. Add Student")
        println("2. Display All Students")
        println("3. Search Student By Name")
        println("4. Exit")

        print("\nEnter your choice (1 - 4) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> {
                println("1. Press 1 to call primary constructor")
                println("2. Press 2 to call 1st secondary constructor")
                println("3. Press 3 to call 2nd secondary constructor")

                val input = readln().trim().toIntOrNull()
                if(input == null || input !in 1..3)
                {
                    println("Invalid Input! Try Again")
                    continue
                }

                when(input)
                {
                    1 -> {
                        val studentName = inputName()
                        val studentAge = inputAge()
                        val studentId = inputId()
                        val studentCourse = inputCourse()
                        val student = Student(studentId, studentName, studentAge, studentCourse)
                        students.add(student)
                    }

                    2 -> {
                        val studentName = inputName()
                        val studentAge = inputAge()
                        val student = Student(studentName, studentAge)
                        students.add(student)
                    }

                    3 -> {
                        val studentName = inputName()
                        val student = Student(studentName)
                        students.add(student)
                    }
                }
            }

            2 -> {
                if(students.isEmpty()) println("No student found")
                else
                {
                    var i = 1
                    for(student in students)
                    {
                        println("\nStudent $i Details:")
                        student.displayStudentDetails()
                        i++
                    }
                }
            }

            3 -> {
                val studentName = inputName()
                var found = false
                for(student in students)
                {
                    if(student.studentName.lowercase() == studentName.lowercase())
                    {
                        println("Student Found")
                        student.displayStudentDetails()
                        found = true
                        break
                    }
                }
                
                if(!found) println("Student Not Found.")
            }

            4 -> {
                println("Program exit successfully")
                break
            }

            else -> println("Invalid choice input please enter 1-4")
        }
    }
}