//Create a Kotlin program that checks whether a user is allowed to access a restricted feature using Custom Exception Handling.
class InvalidAgeException(message: String) : Exception(message)
class AccessDeniedException(message: String) : Exception(message)
fun checkAccess(age: Int)
{
    if(age < 0) throw InvalidAgeException("Age cannot be negative.")
    if(age < 18) throw AccessDeniedException("Access denied. User must be 18 or older.")
    println("Access granted.")
}

fun main()
{
    print("Enter Age : ")
    val age = readln().trim().toIntOrNull()
    if(age == null)
    {
        println("Invalid Input!")
        return
    }

    try {
        checkAccess(age)
    } catch(e: InvalidAgeException) {
        println(e.message)
    } catch(e: AccessDeniedException) {
        println(e.message)
    }
}