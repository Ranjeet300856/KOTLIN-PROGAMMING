//Create a Kotlin program to manage a student scholarship system using Multilevel Inheritance.
open class Person(val personName: String, var personAge: Int)
{
    fun displayPersonDetails()
    {
        println("\nName                    : $personName")
        println("Age                     : $personAge")
    }        
}        

open class Student(
    protected val studentId: Int,
    val studentCourse: String,
    personName: String,
    personAge: Int
) : Person(personName, personAge)
{
    fun displayStudentDetails()
    {
        displayPersonDetails()
        println("Student ID              : $studentId")
        println("Student Course          : $studentCourse")
    }
}

class ScholarshipStudent(
    val percentage: Double,
    private var annualIncome: Double,
    studentId: Int,
    studentCourse: String,
    personName: String,
    personAge: Int
) : Student(studentId, studentCourse, personName, personAge)
{
    fun displayScholarshipDetails()
    {
        displayStudentDetails()
        println("Percentage              : %.2f".format(percentage))
        println("Annual Income           : %.2f".format(annualIncome))
        if(percentage >= 85 && annualIncome <= 300000)
        println("Scholarship Status      = Eligible")
        else println("Scholarship Status = Not Eligible")
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
        if(input == null || input < 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputPercentage(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input < 0 || input > 100)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    val personName = inputString("Student Name")
    val personAge = inputInteger("Student Age")
    val studentId = inputInteger("Student ID")
    val studentCourse = inputString("Student Course")
    val percentage = inputPercentage("Percentage")
    val annualIncome = inputDouble("Annual Income")

    val scholarshipStudent = ScholarshipStudent(percentage, annualIncome, studentId, studentCourse, personName, personAge)
    scholarshipStudent.displayScholarshipDetails()
}