/*
    Question 1 — Generic Function: Basic Data Processor
    Task:
    Create a Kotlin program with a generic function named processData() 
    that accepts a value of any data type and prints the value along with its runtime type.
*/

fun <T> processData(_data: T) {
    println("Value : $_data and DataType -> ${_data!!::class}")
}

fun main() 
{
    processData(100)
    processData("Kotlin")
    processData(99.5)
    processData(true)
}