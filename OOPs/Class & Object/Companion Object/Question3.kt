//Create a Kotlin program to manage the passing marks of students using a Companion Object.
class Student(val studentName: String, private var studentMarks: Int)
{
    companion object
    {
        private var passingMarks = 33
        fun updatePassingMarks(newMarks: Int)
        {
            if(newMarks < 0 || newMarks > 100)
            {
                println("Invalid Passing Marks!")
                return
            }
            passingMarks = newMarks
            println("Passing Marks Updated Successfully")
        }
        fun displayPassingMarks() = println("Current Passing Marks : $passingMarks")
    }

    fun checkResult()
    {
        println("\nStudent Name  : $studentName")
        println("Student Marks : $studentMarks")
        println("Result        : ${if(studentMarks >= passingMarks) "PASS" else "FAIL"}")
    }
}

fun main()
{
    val student1 = Student("Ranjeet", 80)
    val student2 = Student("Rahul", 90)
    val student3 = Student("Aman", 100)
    val student4 = Student("Neha", 20)
    val student5 = Student("Ravi", 35)

    student1.checkResult()
    student2.checkResult()
    student3.checkResult()
    student4.checkResult()
    student5.checkResult()

    Student.updatePassingMarks(40)
    Student.displayPassingMarks()

    println("\nAfter Updated Passing Marks:")
    student1.checkResult()
    student2.checkResult()
    student3.checkResult()
    student4.checkResult()
    student5.checkResult()
}