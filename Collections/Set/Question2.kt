/*
    Problem Statement
    Create a Kotlin program that stores country names in a Read-Only Set and performs basic collection checks.

    Requirements:
    1. Create a Set containing: "India", "Japan", "India", "Canada", "Australia", "Japan"
    2. Print the complete Set.
    3. Print whether the Set is empty or not.
    4. Print the first country in the Set.
    5. Print the last country in the Set.
*/

fun main()
{
    val country = setOf("India", "Japan", "India", "Canada", "Australia", "Japan")

    println("All Country : $country")

    if(country.isEmpty()) println("Set is empty")
    else println("Set is not empty")

    println("First country in set : ${country.first()}")
    println("Last country in set  : ${country.last()}")
}