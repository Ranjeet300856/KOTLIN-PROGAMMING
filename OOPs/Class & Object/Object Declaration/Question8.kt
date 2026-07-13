/*
    Question 8: App Configuration Manager Using Singleton Object
    Problem Statement
    Create a Kotlin program that uses an Object Declaration (Singleton Object) to manage the configuration of an application.
    The Singleton Object should maintain the application's configuration settings and provide functions to update, reset, and display all settings. 
*/

object AppConfigManager
{
    private var appName = "Career Guide"
    private var language = "English"
    private var isDarkModeEnabled = false

    fun changeLanguage(language: String)
    {
        if(!language.isBlank())
        {
            if(language.lowercase() == "english" || language.lowercase() == "hindi")
            {
                this.language = language[0].uppercase() + language.substring(1).lowercase()
                println("Language changed successfully")
            }
            else println("Invalid language! please enter English or Hindi")
        }
        else println("Language cannot be blank!")
    }

    fun enableDarkMode()
    {
        if(isDarkModeEnabled) println("Dark mode is already enabled")
        else
        {
            isDarkModeEnabled = true
            println("Dark mode on successfully")
        }
    }

    fun disableDarkMode()
    {
        if(!isDarkModeEnabled) println("Dark mode is aleary disabled")
        else
        {
            isDarkModeEnabled = false
            println("Dark mode off successfully")
        }
    }

    fun resetConfiguration()
    {
        appName = "Career Guide"
        language = "English"
        isDarkModeEnabled = false
        println("All settings reset successfully")
    }

    fun displayConfiguration()
    {
        println("========== App Configuration ==========")
        println("App Name : $appName")
        println("Language : $language")
        if(isDarkModeEnabled) println("Dark Mode  : Enabled")
        else println("Dark Mode  : Disabled")
        println("=======================================")
    }
}

fun main()
{
    println("\nDefault configuration:")
    AppConfigManager.displayConfiguration()

    println("\nChange language to Hindi:")
    AppConfigManager.changeLanguage("Hindi")

    println("\nEnable Dark Mode:")
    AppConfigManager.enableDarkMode()

    println("\nDisplay configuration:")
    AppConfigManager.displayConfiguration()

    println("\nTry enabling Dark Mode again:")
    AppConfigManager.enableDarkMode()

    println("\nChange language to SPANISH:")
    AppConfigManager.changeLanguage("Spanish")

    println("\nDisplay configuration:")
    AppConfigManager.displayConfiguration()

    println("\nReset configuration:")
    AppConfigManager.resetConfiguration()

    println("\nDisplay configuration:")
    AppConfigManager.displayConfiguration()

    println("\nTry disabling Dark Mode again:")
    AppConfigManager.disableDarkMode()
}