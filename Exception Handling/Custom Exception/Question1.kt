//Create a Kotlin program that validates a student's age using Custom Exception Handling.
class InvalidAgeException(message: String) : Exception(message)

fun validateAge(age: Int)
{
    if(age < 18) throw InvalidAgeException("Student is not eligible because the age is below 18.")
    else println("Student is eligible.")
}

fun main()
{
    print("Enter Student Age : ")
    val age = readln().trim().toIntOrNull()
    if(age == null || age < 0)
    {
        println("Invalid Input!")
        return
    }

    try {
        validateAge(age)
    } catch(e: InvalidAgeException) {
        println(e.message)
    }
}