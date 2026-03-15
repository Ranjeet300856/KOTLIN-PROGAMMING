/*
Question 5: User Registration System using Named Arguments and Default Parameters

This program simulates a simple user registration system.
It validates user input and demonstrates the use of
named arguments and default parameters in Kotlin functions.
*/

fun registerUser(userName: String, email: String, age: Int, country: String = "India")
{
    println("Username: $userName")
    println("Email: $email")
    println("Age: $age")
    println("Country: $country")
}
fun main()
{
    print("Enter User_Name : ")
    val userName = readln().trim()
    print("Enter Email-Id  : ")
    val email = readln().trim()
    print("Enter Age       : ")
    val age = readln().trim().toIntOrNull()

    if(userName.isBlank() || !userName.all { it.isLetterOrDigit() || it.isWhitespace() })
    {
        println("Invalid User_Name!")
        return
    }

    if(email.isBlank() || !email.contains('@') || !email.contains('.'))
    {
        println("Invalid Email!")
        return
    }

    if(age == null || age <= 0)
    {
        println("Invalid Age!")
        return
    }

    println()
    registerUser(userName = userName, email = email, age = age)
}