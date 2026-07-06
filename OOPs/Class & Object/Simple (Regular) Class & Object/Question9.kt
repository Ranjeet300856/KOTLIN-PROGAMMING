//Create a Kotlin program to develop a Light Controller System using Class and Regular Object.
class Light
{
    var roomName = ""
    var isLightOn = false

    fun turnOn()
    {
        isLightOn = true
        println("Light On")
    }

    fun turnOff()
    {
        isLightOn = false
        println("Light Off")
    }

    fun toggleLight()
    {
        if(isLightOn) isLightOn = false
        else isLightOn = true
    }

    fun displayStatus()
    {
        println("\n----------- Light Status -----------\n")
        println("Room Name    : $roomName")
        println("Light Status : ${if (isLightOn) "ON" else "OFF"}")
        println("------------------------------------")
    }
}

fun main()
{
    print("Enter Room Name : ")
    val inputRoomName = readln().trim()
    if(inputRoomName.isBlank())
    {
        println("Invalid Input")
        return
    }

    val light = Light()
    light.roomName = inputRoomName
    light.turnOn()
    light.toggleLight()
    light.toggleLight()
    light.displayStatus()
}