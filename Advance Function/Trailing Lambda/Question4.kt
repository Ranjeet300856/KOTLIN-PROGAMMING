/*
    Question 4 — User Login Status Checker (Intermediate Level)
    Problem Statement
    Create a Kotlin program that checks a user's login status using a Trailing Lambda.

    Requirements
    Create a Higher Order Function named checkLoginStatus.
    The function should accept:
    Login status (Boolean)
    A lambda parameter that receives the login status and returns Unit.

    Use Trailing Lambda Syntax while calling the function.
    Inside the lambda:
    Display the login status.
    Display an appropriate message:
    If the user is logged in → "Access Granted"
    If the user is not logged in → "Access Denied"

    Use meaningful function and variable names.
    The program should work correctly for valid input values. 
*/

fun checkLoginStatus(status: Boolean, displayLoginInfo: (Boolean) -> Unit) = displayLoginInfo(status)

fun main()
{
    print("Enter Login Status (true/false) : ")
    val input = readln().trim().lowercase()
    if(input.isBlank() || (input != "true" && input != "false"))
    {
        println("Invalid Input")
        return
    }

    val loginStatus: Boolean
    if(input == "true") loginStatus = true
    else loginStatus = false
    
    checkLoginStatus(loginStatus) {
        status: Boolean ->
        println("Login Status : $status")

        if(status) println("Message      : Access Granted")
        else println("Message      : Access Denied")
    }
}