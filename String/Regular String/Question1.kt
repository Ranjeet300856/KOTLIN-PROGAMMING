/*
    Write a Kotlin program that:

    Declares a regular string variable with your full name.
    Prints the full string.
    Prints the first character of the string.
    Prints the last character of the string.
    Prints the length of the string.
    Prints the string in uppercase.
    Prints the string in lowercase. 
*/

fun main()
{
    //Declare String
    val name = "Ranjeet Suthar"

    //Full Name
    println("My Name is         : $name")

    //First and Last Character
    println("First Character    : ${name[0]}")
    println("Last Character     : ${name[name.length - 1]}")

    //Length of Name
    println("Length of the name : ${name.length}")

    //Name in Uppercase and Lowercase
    println("Name in Uppercase  : ${name.uppercase()}")
    println("Name in Lowercase  : ${name.lowercase()}")
}