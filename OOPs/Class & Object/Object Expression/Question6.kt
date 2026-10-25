/*
    Write a Kotlin program to create a simple notification system using an Object Expression that implements a NotificationService interface.

    The NotificationService interface must contain:

    sendNotification(message: String): Sends a notification message.
    getServiceName(): String: Returns the notification service's name.

    Create an Object Expression that implements this interface. 
*/

interface NotificationService {
    fun sendNotification(message: String)
    fun getServiceName(): String
}

fun main()
{
    val serviceName = "Email Notification"
    val notificationService = object : NotificationService {
        override fun sendNotification(message: String) {
            if(message.isBlank()) println("Notification Failed: Message cannot be empty.")
            else println(message)
        }

        override fun getServiceName(): String = serviceName
    }

    println("Service Name : ${notificationService.getServiceName()}")
    notificationService.sendNotification("Your order has been shipped.")
    notificationService.sendNotification("")
    notificationService.sendNotification("  ")
}