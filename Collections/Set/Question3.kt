/*
Problem Statement
Create a Kotlin program that verifies whether all required subjects are available in a student's selected subjects collection.

Requirements:
1. Create a Read-Only Set containing: "Mathematics", "Physics", "Chemistry", "English"
2. Create another Read-Only Set containing: "Mathematics", "English"
3. Check whether the first Set contains all subjects from the second Set.
4. Print an appropriate message based on the result.
5. Print the total number of unique subjects in the first Set.
*/

fun main()
{
    val subjects = setOf("Mathematics", "Physics", "Chemistry", "English")
    val subjects2 = setOf("Mathematics", "English")

    if(subjects.containsAll(subjects2))
        println("All required subjects are available.")
    else 
        println("All required subjects are not available.")
    
    println("Total uniques subjects in first set : ${subjects.size}")
}