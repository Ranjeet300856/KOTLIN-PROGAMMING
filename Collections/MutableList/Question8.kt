/*
    Question 8: Shopping Cart Manager
    Problem Statement
    Create a Kotlin program that manages a shopping cart using a MutableList<String>.

    Requirements
    1. Ask the user to enter 5 product names and store them in a MutableList<String>.
    Rules:
    Product name cannot be blank.
    Invalid input should be rejected and asked again.
    2. Print the complete shopping cart.

    3. Ask the user to enter a product name to remove.
    Use: remove()
    Remove only the first occurrence of that product.
    Print an appropriate message:
    Product removed successfully.
    or
    Product not found.

    4. Check whether the shopping cart is empty or not using:
    isEmpty()
    or
    isNotEmpty()
    Print an appropriate message.

    5. Print the final shopping cart and total products.
    Use: size 
*/

fun main()
{
    val products = mutableListOf<String>()

    for(i in 0..4)
    {
        while(true)
        {
            print("Enter Product ${i + 1} : ")
            val productName = readln().trim()
            if(productName.isBlank())
            {
                println("Invalid Input! Try Again")
                continue
            }

            products.add(productName)
            break
        }
    }

    println("Shopping Cart : $products")

    print("\nEnter Product Name to Remove : ")
    val removeProduct = readln().trim()
    if(removeProduct.isBlank())
    {
        println("Invalid Input")
        return
    }

    if(products.contains(removeProduct))
    {
        products.remove(removeProduct)
        println("Product removed successfully.")
    }
    else println("Product not found.")

    if(products.isNotEmpty()) println("\nShopping cart is not empty")
    else println("\nShopping cart is empty")

    println("\nFinal Shopping Cart : $products")
    println("Total Products      : ${products.size}")
}