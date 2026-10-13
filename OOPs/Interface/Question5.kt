/*
    Create a functional interface named DiscountCalculator with a single abstract function:

    calculateDiscount(price: Double, discountPercentage: Double): Double

    The function must calculate and return the discount amount. 
*/

fun interface DiscountCalculator {
    fun calculateDiscount(price: Double, discountPercentage: Double): Double
}

fun main()
{
    val calculation = DiscountCalculator { price, discountPercentage ->
        price * discountPercentage / 100
    }

    val result1 = calculation.calculateDiscount(1000.0, 10.0)
    val result2 = calculation.calculateDiscount(2500.0, 20.0)
    val result3 = calculation.calculateDiscount(500.0, 0.0)
    val result4 = calculation.calculateDiscount(800.0, 100.0)

    println("Discount Amount : %.2f".format(result1))
    println("Discount Amount : %.2f".format(result2))
    println("Discount Amount : %.2f".format(result3))
    println("Discount Amount : %.2f".format(result4))

    val calculation2 = DiscountCalculator { price, discountPercentage ->
        50.0
    }

    val result5 = calculation2.calculateDiscount(1000.0, 50.0)
    val result6 = calculation2.calculateDiscount(2500.0, 50.0)
    val result7 = calculation2.calculateDiscount(500.0, 50.0)
    val result8 = calculation2.calculateDiscount(800.0, 50.0)

    println("\nDiscount Amount : %.2f".format(result5))
    println("Discount Amount : %.2f".format(result6))
    println("Discount Amount : %.2f".format(result7))
    println("Discount Amount : %.2f".format(result8))
}