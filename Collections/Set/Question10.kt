/*
    Problem Statement
    Create a Kotlin program that analyzes students participating in two different clubs.

    Requirements:
    1. Create two Read-Only Sets:
    Coding Club:
    "Ranjeet", "Aman", "Neha", "Ravi"

    Sports Club:
    "Ravi", "Neha", "Mohit", "Karan"

    2. Print all students from both clubs using union().
    3. Print students who are members of both clubs using intersect().
    4. Print students who are only in the Coding Club using subtract().
    5. Print the size of all three results:
    - Union Result
    - Intersection Result
    - Subtract Result
*/

fun main()
{
    val codingClub = setOf("Ranjeet", "Aman", "Neha", "Ravi")
    val sportClub = setOf("Ravi", "Neha", "Mohit", "Karan")

    val uniqueStudentSet = codingClub.union(sportClub)
    println("Unique Students in Both Club : $uniqueStudentSet")

    val commonStudentSet = codingClub.intersect(sportClub)
    println("Common Students in Both Club : $commonStudentSet")

    val subtractResult = codingClub.subtract(sportClub)
    println("Subtract Result              : $subtractResult")

    println("\nSize of union result     : ${uniqueStudentSet.size}")
    println("Size of intersect result : ${commonStudentSet.size}")
    println("Size of subtract result  : ${subtractResult.size}")
}