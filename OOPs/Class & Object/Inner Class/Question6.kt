//Question 6 — Inner Class with Multiple Responsibilities
class MobilePhone(
    private val brand: String,
    private val model: String,
    private var batteryLevel: Int,
    private val batteryCapacity: Int
) {
    inner class BatteryManager {
        fun chargeBattery(amount: Int) {
            if(amount <= 0) {
                println("Invalid Battery Charge Amount")
                return
            } else {
                if(batteryLevel + amount <= batteryCapacity) {
                    batteryLevel += amount
                    println("Battery Charge Successfully")
                } else {
                    batteryLevel = batteryCapacity
                    println("Battery Charge Successfully")
                }
            }
        }

        fun useBettary(amount: Int) {
            if(amount <= 0) {
                println("Invalid Battery Use Amount")
                return
            } else {
                if(batteryLevel - amount > 0) {
                    batteryLevel -= amount
                    println("Battery Used Successfully")
                } else {
                    batteryLevel = 0
                    println("Battery Used Successfully")
                }
            }
        }

        fun showBettaryStatus() {
            println("Mobile Brand : $brand")
            println("Mobile Model : $model")
            println("Current Battery : $batteryLevel")
            println("Battery Capacity : $batteryCapacity")

            var percentage = (batteryLevel.toDouble() / batteryCapacity.toDouble()) * 100
            println("Battery percentage : %.2f%%\n".format(percentage))
        }
    }
}

fun main()
{
    val mobile = MobilePhone("Samsung", "Galaxy S25", 60, 100)
    val batteryManager = mobile.BatteryManager()

    batteryManager.showBettaryStatus()
    batteryManager.chargeBattery(30)
    batteryManager.showBettaryStatus()

    batteryManager.chargeBattery(30)
    batteryManager.showBettaryStatus()

    batteryManager.useBettary(40)
    batteryManager.showBettaryStatus()

    batteryManager.useBettary(80)
    batteryManager.showBettaryStatus()

    batteryManager.useBettary(-10)
    batteryManager.showBettaryStatus()
}