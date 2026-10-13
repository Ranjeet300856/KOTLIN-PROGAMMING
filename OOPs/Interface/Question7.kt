/*
    Create an interface named Logger with the following abstract functions:

    logInfo(message: String) — Prints an informational message.
    logError(message: String) — Prints an error message.

    Create a class named ConsoleLogger that implements the Logger interface. 
*/

interface Logger {
    fun logInfo(message: String)
    fun logError(message: String)
}

class ConsoleLogger : Logger {
    override fun logInfo(message: String) {
        println("INFO : $message")
    }

    override fun logError(message: String) {
        println("ERROR : $message")
    }
}

class UserService(private val logger: Logger) : Logger by logger {
    fun createUser(username: String) {
        println("User Created : $username")
    }
}

class FileLogger : Logger {
    override fun logInfo(message: String) {
        println("FILE INFO : $message")
    }

    override fun logError(message: String) {
        println("FILE ERROR : $message")
    }
}

fun main()
{
    val consoleLogger = ConsoleLogger()
    val userService = UserService(consoleLogger)

    userService.logInfo("Application Started")
    userService.logError("Database Connection Failed")
    userService.createUser("Rahul")

    println()
    val fileLogger = FileLogger()
    val userService2 = UserService(fileLogger)
    userService2.logInfo("File Downloaded Successfully")
    userService2.logError("No Internet Connection")
    userService2.createUser("Ranjeet")
}