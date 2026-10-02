//Question 8 — Nested Class with State Management
class SmartDevice {
    class Settings(
        private var volume: Int = 50,
        private var brightness: Int = 70,
        private var wifiEnabled: Boolean = false
    ) {
        fun increaseVolume(amount: Int) {
            if(amount > 0 && amount <= 100) {
                if(amount + volume <= 100) volume += amount
                else volume = 100
            } else println("Invalid Volume Amount")
        }

        fun decreaseVolume(amount: Int) {
            if(amount > 0 && amount <= 100) {
                if(volume - amount >= 0) volume -= amount
                else volume = 0
            } else println("Invalid Volume Amount")
        }

        fun increaseBrightness(amount: Int) {
            if(amount > 0 && amount <= 100) {
                if(amount + brightness <= 100) brightness += amount
                else brightness = 100
            } else println("Invalid Brightness Amount")
        }

        fun decreaseBrightness(amount: Int) {
            if(amount > 0 && amount <= 100) {
                if(brightness - amount >= 0) brightness -= amount
                else brightness = 0
            } else println("Invalid Brightness Amount")
        }

        fun toggleWifi() {
            if(wifiEnabled) wifiEnabled = false
            else wifiEnabled = true
        }

        fun displaySettings() {
            println("Volume      : $volume")
            println("Brightness  : $brightness")
            println("WIFI Status : ${if(wifiEnabled) "Enabled" else "Disabled"}\n")
        }
    }
}

fun main()
{
    val setting = SmartDevice.Settings()
    println("Initial Settings:")
    setting.displaySettings()

    setting.increaseVolume(40)
    setting.displaySettings()
    setting.decreaseVolume(50)
    setting.displaySettings()

    setting.increaseBrightness(30)
    setting.displaySettings()
    setting.decreaseBrightness(60)
    setting.displaySettings()

    setting.toggleWifi()
    setting.displaySettings()
} 