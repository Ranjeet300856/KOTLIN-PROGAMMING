/*
    Question 6 — Password Validator using Higher Order Function and Lambda
    Problem Statement
    Create a Kotlin program where:

    You create a Higher Order Function named validatePassword.
    The function should:
    take a String password
    take one Lambda parameter for validation
    The Lambda should validate the password according to different rules.

    Validation Operations
    Call the Higher Order Function using different Lambdas for:

    Check Minimum Length (at least 8 characters)
    Check if Password Contains a Digit
    Check if Password Contains an Uppercase Letter
    Check if Password Contains a Special Character
*/

fun validatePassword(password: String, validate: (String) -> String): String = validate(password)

fun main()
{
    print("Enter Password : ")
    val password = readln().trim()
    if(password.isBlank())
    {
        println("Invalid Input")
        return
    }

    val length = {
        pass: String ->
        if(pass.length >= 8) "Valid"
        else "Not Valid"
    }

    val hasDigit = {
        pass: String ->
        var countDigit = 0
        for(ch in pass)
            if(ch.isDigit()) countDigit++

        if(countDigit >= 1) "Valid"
        else "Not Valid"
    }

    val hasUppercase = {
        pass: String ->

        var countUppercase = 0
        for(ch in pass)
            if(ch.isUpperCase()) countUppercase++
        
        if(countUppercase >= 1) "Valid"
        else "Not Valid"
    }

    val hasSpecialChar = {
        pass: String ->
        var totalSpecialChar = 0

        for(ch in pass)
        {
            if(ch.isLetterOrDigit()) continue
            else totalSpecialChar++
        }

        if(totalSpecialChar >= 1) "Valid"
        else "Not Valid"
    }

    println("\nMinimum Length      : ${validatePassword(password, length)}")
    println("Contains Digit      : ${validatePassword(password, hasDigit)}")
    println("Contains Uppercase  : ${validatePassword(password, hasUppercase)}")
    println("Special Character   : ${validatePassword(password, hasSpecialChar)}")
}