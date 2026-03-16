//Q8th
/*
    Write a Kotlin program that takes a temperature in Celsius as input and checks whether the temperature is above the boiling point of water.
    The boiling point of water is 100°C.
    If the temperature is greater than 100, print:
    Water would boil at this temperature
    If the temperature is 100 or below, the program should print nothing.
*/

fun main()
{
    print("Enter Temperature in Celsius : ")
    val temperature = readln().trim().toIntOrNull()
    if(temperature == null)
    {
        println("Invalid Input! Please Enter a Valid Integer")
        return
    }

    if(temperature > 100) println("Water would boil at this temperature")
}