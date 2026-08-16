//Write a Kotlin program that creates an integer array and allows the user to access an element by entering its index.
fun main()
{
    val numbers = intArrayOf(10, 20, 30, 40, 50)
    print("Array : ")
    numbers.forEach { print("$it ") }

    print("\nEnter a index to access element : ")
    val index = readln().trim().toIntOrNull()
    if(index == null)
    {
        println("Invalid Input!")
        return
    }

    try {
        val value = numbers[index]
        println("Element at index $index : $value")
    }
    catch(e: ArrayIndexOutOfBoundsException) {
        println("Error: Invalid array index.")
    }

    println("Array access process completed.")
}