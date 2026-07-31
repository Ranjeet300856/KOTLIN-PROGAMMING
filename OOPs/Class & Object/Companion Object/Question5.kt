//Create a Kotlin program to manage the application's theme using a Companion Object.
class User(val userName: String)
{
    companion object
    {
        private var appTheme = "Light"
        fun changeTheme(newTheme: String)
        {
            when(newTheme.lowercase())
            {
                "light" -> appTheme = "Light"
                "dark" -> appTheme = "Dark"
                else -> println("Device only Light and Dark theme supported")
            }
        }

        fun displayCurrentTheme() = println("Current Theme : $appTheme")
    }

    fun displayUserDetails()
    {
        println("Username : $userName")
        displayCurrentTheme()
    }
}

fun inputUserName(): String
{
    while(true)
    {
        print("Enter Username : ")
        val inputName = readln().trim()
        if(inputName.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputName
    }
}

fun displayDetails(users: MutableList<User>)
{
    for(user in users)
    user.displayUserDetails()
}

fun main()
{
    print("Enter total number of users : ")
    val input = readln().trim().toIntOrNull()
    if(input == null || input <= 0)
    {
        println("Invalid Input!")
        return
    }

    val users = mutableListOf<User>()
    for(i in 1..input)
    {
        val name = inputUserName()
        val user = User(name)
        users.add(user)
    }
    displayDetails(users)

    print("Enter new theme : ")
    val inputNewTheme = readln().trim()
    if(inputNewTheme.isBlank())
    {
        println("Invalid New Theme")
        return
    }

    User.changeTheme(inputNewTheme)
    User.displayCurrentTheme()

    println("\nAfter updated theme:")
    displayDetails(users)
}