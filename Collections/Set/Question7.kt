/*
    Problem Statement
    Create a Kotlin program that checks whether an event has registered participants.

    Requirements:
    1. Create a Read-Only Set containing:
    "Ranjeet", "Aman", "Neha"

    2. Print the complete Set.
    3. Check whether the Set is not empty using `isNotEmpty()`.
    4. Print an appropriate message based on the result.
    5. Print the total number of registered participants.
*/

fun main()
{
    val names = setOf("Ranjeet", "Aman", "Neha")

    println("All Names : $names")

    if(names.isNotEmpty()) println("Yes, set is not empty")
    else println("No, set is empty")

    println("\nTotal registered participants : ${names.size}")
}