//Create a Kotlin program using an Object Expression to implement an event handler system.
interface EventHandler {
    fun handleEvent(eventName: String): Unit
    fun getHandlerType(): String
}

fun triggerEvent(handler: EventHandler, name: String) {
    handler.handleEvent(name)
}

fun main()
{
    triggerEvent(
        object : EventHandler {
            override fun handleEvent(eventName: String): Unit {
                if(eventName.isBlank()) println("Error: Event name cannot be empty!")
                else {
                    println("Handler Type : ${getHandlerType()}")
                    println("Event Name   : $eventName")
                }
            }

            override fun getHandlerType(): String = "Button Handler"
        },
        "Button Clicked"
    )

    triggerEvent(
        object : EventHandler {
            override fun handleEvent(eventName: String): Unit {
                if(eventName.isBlank()) println("Error: Event name cannot be empty!")
                else {
                    println("Handler Type : ${getHandlerType()}")
                    println("Event Name   : $eventName")
                }
            }

            override fun getHandlerType(): String = "Button Handler"
        },
        "  "
    )
}