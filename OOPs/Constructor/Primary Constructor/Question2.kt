/*
    Problem Statement:
    Create a Kotlin program to develop a Student Admission System using a
    Primary Constructor with Default Parameter Values.

    Requirements:
    1. Create a class named Student.
    2. Use a Primary Constructor to initialize the following properties:
       - Student ID (Int)
       - Student Name (String)
       - Course Name (String)
       - Student Age (Int)

    3. Set the following Default Values:
       - Course Name = "BCA"
       - Student Age = 18

    4. Create a member function named displayStudentDetails() that displays
       all student information in a clean format.

    5. Create the following objects:
       Student 1:
       - Pass all values.

       Student 2:
       - Do not pass Student Age.
       - Default Age should be used automatically.

       Student 3:
       - Pass only Student ID and Student Name.
       - Both Default Course Name and Default Age should be used.

    6. Display details of all students.
*/

class Student(val studentId: Int, val studentName: String, val courseName: String = "BCA", var studentAge: Int = 18)
{
    fun displayStudentDetails()
    {
        println("\nStudent ID   : $studentId")
        println("Student Name : $studentName")
        println("Course Name  : $courseName")
        println("Student Age  : $studentAge")
    }
}

fun main()
{
    val student1 = Student(1001, "Saloni Suthar", "MSC", 22)
    val student2 = Student(1002, "Rahul Suthar", "BA")
    val student3 = Student(1003, "Ranjeet Suthar")

    student1.displayStudentDetails()
    student2.displayStudentDetails()
    student3.displayStudentDetails()
}