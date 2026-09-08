/*
    Question 6 — Unique Products
    Create a Kotlin data class named Product with the following properties:
    - id: Int
    - name: String
    - price: Double

    Create a list containing at least 6 Product objects.

    The list must contain:
    - At least 2 pairs of Product objects having exactly the same data.
    - At least 2 Product objects having different data.

    Your program should:

    1. Print all products from the original list.
    2. Convert the list into a Set.
    3. Print all products from the Set.
    4. Print the number of products before and after removing duplicates.
    5. Demonstrate that two Product objects containing exactly the same
       data are considered equal.
    6. Demonstrate that equal Product objects have the same hashCode().
    7. Verify that the Set removes duplicate Product objects based on
       their data.
*/

data class Product(
    val id: Int,
    val name: String,
    var price: Double
)

fun main()
{
    val product1 = Product(101, "Laptop", 60000.0)
    val product2 = Product(102, "Keyboard", 1000.0)
    val product3 = Product(101, "Laptop", 60000.0)
    val product4 = Product(104, "Printer", 20000.0)
    val product5 = Product(105, "Speaker", 6000.0)
    val product6 = Product(106, "CPU", 40000.0)
    val products = listOf(product1, product2, product3, product4, product5, product6)

    println("All Products:")
    products.forEach {
        println(it)
    }

    val totalProducts = products.size
    val setOfProducts = products.toSet()
    println("\nAll Unique Products")
    setOfProducts.forEach {
        println(it)
    }

    val totalUniqueProducts = setOfProducts.size
    
    println("\nTotal Products        : $totalProducts")
    println("Total Unique Products : $totalUniqueProducts")

    println("Hash Code of All Products:")
    products.forEach {
        println(it.hashCode())
    }

    println("\nAre Product 1 and Product 3 Equal? : ${product1 == product3}")
    println(
    "Do Product 1 and Product 3 have the same hashCode? : " +
    (product1.hashCode() == product3.hashCode())
    )
}