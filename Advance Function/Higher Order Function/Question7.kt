/*
    Question 7 — Dynamic Password Validator Using Function as Parameter
    Problem Statement - Create a Kotlin program that validates a password using different security-check functions passed into a Higher Order Function.

    This program should demonstrate how one Higher Order Function can dynamically execute different password validation logics. 
*/

fun hasMinimumLength(password: String): Boolean = password.length >= 8
fun hasDigit(password: String): Boolean
{
    for(i in password.indices)
    {
        if(password[i].isDigit())
            return true
    }

    return false
}

fun hasUpperCaseCharacter(password: String): Boolean
{
    for(i in password.indices)
    {
        if(password[i].isUpperCase())
            return true
    }

    return false
}

fun validatePassword(password: String, validation: (String) -> Boolean): Boolean = validation(password)

fun main()
{
    print("Enter Password : ")
    val password = readln().trim()
    if(password.isBlank())
    {
        println("Invalid Password")
        return
    }

    println("\nPassword Length Status      : ${validatePassword(password, ::hasMinimumLength)}")
    println("Password Digit Status       : ${validatePassword(password, ::hasDigit)}")
    println("Password Uppercase Status   : ${validatePassword(password, ::hasUpperCaseCharacter)}")
}