fun convertCelsiusToFahrenheit(celsius: Double): Double
{
    val fahrenheit = (celsius * 9 / 5) + 32
    return fahrenheit
}
fun main()
{
    //Q5th
    /*
    Write a Kotlin program that defines a function convertCelsiusToFahrenheit(celsius: Double)
    which takes temperature in Celsius as a parameter and returns the temperature in Fahrenheit.
    Use the formula:
    fahrenheit = (celsius × 9 / 5) + 32
    The program should call this function from main() and print the returned result.
    */

    print("Enter Temperature in Calsius : ")
    val temperature = readln().trim().toDoubleOrNull()
    if(temperature == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    val fahrenheit = convertCelsiusToFahrenheit(temperature)
    println("Fahrenheit = %.2f".format(fahrenheit))
}