//Q3rd
//Write a Kotlin program that simulates a simple login system.

fun main()
{
    print("Enter Username : ")
    val username = readln().trim()
    print("Enter Password : ")
    val password = readln().trim()

    if(username.isBlank())
    {
        println("Username required")
    }
    else
    {
        if(password.isBlank())
        {
            println("Password required")
        }
        else
        {
            if(username == "admin")
            {
                if(password == "1234")
                {
                    println("Login Successful")
                }
                else 
                {
                    println("Incorrect Password")
                }
            }
            else 
            {
                println("Invalid Username")
            }
        }
    }
}