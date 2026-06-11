/*
    Problem Statement
    Create a Kotlin program that checks whether specific employees are authorized to enter a secure office area.

    Requirements:
    1. Create a Read-Only Set containing:
    "Ranjeet", "Aman", "Neha", "Ravi", "Aman"

    2. Check whether "Neha" is present in the Set using the `in` operator.
    3. Check whether "Mohit" is present in the Set using the `in` operator.
    4. Print appropriate messages based on both checks.
    5. Print the total number of unique authorized employees.
*/

fun main()
{
    val names = setOf("Ranjeet", "Aman", "Neha", "Ravi", "Aman")

    if("Neha" in names) println("\nYes, Neha is present in the set")
    else println("\nNo, Neha is not present in the set")

    if("Mohit" in names) println("Yes, Mohit is present in the set")
    else println("No, Mohit not present in the set")

    println("\nTotal unique authorized employees : ${names.size}")
}