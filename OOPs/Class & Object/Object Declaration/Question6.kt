/*
    Problem Statement
    Create a Kotlin program that uses an Object Declaration (Singleton Object) to manage application notifications.
    The Singleton Object should store notifications and provide functions to add, remove, and display all notifications. 
*/

object NotificationCenter
{
    private val notifications = mutableListOf<String>()
    fun addNotification(message: String)
    {
        if(message.isBlank())
        {
            println("Notification message can not be blank!")
            return
        }

        notifications.add(message)
        println("Notification added successfully")
    }

    fun removeLastNotification()
    {
        if(notifications.isNotEmpty())
        {
            notifications.removeLast()
            println("Recently added notification removed successfully")
        }
        else println("No notifications available.")
    }

    fun displayNotifications()
    {
        if(notifications.isEmpty())
        {
            println("No notifications available.")
            return
        }

        println("========== Notification Center ==========")
        var x = 1
        for(notification in notifications)
        {
            println("$x. $notification")
            x++
        }
        println("=========================================")
    }

    fun displayNotificationCount() = println("Total Notifications : ${notifications.size}")
}

fun main()
{
    println("\nDefault notifications:")
    NotificationCenter.displayNotifications()

    println("\nAdd Operation:")
    NotificationCenter.addNotification("Welcome to the App")
    NotificationCenter.addNotification("Payment Successful")
    NotificationCenter.addNotification("Order Delivered")
    NotificationCenter.displayNotifications()
    NotificationCenter.displayNotificationCount()

    println("\nRemove Operation:")
    NotificationCenter.removeLastNotification()
    NotificationCenter.displayNotifications()
    NotificationCenter.displayNotificationCount()

    println("\nTry add a blank notification:")
    NotificationCenter.addNotification("")

    println("\nRemove notifications until the list becomes empty.")
    NotificationCenter.removeLastNotification()
    NotificationCenter.removeLastNotification()
    NotificationCenter.displayNotifications()

    println("\nRemoving once more from the empty list.")
    NotificationCenter.removeLastNotification()
    NotificationCenter.displayNotifications()
}