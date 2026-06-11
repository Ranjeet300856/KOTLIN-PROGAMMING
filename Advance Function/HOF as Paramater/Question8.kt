/*
    Question 8 — Dynamic Temperature Converter Using Function as Parameter
    Problem Statement - Create a Kotlin program that converts temperature using different conversion functions passed into a Higher Order Function.

    This program should demonstrate how one Higher Order Function can dynamically execute different temperature conversion logics. 
*/

fun celsiusToFahrenheit(temperature: Double): Double = (9 * temperature) / 5 + 32
fun fahrenheitToCelsius(temperature: Double): Double = (5.0 / 9.0) * (temperature - 32)
fun celsiusToKelvin(temperature: Double): Double = temperature + 273.15

fun convertTemperature(temperature: Double, operation: (Double) -> Double): Double = operation(temperature)

fun main()
{
    print("Enter Temperature : ")
    val temperature = readln().trim().toDoubleOrNull()
    if(temperature == null)
    {
        println("Invalid Input")
        return
    }

    println("\nCelsius To Fahrenheit : %.2f".format(convertTemperature(temperature, ::celsiusToFahrenheit)))
    println("Fahrenheit To Celsius : %.2f".format(convertTemperature(temperature, ::fahrenheitToCelsius)))
    println("Celsius To Kelvin     : %.2f".format(convertTemperature(temperature, ::celsiusToKelvin)))
}