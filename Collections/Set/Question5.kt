/*
    Problem Statement
    Create a Kotlin program that manages a collection of weekly tasks using a Read-Only Set.

    Requirements:
    1. Create a Read-Only Set containing:
    "Study DSA", "Practice Kotlin", "Workout", "Read Book", "Practice Kotlin"

    2. Print the complete Set.
    3. Print the task present at position 0 using elementAt().
    4. Print the task present at position 2 using elementAt().
    5. Print the total number of unique tasks.
*/

fun main()
{
    val weeklyTask = setOf("Study DSA", "Practice Kotlin", "Workout", "Read Book", "Practice Kotlin")

    println("Weekly Task       : $weeklyTask")

    println("\nThe task present at position 0 : ${weeklyTask.elementAt(0)}")
    println("The task present at position 2 : ${weeklyTask.elementAt(2)}")

    println("\nTotal unique task : ${weeklyTask.size}")
}