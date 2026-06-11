/*
    Problem Statement
    Create a Kotlin program that counts unique products available in an online store.

    Requirements:
    1. Create a Read-Only Set containing:
    "Laptop", "Mouse", "Keyboard", "Laptop", "Monitor", "Mouse"

    2. Print the complete Set.
    3. Print the total number of unique products using count().
    4. Print the total number of unique products using size.
    5. Print whether both results are equal or not.
*/

fun main()
{
    val products = setOf("Laptop", "Mouse", "Keyboard", "Laptop", "Monitor", "Mouse")

    println("All Products         : $products")

    println("Total Unique Products : ${products.count()}")
    println("Products Size        : ${products.size}")
    
    if(products.count() == products.size)
    println("\nBoth Results Are Equal")
    else println("\nResults Are Not Equal")
}