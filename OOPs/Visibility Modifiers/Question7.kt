//Create a Kotlin program to manage a smart light using appropriate Visibility Modifiers.
class SmartLight(val roomLight: String, private var isLightOn: Boolean)
{
    private fun displayStatus()
    {
        if(isLightOn) println("Ligth Status : ON")
        else println("Ligth Status : OFF")
    }

    fun turnOn()
    {
        if(isLightOn) println("Light is already ON.")
        else
        {
            isLightOn = true
            println("Light turned ON successfully.")
        }
    }

    fun turnOff()
    {
        if(isLightOn)
        {
            isLightOn = false
            println("Light turned OFF.")
        }
        else println("Light is already OFF.")
    }

    fun displayDetails()
    {
        println("\nRoom Name : $roomLight")
        displayStatus()
    }
}

fun main()
{
    print("Enter Room Name : ")
    val roomName = readln().trim()
    print("Enter Light Status (On/Off) : ")
    val input = readln().trim().uppercase()
    if(roomName.isBlank() || input.isBlank() || !(input != "YES" && input != "NO"))
    {
        println("Invalid Input!")
        return
    }

    val status = if(input == "YES") true else false
    val room = SmartLight(roomName, status)
    room.displayDetails()
    room.turnOn()
    room.turnOff()
    room.displayDetails()
}