//Create a Kotlin program to create and configure a student profile using the `apply` scope function.
class StudentProfile(var studentName: String = "", var course: String = "", var semester: Int = 0, var city: String = "")
{
    fun display()
    {
        println("Student Name : $studentName")
        println("Course       : $course")
        println("Semeter      : $semester")
        println("City         : $city")
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

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input !in 1..8)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun main()
{
    val name = inputString("Student Name")
    val course = inputString("Student Course")
    val semester = inputInteger("Current Semester")
    val city = inputString("City Name")

    val student = StudentProfile().apply {
        studentName = name
        this.course = course
        this.semester = semester
        this.city = city
    }

    student.display()
}