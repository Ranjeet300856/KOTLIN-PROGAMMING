//Question 7: Notification Sender
class NotificationSender {
    fun send(message: String) = "Notification : $message"
    fun send(message: String, recipient: String) = "To $recipient : $message"
    fun send(message: String, recipient: String, priority: String = "Normal") = "$priority To $recipient : $message"
}

fun main()
{
    val notification = NotificationSender()

    val testCase1 = notification.send("Hello")
    val testCase2 = notification.send("Hello", "Ranjeet")
    val testCase3 = notification.send("Hello", "Ranjeet", "High")
    val testCase4 = notification.send("Hello", "Ranjeet", priority = "Low")

    println(testCase1)
    println(testCase2)
    println(testCase3)
    println(testCase4)
}