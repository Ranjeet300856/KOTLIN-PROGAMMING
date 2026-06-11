/*
    Problem Statement
    Create a Kotlin program that displays all books from a Read-Only Set.

    Requirements:
    1. Create a Read-Only Set containing:
    "Atomic Habits", "Clean Code", "The Pragmatic Programmer",
    "Clean Code", "Atomic Habits"

    2. Print the complete Set.
    3. Print the total number of unique books.
    4. Use a for loop to print each book on a separate line.
    5. Print whether the Set is empty or not.
*/

fun main()
{
    val books = setOf("Atomic Habits", "Clean Code", "The Pragmatic Programmer", "Clean Code", "Atomic Habits")

    println("All Books          : $books")
    println("Total Unique Books : ${books.size}")

    println()
    for(book in books) println(book)

    if(books.isEmpty()) println("\nSet is empty")
    else println("\nSet is not empty")
} 