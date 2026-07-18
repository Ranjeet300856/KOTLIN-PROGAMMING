//Create a Kotlin program to manage student academic information using Single Inheritance.
open class Student(val studentName: String, private val rollNumber: Int, val course: String)
{
    fun displayStudentDetails()
    {
        println("Student Name : $studentName")
        println("Roll Number  : $rollNumber")
        println("Course       : $course")
    }
}

class Result(
    private val totalMarks: Int, 
    val obtainedMarks: Int,
    studentName: String,
    rollNumber: Int,
    course: String
) : Student(studentName, rollNumber, course)
{
    private fun calculatePercentage(): Double = if(totalMarks > 0) obtainedMarks.toDouble() * 100 / totalMarks else 0.0
    fun grade()
    {
        val percentage = calculatePercentage()
        when
        {
            percentage >= 90 -> println("Grade A+")
            percentage >= 75 -> println("Grade A")
            percentage >= 60 -> println("Grade B")
            percentage >= 50 -> println("Grade C")
            else -> println("Grade F")
        }
    }

    fun passOrFail() = if(calculatePercentage() >= 50) println("PASS") else println("FAIL")
    fun displayResult()
    {
        println("\nTotal Marks    : $totalMarks")
        println("Obtained Marks : $obtainedMarks")
        println("Percentages    : %.2f%%".format(calculatePercentage()))
        grade()
        passOrFail()
    }
}

fun main()
{
    val student = Result(100, 90, "Rahul", 101, "BCA")
    student.displayStudentDetails()
    student.displayResult()
}