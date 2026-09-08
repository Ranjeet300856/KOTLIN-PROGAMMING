/*
    Question 2 — Product Copy & Update

    Create a Kotlin data class named Product with the following properties:
    - id: Int
    - name: String
    - price: Double
    - category: String

    Create an original Product object.

    Using the copy() function, create a new Product object where:
    - the price is changed
    - the other properties remain unchanged

    Print both the original and copied Product objects.

    Verify that the copied Product is a different object from the original
    and that changing the price in the copied Product does not change
    the original Product's price.

    Do not manually implement a copy() function.
*/

data class Product(
    val id: Int,
    val name: String,
    val price: Double,
    val category: String
)

fun main()
{
    val product1 = Product(1001, "Laptop", 60000.0, "XYZ")
    val product2 = product1.copy(price = 80000.0)
    println("Original Product : $product1")
    println("Copied Product   : $product2")

    println("Are both objects the same reference? ${product1 === product2}")
    println("Original Price : ${product1.price}")
    println("Copied Price   : ${product2.price}")
}