/*
    Write a Kotlin program to control a smart device using an Object Expression that implements two interfaces: PowerController and DeviceInfo.

    The PowerController interface must contain:

    A function turnOn() that turns on the device.
    A function turnOff() that turns off the device.

    The DeviceInfo interface must contain:

    A function getDeviceName(): String that returns the device name.

    Create an Object Expression that implements both interfaces. 
*/

interface PowerController {
    fun turnOn()
    fun turnOff()
}

interface DeviceInfo {
    fun getDeviceName(): String
}

fun main()
{
    val smartDevice = object : PowerController, DeviceInfo {
        var isOn = false
        override fun getDeviceName(): String = "Smart Light"

        override fun turnOn() {
            isOn = true
            println("Device turned ON.")
        }

        override fun turnOff() {
            isOn = false
            println("Device turned OFF.")
        }
    }

    println("Device Name : ${smartDevice.getDeviceName()}")
    smartDevice.turnOn()
    println("Current Status : ${if(smartDevice.isOn) "ON" else "OFF"}\n")

    smartDevice.turnOff()
    println("Current Status : ${if(smartDevice.isOn) "ON" else "OFF"}\n")
}