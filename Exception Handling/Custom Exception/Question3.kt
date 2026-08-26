//Create a Kotlin program that validates student registration details using multiple Custom Exceptions.
class InvalidStudentNameException(message: String) : Exception(message)
class InvalidAgeException(message: String) : Exception(message)
class InvalidEmailException(message: String) : Exception(message)
class Student(val name: String, var age: Int, val email: String)
{
    fun registerStudent()
    {
        if(!name.all { it.isLetter() || it.isWhitespace()})
        throw InvalidStudentNameException("Invalid Name!")

        if(age !in 18..60) throw InvalidAgeException("Invalid Age!")
        if(!(email.contains("@") && email.contains(".")))
        throw InvalidEmailException("Invalid Email!")

        println("Student registered successfully.")
    }
}

fun main()
{
    print("Enter Name  : ")
    val name = readln().trim()
    print("Enter Age   : ")
    val age = readln().trim().toIntOrNull()
    print("Enter Email : ")
    val email = readln().trim()
    if(name.isBlank() || age == null || email.isBlank())
    {
        println("Invalid Input")
        return
    }

    val student = Student(name, age, email)
    try {
        student.registerStudent()
    } catch(e: InvalidStudentNameException) {
        println(e.message)
    } catch(e: InvalidAgeException) {
        println(e.message)
    } catch(e: InvalidEmailException) {
        println(e.message)
    }
}