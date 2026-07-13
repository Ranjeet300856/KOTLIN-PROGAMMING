/*
    Problem Statement
    Create a Kotlin program that uses an Object Declaration (Singleton Object) to manage the Wi-Fi status of a device.
    The Singleton Object should maintain the current Wi-Fi status and provide functions to turn Wi-Fi ON, turn Wi-Fi OFF, and display the current status. 
*/

object WiFiManager
{
    private var isWiFiEnabled = false
    fun turnOnWiFi()
    {
        if(isWiFiEnabled) println("Wifi is already turned on")
        else
        {
            isWiFiEnabled = true 
            println("Wifi turned on successfully")
        }
    }

    fun turnOffWiFi()
    {
        if(!isWiFiEnabled) println("Wifi is already turend off")
        else
        {
            isWiFiEnabled = false
            println("Wifi turend off successfully")
        }
    }

    fun displayWiFiStatus()
    {
        println("========== Wi-Fi Manager ==========")
        if(isWiFiEnabled) println("Wifi - Status : ON")
        else println("Wifi - Status : OFF")
        println("===================================")
    }
}

fun main()
{
    println("\nDefault Status:")
    WiFiManager.displayWiFiStatus()

    println("\nCalled turnOnWifi():")
    WiFiManager.turnOnWiFi()
    WiFiManager.displayWiFiStatus()

    println("\nCalled turnOnWifi() again:")
    WiFiManager.turnOnWiFi()
    WiFiManager.displayWiFiStatus()

    println("\nCalled turnOffWifi():")
    WiFiManager.turnOffWiFi()
    WiFiManager.displayWiFiStatus()

    println("\nCalled turnOffWifi() again:")
    WiFiManager.turnOffWiFi()
    WiFiManager.displayWiFiStatus()
}