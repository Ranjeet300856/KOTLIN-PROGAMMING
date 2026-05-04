/*
    Write a Kotlin program that:

    Declares a regular string variable that contains a name with extra spaces at the beginning and end.
    Removes all leading and trailing spaces from the string.
    Checks if the cleaned string is:
    Empty
    Blank
    Prints:
    Original string
    Cleaned string
    Whether it is empty
    Whether it is blank 
*/

fun main()
{
    val name = "        Ranjeet     "
    val cleanedName = name.trim()

    println("Original Name : $name")
    println("Cleaned Name  : $cleanedName")

    println("Is Empty      : ${cleanedName.isEmpty()}")
    println("Is Blank      : ${cleanedName.isBlank()}")
}