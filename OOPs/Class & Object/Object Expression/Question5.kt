/*
    Write a Kotlin program to calculate the final price of a product using an Object Expression.

    The program must accept a product's original price and discount percentage as local variables inside main().

    Create an Object Expression that accesses these variables and provides the following functions:

    calculateDiscount(): Double — calculates and returns the discount amount.
    calculateFinalPrice(): Double — calculates and returns the final price after applying the discount.
    displayDetails() — displays the original price, discount percentage, discount amount, and final price. 
*/

fun main()
{
    val price = 2000.0
    val discountPercentage = 15.0
    val product = object {
        fun calculateDiscount(): Double {
            if(discountPercentage !in 0.0..100.0 || price <= 0.0) {
                println("Discount Percentage Out of Range or Invalid Price")
                return -1.0
            }
            else return price * discountPercentage / 100
        }

        fun calculateFinalPrice(): Double {
            if(price <= 0.0 || discountPercentage !in 0.0..100.0) {
                println("Invalid Original Price or Discount Percentage Out of Range")
                return -1.0
            }
            else return price - calculateDiscount()
        }

        fun displayDetails() {
            println("Product Price Details:")
            println("Original Price      : %.2f".format(price))
            println("Discount Percentage : %.2f%%".format(discountPercentage))
            
            if(calculateDiscount() != -1.0) println("Discount Amount     : %.2f".format(calculateDiscount()))
            if(calculateFinalPrice() != -1.0) println("Final Price         : %.2f\n".format(calculateFinalPrice()))
        }
    }

    product.displayDetails()
}