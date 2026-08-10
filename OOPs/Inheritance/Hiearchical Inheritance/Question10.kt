//Create a Kotlin program to demonstrate Hierarchical Inheritance for a smart home device controller.
fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputBoolean(text: String): Boolean
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else println("Invalid Input! Try Again")
    }
}

open class SmartDevice(val deviceName: String, val deviceId: Int, val isPoweredOn: Boolean)
{
    fun displayDeviceInfo()
    {
        println("\nDevice Name       : $deviceName")
        println("Device ID         : $deviceId")
        println("Is Power On       : ${if(isPoweredOn) "YES" else "NO"}")
    }
}

class Light(
    val brightness: Int,
    deviceName: String,
    deviceId: Int,
    isPoweredOn: Boolean
) : SmartDevice(deviceName, deviceId, isPoweredOn)
{
    fun displayLightInfo()
    {
        displayDeviceInfo()
        println("Brightness        : $brightness")
        if(isPoweredOn)
        {
            val powerConsumption = brightness * 0.01
            println("Power Consumption : %.2f".format(powerConsumption))
        }
        else println("Light is OFF")
    }
}

class Fan(
    val speedLevel: Int,
    deviceName: String,
    deviceId: Int,
    isPoweredOn: Boolean
) : SmartDevice(deviceName, deviceId, isPoweredOn)
{
    fun displayFanInfo()
    {
        displayDeviceInfo()
        println("Speed Level       : $speedLevel")
        if(isPoweredOn)
        {
            if(speedLevel in 1..2) println("Low Speed")
            else if(speedLevel == 3) println("Medium Speed")
            else println("High Speed")
        }
        else println("Fan is OFF")
    }
}

class AirConditioner(
    val temperature: Double,
    deviceName: String,
    deviceId: Int,
    isPoweredOn: Boolean
) : SmartDevice(deviceName, deviceId, isPoweredOn)
{
    fun airConditionerInfo()
    {
        displayDeviceInfo()
        println("Temperature       : %.2f".format(temperature))
        if(isPoweredOn)
        {
            if(temperature <= 20.0) println("High Cooling")
            else if(temperature <= 25.0) println("Normal Cooling")
            else println("Low Cooling")
        }
        else println("AC is OFF")
    }
}

fun main()
{
    //Light
    val lightDeviceId = inputInteger("Light Id")
    val lightDeviceName = inputString("Light Name")
    val lightIsPoweredOn = inputBoolean("Yes or No for Light is On/Off")
    var brightness = 0
    while(true)
    {
        brightness = inputInteger("Brightness")
        if(brightness !in 1..100)
        {
            println("Brightness range invalid! Try Again")
            continue
        }
        else break
    }
    val light = Light(brightness, lightDeviceName, lightDeviceId, lightIsPoweredOn)

    //Fan
    println()
    val fanDeviceId = inputInteger("Fan Id")
    val fanDeviceName = inputString("Fan Name")
    val fanIsPoweredOn = inputBoolean("Yes or No for Fan is On/Off")
    var speedLevel = 0
    while(true)
    {
        speedLevel = inputInteger("Speed Level")
        if(speedLevel !in 1..5)
        {
            println("Speed level range invalid! Try Again")
            continue
        }
        else break
    }
    val fan = Fan(speedLevel, fanDeviceName, fanDeviceId, fanIsPoweredOn)

    //AirConditioner
    println()
    val acDeviceId = inputInteger("AC Id")
    val acDeviceName = inputString("AC Name")
    val acIsPoweredOn = inputBoolean("Yes of No for AC is On/Off")
    var temperature = 0.0
    while(true)
    {
        temperature = inputDouble("Temperature")
        if(temperature !in 16.0..30.0)
        {
            println("Invalid Temperature Range! Try Again")
            continue
        }
        else break
    }
    val airConditioner = AirConditioner(temperature, acDeviceName, acDeviceId, acIsPoweredOn)

    //Output
    light.displayLightInfo()
    fan.displayFanInfo()
    airConditioner.airConditionerInfo()
}