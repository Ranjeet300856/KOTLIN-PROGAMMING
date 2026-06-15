/*
    Question 6 — Application Configuration Manager
    Problem Statement
    Create a Kotlin program that works as an Application Configuration Manager using a MutableMap.

    The program should store:
    Key = Configuration Name (String)
    Value = Configuration Value (String) 
*/

fun main()
{
    val applicationConfiguration = mutableMapOf<String, String>()

    applicationConfiguration.put("Theme", "Dark")
    applicationConfiguration.put("Language", "English")
    applicationConfiguration.put("Currency", "INR")
    applicationConfiguration.put("TimeZone", "Asia/Kolkata")

    val backupConfig = mutableMapOf<String, String>()
    backupConfig.put("FontSize", "Medium")
    backupConfig.put("Region", "India")

    applicationConfiguration.putAll(backupConfig)

    println("Total Settings : ${applicationConfiguration.size}")

    applicationConfiguration.clear()
    println("All Settings Reset Successfully")

    if(applicationConfiguration.isEmpty()) println("Configuration Cleared")
    else println("Configuration Still Exists")
}