//Question 8 — Abstract Class + Polymorphism
abstract class Notification(
    val recipient: String,
    val message: String
) {
    fun displayInfo() {
        println("Recipient : $recipient")
        println("Message   : $message")
    }

    abstract fun send()
}

class EmailNotification(
    recipient: String,
    message: String
) : Notification(recipient, message) {
    override fun send() {
        println("Sending Email notification")
    }
}

class SMSNotification(
    recipient: String,
    message: String
) : Notification(recipient, message) {
    override fun send() {
        println("Sending SMS notification")
    }
}

class PushNotification(
    recipient: String,
    message: String
) : Notification(recipient, message) {
    override fun send() {
        println("Sending Push notification")
    }
}

fun main()
{
    val notifications = mutableListOf<Notification>()

    val emailNotification = EmailNotification("rahul@gmail.com", "Your order has been shipped")
    val smsNotification = SMSNotification("1234567890", "Your OTP is 123456")
    val pushNotification = PushNotification("Rahul", "You have a new message")

    notifications.add(emailNotification)
    notifications.add(smsNotification)
    notifications.add(pushNotification)

    for(notification in notifications) {
        notification.displayInfo()
        notification.send()
        println()
    }
}