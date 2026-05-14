/*
    Write a Kotlin program that checks and analyzes password strength using Kotlin predefined packages and string functions.

    Your program should:

    Take a password input from the user.
    Check whether the password contains:
    Uppercase letters
    Lowercase letters
    Digits
    Special characters
    Check password length.
    Display:
    Total Characters
    Total Digits
    Total Uppercase Letters
    Total Lowercase Letters
    Total Special Characters
    Determine password strength:
    Weak
    Medium
    Strong
    Print a professional password analysis report. 
*/

fun main()
{
    //Input Password and Validation
    print("Enter your password : ")
    val password = readln().trim()
    if(password.isBlank())
    {
        println("Invalid Input")
        return
    }

    //Analyzes password strength
    var isUppercase = false
    var isLowercase = false
    var isDigit = false
    var isSpecialChar = false
    val passwordLength = password.length

    var totalChar = 0
    var totalDigit = 0
    var totalUppercase = 0
    var totalLowercase = 0
    var totalSpecialChar = 0

    for(ch in password)
    {
        if(ch in 'A'..'Z')
        {
            isUppercase = true
            totalChar++
            totalUppercase++
        }

        else if(ch in 'a'..'z')
        {
            isLowercase = true
            totalChar++
            totalLowercase++
        }

        else if(ch in '0'..'9')
        {
            isDigit = true
            totalChar++
            totalDigit++
        }

        else
        {
            isSpecialChar = true
            totalChar++
            totalSpecialChar++
        }
    }

    //Output
    println("\n-------- Password Analysis Report --------\n")

    println("Password Length           : $passwordLength")
    println("Uppercase Letters         : $totalUppercase")
    println("Lowercase Letters         : $totalLowercase")
    println("Digits                    : $totalDigit")
    println("Special Characters        : $totalSpecialChar")
    println("Total Character           : $totalChar")
    println()

    println("Contains Uppercase        : $isUppercase")
    println("Contains Lowercase        : $isLowercase")
    println("Contains Digits           : $isDigit")
    println("Contains Special Character: $isSpecialChar")
    println()

    //Check Password Strength
    if(passwordLength < 6) 
        println("Password Strength         : Weak")

    else if(passwordLength >= 8 && isLowercase == true && isDigit == true && isSpecialChar == true && isUppercase == true)
        println("Password Strength         : Strong")

    else if(passwordLength >= 6 && (isLowercase == true || isUppercase == true) && isDigit == true)
        println("Password Strength         : Medium")
    
    else 
        println("Average Password")
}