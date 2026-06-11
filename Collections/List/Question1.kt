/*
    Question 1: Create and Analyze an Integer List

    Create an immutable List of Integers containing:
    10, 20, 30, 40, 50

    Perform the following operations:
    1. Create the List using listOf().
    2. Print the complete List.
    3. Print the total number of elements.
    4. Print the first element.
    5. Print the last element.
    6. Print the element at index 2.
    7. Print the data type of the List.
    8. Print the data type of the first element.
    9. Print all elements using a loop.
    10. Print whether the List is empty or not.
*/

fun main()
{
    val numbers = listOf(10, 20, 30, 40, 50)

    println("List                      : $numbers")
    println("Total Elements            : ${numbers.size}")
    println("First Element             : ${numbers.firstOrNull()}")
    println("Last Element              : ${numbers.lastOrNull()}")
    println("Index 2 Element           : ${numbers[2]}")
    println("Data Type                 : ${numbers::class.simpleName}")
    println("Data Type First Element   : ${numbers[0]::class.simpleName}")

    print("\nPrint elements using loop : ")
    for(item in numbers) print("$item ")
    
    if(numbers.isEmpty()) println("List is Empty")
    else println("\nList is not empty")
}