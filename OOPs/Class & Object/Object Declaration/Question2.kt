/*
    Problem Statement
    Create a Kotlin program that uses an Object Declaration (Singleton Object) to manage the current theme of an application.
    The Singleton Object should maintain the current application theme and provide functions to change and display the theme. 
*/

object ThemeManager
{
    private var currentTheme = "Light"
    fun changeTheme(theme: String)
    {
        if(theme.lowercase() == "light" || theme.lowercase() == "dark" || theme.lowercase() == "system")
        {
            currentTheme = theme[0].uppercase() + theme.substring(1).lowercase()
            println("Theme updated successfully")
        }
        else println("Invalid Theme!")
    }

    fun displayCurrentTheme()
    {
        println("\n========== Theme Manager ==========")
        println("Current Theme : $currentTheme")
        println("===================================")
    }
}

fun main()
{
    ThemeManager.displayCurrentTheme()

    print("Enter a theme : ")
    val inputTheme = readln().trim()
    if(inputTheme.isBlank())
    {
        println("Invalid Input!")
        return
    }

    println("\nCalled changeTheme()")
    ThemeManager.changeTheme(inputTheme)

    println("\nUpdated theme:")
    ThemeManager.displayCurrentTheme()

    println("\nTest invalid theme")
    ThemeManager.changeTheme("Blue")
}