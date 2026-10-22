//Create a Kotlin program using Abstraction to implement a simple Notification System.
abstract class Notification(val recipient: String) {
    abstract fun send(message: String): Boolean
    fun showRecipient() {
        println("$recipient")
    }
}

class EmailNotification(recipient: String) : Notification(recipient) {
    override fun send(message: String): Boolean {
        if(recipient.isNotBlank() && message.isNotBlank()) {
            print(message)
            super.showRecipient()
            return true
        } else {
            return false
        }
    }
}

class SMSNotification(recipient: String) : Notification(recipient) {
    override fun send(message: String): Boolean {
        if(recipient.isNotBlank() && message.isNotBlank()) {
            print(message)
            super.showRecipient()
            return true
        } else {
            return false
        }
    }
}

fun main()
{
    val emailNotification = EmailNotification("Ranjeet Suthar")
    val smsNotification = SMSNotification("1234567890")

    val emailResult = emailNotification.send("Email Sent to ")
    val smsResult = smsNotification.send("SMS Sent to ")

    if(!emailResult) println("Invalid Message!")
    if(!smsResult) println("Invalid Message!")
}