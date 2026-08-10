//Create a Kotlin program to demonstrate Hierarchical Inheritance for a student result management system.
open class Student(val studentName: String, protected val rollNumber: Int)
{
    fun displayStudentInfo()
    {
        println("Student Name : $studentName")
        println("Roll Number  : $rollNumber")
    }
}

class TheoryStudent(val theoryMarks: Int, studentName: String, rollNumber: Int) : Student(studentName, rollNumber)  
{
    fun displayTheoryMarks()
    {
        println("Theory Student")
        displayStudentInfo()
        println("Theory Marks : $theoryMarks")
    }
}

class PracticalStudent(val PracticalMarks: Double, studentName: String, rollNumber: Int) : Student(studentName, rollNumber)
{
    fun displayPracticalMarks()
    {
        println("\nPractical Student:")
        displayStudentInfo()
        println("Practical Marks : %.2f".format(PracticalMarks))
    }
}

fun main()
{
    val theoryStudent = TheoryStudent(80, "Aman",  1001)
    val PracticalStudent = PracticalStudent(90.80, "Rahul", 1002)

    theoryStudent.displayTheoryMarks()
    PracticalStudent.displayPracticalMarks()
}