//Create a Kotlin program that validates a user's password using Custom Exception Handling.
class WeakPasswordException(message: String) : Exception(message)
fun validatePassword(password: String)
{
    var hasUppercase = false
    var hasDigit = false
    for(ch in password)
    {
        if(ch in 'A'..'Z') hasUppercase = true
        else if(ch in '0'..'9') hasDigit = true
    }

    val isValid = hasUppercase && password.length >= 8 && hasDigit
    if(isValid) println("Password is strong.")
    else throw WeakPasswordException("Password is Weak!")
}

fun main()
{
    print("Enter Password : ")
    val password = readln().trim()
    if(password.isBlank())
    {
        println("Invalid Input!")
        return
    }

    try {
        validatePassword(password)
    } catch(e: WeakPasswordException) {
        println(e.message)
    }
}