//Write a Kotlin program that stores a list of numbers and attempts to remove numbers from the same mutable list while iterating over it.
fun main()
{
    val numbers = mutableListOf(10, 20, 30, 40, 50)
    try {
        for(value in numbers)
        if(value % 20 == 0) numbers.remove(value)
    } catch(e: ConcurrentModificationException) {
        println("Error: Collection was modified while it was being iterated.")
    }

    print("Numbers after update the list : ")
    numbers.forEach { print("$it, ")}
    println("Collection modification process completed.")
}