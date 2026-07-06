/*
    Problem Statement:
    Create a Kotlin Extension Function for the String class named formatName().
    The function should:
    1. Remove leading and trailing spaces.
    2. Convert the entire name to lowercase.
    3. Capitalize the first character of the name.
    4. Return the formatted name as a String. 
*/

fun String.formatName(): String
{
    val formatName = this.trim()
    val newName = formatName[0].uppercase() + formatName.substring(1..(formatName.length) - 1).lowercase()
    return newName
}
fun main()
{
    print("Enter Name : ")
    val name = readln()
    if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace()})
    {
        println("Invalid Input")
        return
    }

    val formattedName = name.formatName()
    println("Original Name  : $name")
    println("Formatted Name : $formattedName")
}