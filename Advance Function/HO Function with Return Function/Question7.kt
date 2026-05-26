/*
    Create a Kotlin program where:

    You have separate normal functions for:
    Check Minimum Length Password
    Check if Password Contains Digit
    Check if Password Contains Uppercase Letter
    Check if Password Contains Special Character

    Create a Higher Order Function
    Create a function named:
    getPasswordValidator()
    that:
    takes a String parameter
    returns a function 
*/

//Normal Functions
fun checkMinimumLength(password: String): Boolean = password.length >= 8
fun checkDigit(password: String): Boolean
{
    var isValid = false
    for(ch in password)
    {
        if(ch.isDigit())
        {
            isValid = true
            break
        }
    }
    
    return isValid
}

fun checkUppercaseLetter(password: String): Boolean
{
    var isValid = false
    for(ch in password)
    {
        if(ch.isUpperCase())
        {
            isValid = true
            break
        }
    }

    return isValid
}

fun checkSpecialChar(password: String): Boolean
{
    var isValid = false
    for(ch in password)
    {
        if(ch.isDigit()) continue
        else if(ch.isLetter()) continue
        else
        {
            isValid = true
            break
        }
    } 

    return isValid
}

fun invalidChoice(password: String): Boolean = false

//Higher Order Function
fun getPasswordValidator(operation: String): (String) -> Boolean
{
    return when(operation.lowercase())
    {
        "length" -> ::checkMinimumLength
        "uppercase" -> ::checkUppercaseLetter
        "digit" -> ::checkDigit
        "special" -> ::checkSpecialChar

        else -> ::invalidChoice
    }
}

//Main Function
fun main()
{
    print("Enter Password : ")
    val password = readln().trim()
    if(password.isBlank())
    {
        println("Invalid Input")
        return
    }

    println("\nPassword Validator\n")

    println("1. Check Length")
    println("2. Check Uppercase")
    println("3. Check Digit")
    println("4. Check special Character")

    print("Enter your choice (length, uppercase, digit or special) : ")
    val choice = readln().trim()
    if(choice.isBlank())
    {
        println("Invalid Input")
        return
    }

    val validator = getPasswordValidator(choice)
    val result = validator(password)

    println("Result : $result")
}