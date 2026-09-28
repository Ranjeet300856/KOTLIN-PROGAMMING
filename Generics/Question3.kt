/*
    Question 3 — Generic Class: Type-Safe Box

    Task:
    Create a Kotlin program with a generic class named Box<T> 
    that stores a single value and provides functions to store, retrieve, and display that value. 
*/

class Box<T>(private var value: T) {
    fun getValue(): T {
        return value
    }
    fun updateValue(newValue: T) {
        value = newValue
    }

    fun displayValue() {
        println("Current Value : $value and Type -> ${value!!::class.simpleName}")
    }
}

fun main() 
{
    val boxInt = Box(100)
    val boxDouble = Box(90.80)
    val boxString = Box("Ranjeet Suthar")

    println("Box Int:")
    val receivedValue = boxInt.getValue()
    println("Received Value : $receivedValue")
    boxInt.updateValue(200)
    boxInt.displayValue()

    println("\nBox Double:")
    println("Received Value : ${boxDouble.getValue()}")
    boxDouble.updateValue(98.00)
    boxDouble.displayValue()

    println("\nBox String:")
    println("Received Vaulue : ${boxString.getValue()}")
    boxString.updateValue("Rahul Suthar")
    boxString.displayValue()
}