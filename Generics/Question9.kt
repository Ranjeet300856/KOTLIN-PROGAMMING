/*
    Question 9 — Bounded Generic Class: Numeric Container
    Task:
    Create a generic class named NumberContainer<T> that stores a numeric value.
    Use a type constraint so that the class only accepts types derived from Number. 
*/

class NumberContainer<T : Number>(val value: T) {
    fun getDoubleValue(): Double {
        return value.toDouble()
    }

    fun displayValue() {
        println("Value : $value and Type -> ${value::class.simpleName}")
    }
}

fun main()
{
    val intValue = NumberContainer(10)
    val doubleValue = NumberContainer(10.50)
    val floatValue = NumberContainer(10.00f)

    val intToDouble = intValue.getDoubleValue()
    println("Int (${intValue.value}) to Double : %.2f".format(intToDouble))
    doubleValue.displayValue()
    floatValue.displayValue()
}