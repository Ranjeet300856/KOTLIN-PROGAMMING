//Question 5: Temperature Converter
class Temperature(private var celsius: Double) {
    val fahrenheit: Double 
        get() = (celsius * 9 / 5) + 32

    fun updateCelsius(newValue: Double) {
        if(newValue >= -273.15) {
            celsius = newValue
            println("Celsius Updated Successfully")
        } else {
            println("Invalid temperature : %.2f".format(newValue))
        }
    }

    fun getCelsius(): Double = celsius
}

fun displayTemp(temperature: Temperature) {
    println("Celsius     : %.2f".format(temperature.getCelsius()))
    println("Fahrenheit  : %.2f\n".format(temperature.fahrenheit))
}

fun main()
{
    val temperature = Temperature(25.0)
    displayTemp(temperature)

    temperature.updateCelsius(100.0)
    displayTemp(temperature)

    temperature.updateCelsius(-300.0)
    displayTemp(temperature)
}