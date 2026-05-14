/*
    Question 8 — Email Address Analyzer Using Predefined Packages

    Problem Statement
    Write a Kotlin program that analyzes and validates an email address using Kotlin predefined string and character functions.

    Your program should:
    Take an email address as input from the user.
    Validate the email using the following rules:
    Must not be blank
    Must contain exactly one @
    Must contain at least one . after @
    Must not contain spaces
    Username part must not be empty
    Domain part must not be empty

    Display:
    Original Email
    Trimmed Email
    Email Length
    Username Part
    Domain Name
    Domain Extension
    Uppercase Email
    Lowercase Email

    Count and display:
    Total Letters
    Total Digits
    Total Special Characters

    Display whether the email is:
    Valid
    Invalid
    Print a professional email analysis report. 
*/

//Validation Function
fun emailValidation(email: String): Boolean
{
    var countAt = 0
    var countDot = 0
    for(ch in email)
    {
        if(ch == '@') countAt++
        if(ch == '.') countDot++
    }

    if(countAt != 1) return false
    if(countDot != 1) return false
    if(email.contains(" ")) return false
    if(email.substringBefore("@").isEmpty()) return false
    if(email.substringAfter("@").isEmpty()) return false

    return true
}

//Display Function
fun display(email: String, originalEmail: String, isValid: Boolean)
{
    println("\n-------- Email Analysis Report --------\n")

    println("Original Email         : $originalEmail")
    println("Trimmed Email          : $email")
    println("Email Length           : ${email.length}")
    println()

    println("Username Part          : ${email.substringBefore("@")}")
    println("Domain Name            : ${email.substringAfter("@").substringBefore(".")}")
    println("Domain Extension       : ${email.substringAfterLast(".")}")
    println()

    println("Uppercase Email        : ${email.uppercase()}")
    println("Lowercase Email        : ${email.lowercase()}")
    println()

    //Counting and Printing
    var totalLetter = 0
    var totalDigit = 0
    var totalSpecialChar = 0

    for(ch in email)
    {
        if(ch.isLetter()) totalLetter++
        else if(ch.isDigit()) totalDigit++
        else totalSpecialChar++
    }

    println("Total Letters          : $totalLetter")
    println("Total Digits           : $totalDigit")
    println("Special Characters     : $totalSpecialChar")
    println()

    //Print Validation
    println("Valid Email            : $isValid")
}

//Main function
fun main()
{
    //Input Email Address
    print("Enter Email Address : ")
    val email = readln()
    if(email.isBlank())
    {
        println("Invalid Email Address")
        return
    }

    val cleanedEmail = email.trim()

    //Validation
    val isValid = emailValidation(cleanedEmail)

    //Display Report
    if(isValid) display(cleanedEmail, email, isValid)
    else println("Valid Email            : $isValid")
}