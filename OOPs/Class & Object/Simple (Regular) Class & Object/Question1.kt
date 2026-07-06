/*
    Question 1: Student Information Management System
    Problem Statement
    Create a Kotlin program to develop a Student Information Management System using Class and Regular Object. 
*/

class Student
{
    var studentName: String = ""
    var rollNumber: Int = 0
    var course: String = ""
    var percentage: Double = 0.0
    var isPassed: Boolean = false

    fun displayStudentInfo()
    {
        println("\n----------- Student Information -----------\n")
        println("Student Name  : $studentName")
        println("Roll Number   : $rollNumber")
        println("Course        : $course")
        println("Percenntage   : %.2f".format(percentage))
        println("Passed        : $isPassed")
        println("\n-------------------------------------------\n")
    }
}

fun main()
{
    val student1 = Student()
    student1.studentName = "Ranjeet Suthar"
    student1.rollNumber = 26249
    student1.course = "BCA"
    student1.percentage = 80.1400
    student1.isPassed = true
    student1.displayStudentInfo()
}