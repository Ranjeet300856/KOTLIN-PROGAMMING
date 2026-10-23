//Question 2: Student Marks Validation
class Student(private var marks: Int = 0) {
    fun updateMarks(newMarks: Int) {
        if(newMarks in 0..100) {
            marks = newMarks
            println("Marks Updated Successfully: $newMarks")
        } else {
            println("Invalid Marks: $newMarks")
        }
    }

    fun getMarks(): Int = marks
}

fun displayMarks(student: Student) {
    println("Current Marks : ${student.getMarks()}\n")
}

fun main()
{
    val student = Student()
    displayMarks(student)

    student.updateMarks(85)
    displayMarks(student)

    student.updateMarks(120)
    displayMarks(student)

    student.updateMarks(-10)
    displayMarks(student)

    student.updateMarks(0)
    displayMarks(student)

    student.updateMarks(100)
    displayMarks(student)
}