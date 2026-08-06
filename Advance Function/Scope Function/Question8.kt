//Create a Kotlin program to configure an application user profile using the `apply` scope function.
class UserProfile(var username: String, var email: String, var notificationsEnabled: Boolean)
{
    fun display()
    {
        println("Username                     : $username")
        println("Email                        : $email")
        println("Notifications Enabled Status : $notificationsEnabled")
    }
}

fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputBoolean(text: String): Boolean
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else println("Invalid Input! Try Again")
    }
}
fun main()
{
    val user = UserProfile("Guest", "No Set", false)
    val uname = inputString("Username")
    var uemail = ""
    while(true)
    {
        val inputUemail = inputString("User Email Address")
        if(inputUemail.contains("@"))
        {
            uemail = inputUemail
            break
        }
        else println("Invalid Email Address")
    }
    val notifications = inputBoolean("Notification Preference (yes or no)")

    val updatedUser = user.apply {
        username = uname
        email = uemail
        notificationsEnabled = notifications
    }

    updatedUser.display()
    if(updatedUser === user) println("Both Object References Are Equals")
    else println("Both Object References Are Not Equals")
}