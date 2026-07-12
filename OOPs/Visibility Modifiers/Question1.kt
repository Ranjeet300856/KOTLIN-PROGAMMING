/*
    Question 1: Student Profile Management Using Visibility Modifiers
    Problem Statement:
    Create a Kotlin program to manage a student's profile using
    appropriate Visibility Modifiers.

    Requirements:
    1. Create a class named Student.
    2. The class should contain the following properties:
       - studentId (Int)
       - studentName (String)
       - studentAge (Int)
       - studentCourse (String)

    3. Apply appropriate Visibility Modifiers:
       - studentId should be public.
       - studentName should be public.
       - studentAge should be private.
       - studentCourse should be public.

    4. Create a public function:
       displayStudentDetails()
       It should display all student details including age.

    5. Create another public function:
       updateAge(newAge: Int)
       Conditions:
       - Age must be between 18 and 60.
       - If the age is valid, update it.
       - Otherwise display:
         "Invalid age! Age must be between 18 and 60."

    6. In main():
       - Create one Student object.
       - Display student details.
       - Update age with a valid value.
       - Display student details again.
       - Update age with an invalid value.
       - Display student details again.
*/

class Student(val studentId: Int, val studentName: String, private var studentAge: Int, val studentCourse: String)
{
    fun displayStudentDetails()
    {
        println("Student ID     : $studentId")
        println("Student Name   : $studentName")
        println("Student Age    : $studentAge")
        println("Student Course : $studentCourse\n")
    }

    fun updateAge(newAge: Int)
    {
        if(newAge in 18..60)
        {
            studentAge = newAge
            println("Student Age Update Successfully")
        }
        else println("Invalid age! Age must be between 18 and 60.")
    }
}

fun main()
{
    val student = Student(1001, "Ranjeet Suthar", 19, "BCA")
    student.displayStudentDetails()
    student.updateAge(20)
    student.displayStudentDetails()
    student.updateAge(17)
    student.displayStudentDetails()
}