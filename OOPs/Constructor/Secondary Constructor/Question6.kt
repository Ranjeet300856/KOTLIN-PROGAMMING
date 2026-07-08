//Create a Kotlin program to develop a Student Result System using a Primary Constructor and a Single Secondary Constructor.
class Student(val rollNumber: Int, val studentName: String, var marks: Double)
{
    init {
        if(marks < 0 || marks > 100)
        {
            println("Invalid Marks!")
            marks = 0.0
        }

        println("Primary constructor executed")
    }
    constructor(studentName: String, marks: Double) : this(0, studentName, marks) 
    {
        println("Secondary constructor executed")
    }

    fun displayStudentResult()
    {
        println("Student roll number : $rollNumber")
        println("Student name        : $studentName")
        println("Marks               : %.2f".format(marks))
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

fun inputRollNumber(): Int
{
    while(true)
    {
        print("Enter Student Roll Number : ")
        val rollNumber = readln().trim().toIntOrNull()
        if(rollNumber == null || rollNumber <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return rollNumber    
    }
}

fun inputMarks(): Double
{
    while(true)
    {
        print("Enter Marks : ")
        val marks = readln().trim().toDoubleOrNull()
        if(marks == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return marks
    }
}

fun main()
{
    println("Press 1 to call primary constructor")
    println("Press 2 to call secondary constructor")
    print("Enter your choice (1 or 2) : ")
    val choice = readln().trim().toIntOrNull()
    if(choice == null)
    {
        println("Invalid Input!")
        return
    }

    if(choice == 1)
    {
        val name = inputName()
        val rollNumber = inputRollNumber()
        val marks = inputMarks()
        val student = Student(rollNumber, name, marks)
        student.displayStudentResult()
    }

    else if(choice == 2)
    {
        val name = inputName()
        val marks = inputMarks()
        val student = Student(name, marks)
        student.displayStudentResult()
    }

    else println("Invalid Choice Please Enter 1 or 2")
}