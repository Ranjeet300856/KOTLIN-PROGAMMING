/*
    Problem Statement:
    Create a Kotlin Extension Function for the Set<Int> class named uniqueElementsCount().
    The function should:
    1. Count the total number of unique elements present in the Set.
    2. Return the count as an Int value.
    3. Handle empty sets safely.
*/

fun Set<Int>.uniqueElementsCount(): Int = this.size
fun main()
{
    val numbers = setOf(10, 20, 30, 40, 40, 50, 30)
    val totalUnique = numbers.uniqueElementsCount()
    println("Total Unique Elements : $totalUnique")
}