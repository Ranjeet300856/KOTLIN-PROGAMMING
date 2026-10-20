//Question 3: Notification Service System
interface NotificationService {
    fun sendNotification(message: String): Boolean
}

class EmailNotification : NotificationService {
    override fun sendNotification(message: String): Boolean {
        if(message.isBlank()) return false
        else {
            println("Email Notification : $message")
            return true
        }
    }
}

class SMSNotification : NotificationService {
    override fun sendNotification(message: String): Boolean {
        if(message.isBlank()) return false
        else {
            println("SMS Notification : $message")
            return true
        }
    }
}

class PushNotification : NotificationService {
    override fun sendNotification(message: String): Boolean {
        if(message.isBlank()) return false
        else {
            println("Push Notification : $message")
            return true
        }
    }
}

fun notifyAll(notificationServices: List<NotificationService>, message: String) {
    for(notificationService in notificationServices) {
        val result = notificationService.sendNotification(message)
        println("Notification successful : $result\n")
    }
}

fun main()
{
    val emailNotification: NotificationService = EmailNotification()
    val smsNotification: NotificationService = SMSNotification()
    val pushNotification: NotificationService = PushNotification()

    val notificationServices = listOf(emailNotification, smsNotification, pushNotification)
    notifyAll(notificationServices, "Your order has been shipped")
}