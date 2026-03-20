//Q5th
/*
    Write a Kotlin program that simulates a simple login system using an else-if ladder.

    Requirements:
    Take two inputs from the user:
    Username (String)
    Password (String)
    Predefined credentials:
    Username: "admin"
    Password: "1234"

    Conditions:
    If both username and password are correct →
    "Login Successful"
    If username is correct but password is wrong →
    "Incorrect Password"
    If username is wrong →
    "User not found"
*/

fun main()
{
    print("Enter Username : ")
    val username = readln().trim()
    print("Enter Password : ")
    val password = readln().trim()
    if(username.isBlank() || password.isBlank())
    {
        println("Input cannot be empty!")
        return
    }

    if(username == "admin" && password == "1234") println("Login Successful")
    else if(username == "admin") println("Incorrect Password!")
    else println("User not found!")
}