/*
    Question 7 — Bounded Generics: Number Calculator

    Task:
    Create a Kotlin program with a generic function named calculateSum() that accepts two values of a numeric type and returns their sum.
    Use a type constraint so that the function only accepts types derived from Number. 
*/

fun <T : Number> calculateSum(value1: T, value2: T): Double {
    return value1.toDouble() + value2.toDouble()
}

fun main() 
{
    val intResult = calculateSum(10, 20)
    val doubleResult = calculateSum(50.5, 50.0)
    val floatResult = calculateSum(20.8f, 80.2f)

    println("Int Result    : $intResult")
    println("Double Result : %.2f".format(doubleResult))
    println("Float Result  : %.2f".format(floatResult))
}