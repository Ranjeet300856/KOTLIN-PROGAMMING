/*
    Problem Statement
    Create a Kotlin program that compares two course enrollment sets.

    Requirements:
    1. Create two Read-Only Sets:
    Set 1:
    "Kotlin", "Java", "Python"

    Set 2:
    "Python", "Java", "Kotlin"

    2. Print both Sets.
    3. Check whether both Sets are equal using ==.
    4. Print an appropriate message based on the comparison result.
    5. Print the size of both Sets.
*/

fun main()
{
    val set1 = setOf("Kotlin", "Java", "Python")
    val set2 = setOf("Python", "Java", "Kotlin")

    println("Set 1 : $set1")
    println("Set 2 : $set2")

    if(set1 == set2) println("\nBoth sets are equals")
    else println("\nSets are not equals")

    println("\nSize of set 1 : ${set1.size}")
    println("Size of set 2 : ${set2.size}")
}