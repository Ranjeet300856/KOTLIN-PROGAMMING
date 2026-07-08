//Create a Kotlin program to develop a Student Registration System using both Primary Constructor and a Single Secondary Constructor.
class Student(val studentId: Int, val studentName: String, var studentAge: Int)
{
    init {
        println("Primary Constructor Executed")
    }
    constructor(studentName: String, studentAge: Int) : this(0, studentName, studentAge)
    {
        println("Secondary Constructor Executed Successfully")
    }

    fun displayStudentDetails()
    {
        println("Student Name : $studentName")
        println("Student Age  : $studentAge")
        println("Student ID   : $studentId")
    }
}

fun main()
{
    val student1 = Student(1001, "Ranjeet Suthar", 19)
    val student2 = Student("Rahul Suthar", 18)
    
    println("Student 1 Info:")
    student1.displayStudentDetails()
    println("\nStudent 2 Info:")
    student2.displayStudentDetails()
}