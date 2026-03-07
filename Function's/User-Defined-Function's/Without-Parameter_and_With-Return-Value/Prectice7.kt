fun getFinalPrice(): Int
{
    val price = 1200
    val discountPercent = 10
    val discountAmount = price * discountPercent / 100
    val finalPrice = price - discountAmount
    return finalPrice
}
fun main()
{
    //Q7th
    /*
    Write a Kotlin program that defines a function getFinalPrice() which takes no parameters but returns the final price of a product after applying a discount.
    Inside the function define:
    price = 1200
    discountPercent = 10
    First calculate the discount amount, then calculate the final price.

    Formula:
    discountAmount = price * discountPercent / 100
    finalPrice = price - discountAmount

    Return the final price.
    The program should call this function from main() and print the returned value.
    */

    val finalPrice = getFinalPrice()
    println("Final Price = $finalPrice")
}