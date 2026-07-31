//Create a Kotlin program to convert temperatures using Companion Object Utility Functions.
class Temperature(val cityName: String, var temperatureInCelsius: Double)
{
    companion object
    {
        fun celsiusToFahrenheit(celsius: Double): Double = (celsius * 9 / 5) + 32
        fun fahrenheitToCelsius(fahrenheit: Double): Double = (fahrenheit - 32) * 5 / 9
    }

    fun displayTemperatureDetails()
    {
        println("\nCity Name                 : $cityName")

        val fahrenheit = celsiusToFahrenheit(temperatureInCelsius)
        println("Temperature in Celsius    : %.2f".format(temperatureInCelsius))
        println("Temperature in Fahrenheit : %.2f".format(fahrenheit))
    }
}

fun inputCityName(): String
{
    while(true)
    {
        print("\nEnter City Name : ")
        val inputName = readln().trim()
        if(inputName.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputName
    }
}

fun inputCelsius(): Double
{
    while(true)
    {
        print("Enter Temperature In Celsius : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun displayDetails(temperatures: MutableList<Temperature>)
{
    for(temperature in temperatures)
    temperature.displayTemperatureDetails()
}

fun main()
{
    print("Enter total number of cities : ")
    val input = readln().trim().toIntOrNull()
    if(input == null || input <= 0)
    {
        println("Invalid Input!")
        return
    }

    val temperatures = mutableListOf<Temperature>()
    for(i in 1..input)
    {
        val city = inputCityName()
        val celsius = inputCelsius()
        val temperature = Temperature(city, celsius)
        temperatures.add(temperature)
    }
    displayDetails(temperatures)

    print("\nEnter a temperature in Fahrenheit : ")
    val inputFahrenheit = readln().trim().toDoubleOrNull()
    if(inputFahrenheit == null)
    {
        println("Invalid Input!")
        return
    }
    println("Fahrenheit to Celsius : %.2f".format(Temperature.fahrenheitToCelsius(inputFahrenheit)))
}