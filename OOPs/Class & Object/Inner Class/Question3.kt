//Question 3 — Inner Class with Business Logic
class ShoppingCart(private var totalAmount: Double) {
    inner class DiscountCalculator {
        fun applyDiscount(discountPercentage: Double) {
            if(discountPercentage !in 0.0..100.0) {
                println("Invalid discount percentage!")
                return
            }

            println("Discount Applied : %.2f%%".format(discountPercentage))
            totalAmount -= totalAmount * discountPercentage / 100
        }

        fun showFinalAmount(text: String) {
            println("$text : %.2f".format(totalAmount))
        }
    }
}

fun main()
{
    val shoppingCart = ShoppingCart(5000.00)
    val discountCalculator = shoppingCart.DiscountCalculator()

    discountCalculator.showFinalAmount("Original Amount")
    discountCalculator.applyDiscount(20.00)
    discountCalculator.showFinalAmount("Final Amount")
}