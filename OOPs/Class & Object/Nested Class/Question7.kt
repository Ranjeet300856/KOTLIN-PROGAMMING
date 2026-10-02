//Question 7 — Nested Class with Static-like Utility Behavior
class Temperature {
    class Converter {
        fun celsiusToFahrenheit(celsius: Double) : Double = (celsius * 9 / 5) + 32
        fun fahrenheitToCelsius(fahrenheit: Double): Double = (fahrenheit - 32) * 5 / 9 
        fun celsiusToKelvin(celsius: Double): Double = celsius + 273.15
    }
}

fun main()
{
    val converter = Temperature.Converter()

    val celsiusToFahrenheitTest1 = converter.celsiusToFahrenheit(0.0)
    val celsiusToFahrenheitTest2 = converter.celsiusToFahrenheit(100.0)
    
    val fahrenheitToCelsiusTest1 = converter.fahrenheitToCelsius(32.0)
    val fahrenheitToCelsiusTest2 = converter.fahrenheitToCelsius(212.0)

    val celsiusToKelvinTest1 = converter.celsiusToKelvin(0.0)
    val celsiusToKelvinTest2 = converter.celsiusToKelvin(100.0)

    println("Celsius To Fahrenheit Test1 0.0C   -> %.2fF".format(celsiusToFahrenheitTest1))
    println("Celsius To Fahrenheit Test2 100.0C -> %.2fF\n".format(celsiusToFahrenheitTest2))

    println("Fahrenheit To Celsius Test1 32.0F   -> %.2fC".format(fahrenheitToCelsiusTest1))
    println("Fahrenheit To Celsius Test2 212.0F  -> %.2fC\n".format(fahrenheitToCelsiusTest2))

    println("Celsius To Kelvin Test1 0.0C   -> %.2fK".format(celsiusToKelvinTest1))
    println("Celsius To Kelvin Test2 100.0C -> %.2fK\n".format(celsiusToKelvinTest2))
}