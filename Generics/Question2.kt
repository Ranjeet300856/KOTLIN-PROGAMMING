/*
    Question 2 — Generic Function: Find Maximum Value
    Task:
    Create a Kotlin program with a generic function named findMax() that accepts two values of the same generic type and returns the greater value. 
*/
fun <T : Comparable<T>> findMax(value1: T, value2: T): T {
    if(value1 > value2) return value1
    else return value2
}

fun main()
{
    val maxInt = findMax(10, 20)
    val maxDouble = findMax(10.0, 10.5)
    val maxString = findMax("Ranjeet", "Rahul")
    println("Maximum of 10 and 20         : $maxInt")
    println("Maximum of 10.0 and 10.5     : $maxDouble")
    println("Maximum of Ranjeet and Rahul : $maxString")
}