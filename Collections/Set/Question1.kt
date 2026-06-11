/*
    Problem Statement
    Create a Kotlin program that stores programming languages in a Read-Only Set.

    Requirements:
    1. Create a Set containing: "Kotlin", "Java", "Python", "Java", "Kotlin"

    2. Print the complete Set.
    3. Print the total number of unique languages.
    4. Check whether "Python" exists in the Set.
    5. Check whether "C++" exists in the Set.
*/

fun main()
{
    val programmingLanguage = setOf("Kotlin", "Java", "Python", "Java", "Kotlin")

    println("Programming Languages : $programmingLanguage")
    println("Total Unique Elements : ${programmingLanguage.size}")

    if(programmingLanguage.contains("Python")) println("Python exists in the Set")
    else println("Python not exists in the Set.")

    if(programmingLanguage.contains("C++")) println("C++ exists in the Set.")
    else println("C++ not exists in the Set.")
}