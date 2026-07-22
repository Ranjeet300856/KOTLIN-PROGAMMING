//Create a Kotlin program to manage an online course enrollment system using Multilevel Inheritance.
open class Person(val personName: String, var personAge: Int)
{
    fun displayPersonDetails()
    {
        println("Name : $personName")
        println("Age  : $personAge")
    }
}

open class Student(
    protected val studentId: Int,
    val courseName: String,
    personName: String,
    personAge: Int
) : Person(personName, personAge)
{
    fun displayStudentDetails()
    {
        println("Student ID  : $studentId")
        println("Course Name : $courseName")
    }
}

class EnrolledStudent(
    private val enrollmentId: Long,
    private var courseFee: Double,
    var isCourseCompleted: Boolean,
    studentId: Int,
    courseName: String,
    personName: String,
    personAge: Int
) : Student(studentId, courseName, personName, personAge)
{
    fun displayEnrollmentDetails()
    {
        println("\nEnrollment ID : $enrollmentId")
        println("Course Fees       : %.2f".format(courseFee))
        println("Course Status     : ${if(isCourseCompleted) "Completed" else "No Completed"}")
    }
}

fun main()
{
    val enrolledStudent = EnrolledStudent(1001, 30000.0, false, 5001, "BCA", "Rahul", 18)
    enrolledStudent.displayPersonDetails()
    enrolledStudent.displayStudentDetails()
    enrolledStudent.displayEnrollmentDetails()
}