/*
    Problem Statement
    Create a Kotlin program that uses an Object Declaration (Singleton Object) to manage the login session of a user.
    The Singleton Object should maintain the current logged-in user's information and provide functions to log in, log out, 
    and display the current session details. 
*/

object SessionManager
{
    private var userName: String = "Guest"
    private var isLoggedIn: Boolean = false

    fun login(userName: String)
    {
        if(userName.isBlank())
        {
            println("Invalid Username!")
            return
        }
        
        if(isLoggedIn) println("User is already logged in")
        else
        {
            this.userName = userName
            isLoggedIn = true
            println("Login Successful")
        }
    }

    fun logout()
    {
        if(!isLoggedIn) println("No user logged in")
        else
        {
            userName = "Guest"
            isLoggedIn = false
            println("Logged out successful")
        }
    }

    fun displaySessionDetails()
    {
        println("========== Session Manager ==========")
        println("User Name : $userName")
        if(isLoggedIn) println("Status    : Logged In")
        else println("Status    : Logged Out")
        println("=====================================")
    }
}

fun main()
{
    println("\nDefault Session:")
    SessionManager.displaySessionDetails()

    println("\nLogin using Ranjeet:")
    SessionManager.login("Ranjeet")
    SessionManager.displaySessionDetails()

    println("\nLogging in again using Amit:")
    SessionManager.login("Amit")
    SessionManager.displaySessionDetails()

    println("\nLogout:")
    SessionManager.logout()
    SessionManager.displaySessionDetails()

    println("\nLogging out again:")
    SessionManager.logout()
    SessionManager.displaySessionDetails()
}