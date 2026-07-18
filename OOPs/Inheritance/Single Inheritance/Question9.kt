//Create a Kotlin program to manage online course enrollment using Single Inheritance.
open class Course(val courseName: String, val courseId: Int, protected var courseFee: Double)
{
    fun displayCourseDetails()
    {
        println("Course Name : $courseName")
        println("Course ID   : $courseId")
        println("Course Fee  : %.2f".format(courseFee))
    }
}

class Enrollment(
    val studentName: String,
    private var isEnrolled: Boolean,
    var amountPaid: Double,
    courseName: String,
    courseId: Int,
    courseFee: Double
) : Course(courseName, courseId, courseFee)
{
    fun enrolledStudent()
    {
        if(isEnrolled) println("Student is already enrolled")
        else
        {
            isEnrolled = true
            println("Student Enrolled Successfully")
        }
    }
    
    fun cancelEnrollment()
    {
        if(isEnrolled)
        {
            isEnrolled = false
            println("Enrollment canceled successfully")
        }
        else println("Student not enrolled")
    }

    fun payFee(amount: Double)
    {
        if(isEnrolled)
        {
            if(amountPaid + amount <= courseFee)
            {
                amountPaid += amount
                println("Payment successfully")
            }
            else println("Your entered amount is more than course fee!")
        }
        else println("Student not enrolled")
    }

    fun calculateRemainingFee(): Double
    {
        if(isEnrolled) return courseFee - amountPaid
        else
        {
            println("Student not enrolled")
            return 0.0
        }
    }

    fun displayEnrollmentDetails()
    {
        println("\nStudent Name : $studentName")
        println("Enrollment Status : ${if(isEnrolled) "Student Enrolled In Course" else "Student Not Enrolled In Course"}")
        println("Amount Paid : %.2f".format(amountPaid))
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

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputBoolean(text: String): Boolean
{
    while(true)
    {
        val input = inputString("Yes or No for $text")
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else 
        {
            println("Invalid Input! Try Again")
        }
    }
}

fun main()
{
    val courseName = inputString("Course Name")
    val courseId = inputInteger("Course ID")
    val courseFee = inputDouble("Course Fees")
    val studentName = inputString("Student Name")
    val amountPaid = inputDouble("Paid Amount")
    val isEnrolled = inputBoolean("Enrollment")

    val enrollment = Enrollment(studentName, isEnrolled, amountPaid, courseName, courseId, courseFee)

    enrollment.enrolledStudent()
    val newAmount = inputDouble("New Paid Amount")
    enrollment.payFee(newAmount)
    enrollment.displayCourseDetails()
    enrollment.displayEnrollmentDetails()
    
    val remainingFee = enrollment.calculateRemainingFee()
    println("Remaining Fees : %.2f".format(remainingFee))
}