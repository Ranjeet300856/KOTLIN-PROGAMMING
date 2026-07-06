// Create a Kotlin program to develop a Student Result Management Systemusing a Primary Constructor.
class Student(val studentId: Int, val studentName: String, var studentMarks: Double)
{
    init {
        if(studentMarks < 0 || studentMarks > 100)
        {
            println("Invalid Marks!")
            studentMarks = 0.0
        }
    }

    var studentGrade: Char? = null
    fun calculateGrade()
    {
        when {
            studentMarks >= 90 -> studentGrade = 'A'
            studentMarks >= 75 -> studentGrade = 'B'
            studentMarks >= 60 -> studentGrade = 'C'
            studentMarks >= 40 -> studentGrade = 'D'
            else -> studentGrade = 'F'
        }
    }

    fun isPassed()
    {
        if(studentMarks >= 40) println("Pass")
        else println("Fail")
    }

    fun displayStudentDetails()
    {
        println("Student ID    : $studentId")
        println("Student Name  : $studentName")
        println("Student Marks : %.2f".format(studentMarks))
        println("Student Grade : $studentGrade")
        isPassed()
    }
}

fun main()
{
    print("Enter Student Name  : ")
    val name = readln().trim()
    print("Enter Student ID    : ")
    val id = readln().trim().toIntOrNull()
    print("Enter Student Marks : ")
    val marks = readln().trim().toDoubleOrNull()
    if(name.isBlank() || id == null || id <= 0 || marks == null)
    {
        println("Invalid Input")
        return
    }

    val student = Student(id, name,  marks)
    student.calculateGrade()
    student.displayStudentDetails()
}