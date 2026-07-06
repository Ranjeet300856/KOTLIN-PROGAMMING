//Create a Kotlin program to develop a Student Result Analyzer using Class and Regular Object.
class Student
{
    var studentName = ""
    var marks = 0.0

    fun calculateGrade(): String
    {
        return when
        {
            marks >= 90 -> "A+"
            marks >= 75 -> "A"
            marks >= 60 -> "B"
            marks >= 45 -> "C"
            else -> "Fail"
        }
    }

    fun displayResult()
    {
        println("\n----------- Student Result -----------\n")
        println("Student Name : $studentName")
        println("Marks        : %.2f".format(marks))
        println("Grade        : ${calculateGrade()}")
        println("--------------------------------------")
    }
}

fun main()
{
    print("Enter Student Name  : ")
    val name = readln().trim()
    print("Enter Student Marks : ")
    val marks = readln().trim().toDoubleOrNull()
    if(name.isBlank() || marks == null || marks < 0 || marks > 100)
    {
        println("Invalid Input")
        return
    }

    val student1 = Student()
    student1.studentName = name
    student1.marks = marks
    student1.displayResult()
}