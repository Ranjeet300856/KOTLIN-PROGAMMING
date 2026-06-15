/*
    Question 7 — Product Discount Calculator (Advanced Level)
    Problem Statement
    Create a Kotlin program that calculates the final price of a product after applying a discount using a Trailing Lambda that returns a value.

    Requirements
    Create a Higher Order Function named calculateFinalPrice.
    The function should accept:
    Original product price (Double)
    A lambda parameter that:
    Receives the original price
    Returns the final discounted price (Double)
    The Higher Order Function must return the value returned by the lambda.

    Use Trailing Lambda Syntax while calling the function.
    Display:
    Original Price
    Discount Percentage
    Final Price 
*/

fun calculateFinalPrice(price: Double, calculator: (Double) -> Double): Double = calculator(price)

fun main()
{
    print("Enter Product Price : ")
    val productPrice = readln().trim().toDoubleOrNull()
    if(productPrice == null || productPrice <= 0)
    {
        println("Invalid Input")
        return
    }

    val finalPrice = calculateFinalPrice(productPrice) {
        price: Double ->

        when
        {
            price >= 10000 -> price - (price * 20) / 100
            price >= 5000 -> price - (price * 10) / 100
            else -> price - (price * 5) / 100
        } 
    }

    val discount = when {
        productPrice >= 10000 -> 20
        productPrice >= 5000 -> 10
        else -> 5
    }

    println("Original Price     : %.2f".format(productPrice))
    println("Discount           : $discount%")
    println("Final Price        : %.2f".format(finalPrice))
}