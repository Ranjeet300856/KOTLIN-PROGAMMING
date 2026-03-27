//Q5th
/*
    Write a Kotlin function that simulates a simple login system:

    Function takes two inputs:

    username: String
    password: String
    Rules:
    If username or password is empty → return "Invalid Input"
    If username is not "admin" → return "User Not Found"
    If password is incorrect (not "1234") → return "Wrong Password"
    If both are correct → return "Login Successful"
*/

fun login(username: String, password: String): String
{
    if(username.isBlank() || password.isBlank()) return "Invalid Input"
    if(username != "admin") return "User Not Found"
    if(password != "1234") return "Wrong Password"
    return "Login Successful"
}

fun main()
{
    print("Enter Username : ")
    val username = readln().trim()
    print("Enter Password : ")
    val password = readln().trim()

    println(login(username, password))
}