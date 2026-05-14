/*
    Write a Kotlin program that validates and analyzes usernames using Kotlin predefined string and character functions.

    Your program should:

    Take a username input from the user.
    Validate the username using the following rules:
    Username must not be blank
    Length must be between 5 and 15
    Must not contain spaces
    First character must be a letter
    Only letters, digits, and underscore (_) are allowed

    Display:
    Original Username
    Trimmed Username
    Username Length
    Uppercase Username
    Lowercase Username
    Count and display:
    Total Letters
    Total Digits
    Total Underscores
    Total Special Characters
    Display whether the username is:
    Valid
    Invalid
    Print a professional username analysis report. 
*/

fun main()
{
    //Input username
    print("Enter username : ")
    val username = readln()
    if(username.isBlank())
    {
        println("Invalid Username")
        return
    }

    //Validation
    var valid = true 
    val cleanedName = username.trim()

    if(cleanedName.length < 5 || cleanedName.length > 15) valid = false
    if(cleanedName.contains(" ")) valid = false
    if(!cleanedName[0].isLetter()) valid = false
    for(ch in cleanedName)
    {
        if(ch.isLetter()) continue
        else if(ch.isDigit()) continue
        else if(ch == '_') continue
        else
        {
            valid = false
            break
        }
    }


    if(!valid)
    {
        println("Invalid Username")
        println("Valid Username        : $valid")
        return
    }

    //Analyzes usernames
    var totalLetter = 0
    var totalDigit = 0
    var totalUnderscores = 0
    var totalSpecialChar = 0
    for(ch in cleanedName)
    {
        if(ch.isLetter()) totalLetter++
        else if(ch.isDigit()) totalDigit++
        else if(ch == '_') totalUnderscores++
        else if(!ch.isLetter()) totalSpecialChar++
    }

    //Output
    val usernameLength = username.length
    println("\n-------- Username Analysis Report --------\n")
    println("Original Username     : $username")
    println("Trimmed Username      : $cleanedName")
    println("Username Length       : $usernameLength")
    println()
    println("Uppercase Username    : ${cleanedName.uppercase()}")
    println("Lowercase Username    : ${cleanedName.lowercase()}")
    println()
    println("Total Letters         : $totalLetter")
    println("Total Digits          : $totalDigit")
    println("Total Underscores     : $totalUnderscores")
    println("Special Characters    : $totalSpecialChar")
    println()
    println("Valid Username        : $valid")
}
