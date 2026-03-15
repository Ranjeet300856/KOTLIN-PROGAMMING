/*
Question 7: Notification Sender using Default Parameters

Write a Kotlin function sendNotification(message: String,
soundEnabled: Boolean = true, vibrationEnabled: Boolean = true)
that prints notification configuration.

Demonstrate calls using default parameters and named arguments.
*/

fun sendNotification(message: String, soundEnabled: Boolean = true, vibrationEnabled: Boolean = true)
{
    println("Message   : $message")
    println("Sound     : $soundEnabled")
    println("Vibration : $vibrationEnabled")
    println()
}
fun main()
{
    sendNotification("New Message")
    sendNotification("New Email", soundEnabled = false)
    sendNotification("Battery Low", vibrationEnabled = false)
    sendNotification("Alarm", false, false)
}