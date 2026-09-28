/*
    Question 6 — Multiple Type Parameters: Generic Data Mapper

    Task:
    Create a Kotlin program with a generic function named mapData() 
    that accepts a value of one type and converts it into another type using a transformation function. 
*/

fun <T, R> mapData(value: T, transform: (T) -> R): R {
    return transform(value)
}

fun main() 
{
    val intToString = mapData(100) { "Number : $it" }
    val stringTOInt = mapData("200") { it.toInt() }
    val doubleToString = mapData(50.25) { "Price : $it" }

    println(intToString)
    println(stringTOInt)
    println(doubleToString)
}