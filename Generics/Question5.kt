/*
    Question 5 — Multiple Type Parameters: Generic Pair

    Task:
    Create a Kotlin program with a generic class named PairContainer<T, R> 
    that stores two values of different types and provides functions to retrieve and display them. 
*/

class PairContainer<T, R>(
    val value1: T,
    val value2: R
) {
    fun getFirst(): T {
        return value1
    }

    fun getSecond(): R {
        return value2
    }

    fun display() {
        println("Value 1 : $value1 and Data Type -> ${value1!!::class.simpleName}")
        println("Value 2 : $value2 and Data Type -> ${value2!!::class.simpleName}")
    }
} 

fun main()
{
    val test1 = PairContainer(1001, "Kotlin")
    val test2 = PairContainer("Android", 98.98)
    val test3 = PairContainer(true, 100)

    println("Test 1 Int + String:")
    println("First Value : ${test1.getFirst()}")
    println("Second Value : ${test1.getSecond()}")
    test1.display()

    println("\nTest 2 String + Double")
    println("First Value : ${test2.getFirst()}")
    println("Second Value : ${test2.getSecond()}")
    test2.display()

    println("\nTest 3 Boolean + Int")
    println("First Value : ${test3.getFirst()}")
    println("Second Value : ${test3.getSecond()}")
    test3.display()
}