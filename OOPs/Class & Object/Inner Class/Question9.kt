//Question 9 — Inner Class with Validation, State Management & Multiple Operations
class SmartDevice(
    private val deviceName: String,
    private var isPoweredOn: Boolean,
    private var volume: Int,
    private val maxVolume: Int
) {
    inner class DeviceController {
        fun powerOn() {
            if(isPoweredOn) {
                println("Device powered is Already ON.")
            } else {
                isPoweredOn = true
                println("Device powered ON.")
            }
        }

        fun powerOff() {
            if(isPoweredOn) {
                isPoweredOn = false
                println("Device powered OFF.")
            } else {
                println("Device powered is Already OFF.")
            }
        }

        fun increaseVolume(amount: Int) {
            if(amount > 0) {
                if(isPoweredOn) {
                    if((amount + volume) <= maxVolume) {
                        volume += amount
                        println("Volume increased successfully.")
                    } else {
                        volume = maxVolume
                        println("Volume reached maximum : $maxVolume")
                    }
                } else {
                    println("Cannot change volume. Device is OFF.")
                }
            } else {
                println("Invalid volume amount.")
            }
        }

        fun decreaseVolume(amount: Int) {
            if(amount > 0) {
                if(isPoweredOn) {
                    if((volume - amount) > 0) {
                        volume -= amount
                        println("Volume decreased successfully.")
                    } else {
                        volume = 0
                        println("Volume reached minimum : 0")
                    }
                } else {
                    println("Cannot change volume. Device is OFF.")
                } 
            } else {
                println("Invalid volume amount.")
            }
        }

        fun showDeviveStatus() {
            println("Device Name : $deviceName")
            println("Power       : ${if(isPoweredOn) "ON" else "OFF"}")
            println("Volume      : $volume")
            println("Max Volume  : $maxVolume")
            println("Volume Percentage : %.2f%%\n".format((volume.toDouble() / maxVolume.toDouble()) * 100))
        }
    }
}

fun main()
{
    val smartDevice = SmartDevice(
        "SmartSpeaker",
        false,
        30,
        100
    )

    val deviceController = smartDevice.DeviceController()
    deviceController.showDeviveStatus()

    deviceController.powerOn()
    deviceController.increaseVolume(50)
    deviceController.increaseVolume(50)
    deviceController.showDeviveStatus()

    deviceController.decreaseVolume(30)
    deviceController.decreaseVolume(100)
    deviceController.showDeviveStatus()

    deviceController.increaseVolume(-10)

    deviceController.powerOff()
    deviceController.increaseVolume(20)
}