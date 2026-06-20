/*
    Question 6: Inline Notification System with noinline Callback Forwarding
    Problem Statement:
    Create a Kotlin program to develop an Inline Notification System using Inline Lambda and noinline callback forwarding.
    Requirements:
    1. Create a normal function named sendNotification().
    2. The function should accept one parameter:
       - callback (Lambda parameter that returns Unit)

    3. Inside sendNotification():
       - Display a notification processing message.
       - Execute the callback lambda.

    4. Create an inline function named processNotification().
    5. The function should accept two lambda parameters:
       - startProcess (Normal Inline Lambda)
       - notificationCallback (noinline Lambda)

    6. Inside processNotification():
       - Execute the startProcess lambda immediately.
       - Pass notificationCallback to sendNotification().
       - Do not execute notificationCallback directly inside processNotification().

    7. In main():
       - Call processNotification() multiple times with different notification actions.
*/

fun sendNotification(callback: () -> Unit)
{
    println("Notification On The Way")
    callback()
}

inline fun processNotification(startProcess: () -> Unit, noinline notificationCallback: () -> Unit)
{
    startProcess()
    sendNotification(notificationCallback)
}

fun main()
{
    processNotification(
        {
            println("Process Started Successfully")
        }
    ) {
        println("Instagram Notification")
        println("Whatsapp Notification")
    }

    processNotification(
        {
            println("\nNext Process Started Successfully")
        } 
    ) {
            println("Snapchat Notification")
            println("JioHotstar Notification")
    }
}