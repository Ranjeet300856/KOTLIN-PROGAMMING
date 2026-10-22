//Create a Kotlin program using Abstraction to manage different smart home devices.
interface Controllable {
    fun turnOn(): Boolean
    fun turnOff(): Boolean
}

abstract class SmartDevice(val deviceName: String) {
    abstract fun getStatus(): String
}

class SmartLight(deviceName: String, var state: Boolean = false) : SmartDevice(deviceName), Controllable {
    override fun turnOn(): Boolean {
        if(deviceName.isBlank()) return false
        else {
            state = true
            return true
        }
    }

    override fun turnOff(): Boolean {
        if (deviceName.isBlank()) return false
        else {
            state = false
            return true
        }
    }

    override fun getStatus(): String {
        return "$deviceName is ${if(state) "On" else "Off"}"
    }
}

class SmartFan(deviceName: String, var state: Boolean = false) : SmartDevice(deviceName), Controllable {
    override fun turnOn(): Boolean {
        if(deviceName.isBlank()) return false
        else {
            state = true
            return true
        }
    }

    override fun turnOff(): Boolean {
        if (deviceName.isBlank()) return false
        else {
            state = false
            return true
        }
    }

    override fun getStatus(): String {
        return "$deviceName is ${if(state) "On" else "Off"}"
    }
}

fun main()
{
    val smartLight = SmartLight("Smart Light")
    val smartFan = SmartFan("Smart Fan")

    val lightIsOn = smartLight.turnOn()
    println(smartLight.getStatus())
    val lightIsOff = smartLight.turnOff()
    println(smartLight.getStatus())

    println()
    val fanIsOn = smartFan.turnOn()
    println(smartFan.getStatus())
    val fanIsOff = smartFan.turnOff()
    println(smartFan.getStatus())
}