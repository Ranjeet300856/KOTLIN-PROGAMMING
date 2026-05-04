/*
    Write a Kotlin program that:

    Declares two string variables with the same value using string literals.
    Declares another string using a different way (new object creation) but with the same value.
    Compares:
    First and second string using ==
    First and third string using ==
    First and third string using ===
    Prints all comparison results clearly. 
*/

fun main()
{
    val value1 = "Ranjeet"
    val value2 = "Ranjeet"
    val value3 =  String("Ranjeet".toCharArray())

    println("$value1 == $value2   : ${value1 == value2}")
    println("$value1 == $value3   : ${value1 == value3}")
    println("$value1 === $value3  : ${value1 === value3}")
}