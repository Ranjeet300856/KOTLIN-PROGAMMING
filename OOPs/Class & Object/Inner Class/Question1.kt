//Question 1 — Basic Inner Class: Student Profile
class Student(
    val name: String,
    val age: Int
) {
    inner class Profile {
        fun showStudentInfo() {
            println("Student Name : $name")
            println("Student Age  : $age")
        }
    }
}

fun main()
{
    val student = Student("Rahul", 18)
    val profile = student.Profile()
    profile.showStudentInfo()
}