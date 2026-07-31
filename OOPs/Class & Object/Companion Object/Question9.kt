//Create a Kotlin program to manage Student ID Cards using a Companion Object Factory Method.
class Student
{
    val studentName: String
    private val studentId: Int
    val studentCourse: String
    private constructor(studentName: String, studentCourse: String, studentId: Int)
    {
        this.studentName = studentName
        this.studentCourse = studentCourse
        this.studentId = studentId
    }

    companion object {
        private var nextStudentId = 1001
        fun createStudent(studentName: String, studentCourse: String): Student
        {
            val student = Student(studentName, studentCourse, nextStudentId)
            nextStudentId++
            return student
        }
    }

    fun displayStudentDetails()
    {
        println("\nStudent Name   : $studentName")
        println("Student Course : $studentCourse")
        println("Student ID     : $studentId")
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun display(list: MutableList<Student>)
{
    for(value in list)
    value.displayStudentDetails()
}

fun main()
{
    val totalStudents = inputInteger("how many students you want to create")
    val students = mutableListOf<Student>()
    for(i in 1..totalStudents)
    {
        val studentName = inputString("Student Name $i")
        val studentCourse = inputString("Student Course")
        val student = Student.createStudent(studentName, studentCourse)
        students.add(student)
    }

    display(students)
}