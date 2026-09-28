/*
    Question 8 — Bounded Generics: Comparable Constraint
    Task:
    Create a Kotlin program with a generic function named findGreater() that accepts two values of the same type and returns the greater value.
    Use a type constraint so that the values can be compared. 
*/

fun <T : Comparable<T>> findGreater(value1: T, value2: T): T {
    if(value1 > value2) return value1
    else return value2
}

fun main()
{
    val resultInt = findGreater(20, 10)
    val resultDouble = findGreater(50.0, 50.2)
    val resultString = findGreater("Ranjeet", "Rahul")

    println("Integer Result : ${resultInt}")
    println("Double Result  : ${resultDouble}")
    println("String Result  : ${resultString}")
}