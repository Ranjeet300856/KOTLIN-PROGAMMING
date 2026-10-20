//Question 7: Multi-Channel Alert System
interface AlertService {
    fun sendAlert(message: String): Boolean
}

interface AlertLogger {
    fun logAlert(message: String)
}

class EmailAlert : AlertService, AlertLogger {
    override fun sendAlert(message: String): Boolean {
        if(message.isBlank()) return false
        else {
            println(message)
            println("Email alert sent successfully")
            return true
        }
    }

    override fun logAlert(message: String) {
        println(message)
    }
}

class SMSAlert : AlertService {
    override fun sendAlert(message: String): Boolean {
        if(message.isBlank()) return false
        else {
            println(message)
            println("SMS alert sent successfully")
            return true
        }
    }
}

class PushAlert : AlertService {
    override fun sendAlert(message: String): Boolean {
        if(message.isBlank()) return false
        else {
            println(message)
            println("Push alert sent successfully")
            return true
        }
    }
}

fun dispatchAlerts(alertServices: List<AlertService>, message: String) {
    for(alertService in alertServices) {
        val result = alertService.sendAlert(message)
        if(result) println("Alert Send Successfully\n")
    }
}

fun main()
{
    val emailAlert = EmailAlert()
    val smsAlert = SMSAlert()
    val pushAlert = PushAlert()

    val alerts = listOf(emailAlert, smsAlert, pushAlert)
    dispatchAlerts(alerts, "Server is running normally")

    val logger: AlertLogger = emailAlert
    logger.logAlert("Email Log Alert")

    dispatchAlerts(alerts, "   ")
}