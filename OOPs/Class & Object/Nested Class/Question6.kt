/* 
    Question 6 — Nested Class with Multiple Responsibilities
    Mobile Phone System

    Create a Kotlin program using a Nested Class.
*/

class MobilePhone {
    class Battery(
        private val capacity: Int,
        private var currentLevel: Int
    ) {
        fun getBatteryPercentage(): Double = (currentLevel.toDouble() / capacity) * 100
        fun isLowBattery(): Boolean = getBatteryPercentage() <= 20
        fun chargeBattery(amount: Int) {
            currentLevel = minOf(currentLevel + amount, capacity)  
        }

        fun displayBatteryStatus() {
            println("Capacity      : $capacity")
            println("Current Level : $currentLevel")
            println("Battery percentage : %.0f%%".format(getBatteryPercentage()))
            println("Low battery status : ${if(isLowBattery()) "Yes" else "No"}\n")
        }
    }
}

fun main()
{
    val battery = MobilePhone.Battery(5000, 1000)
    battery.displayBatteryStatus()

    battery.chargeBattery(1500)
    battery.displayBatteryStatus()
}