//Question 10: Product Price Calculator Using Operator Overloading
class ProductPrice(val price: Double) {
    operator fun plus(otherProductPrice: ProductPrice): ProductPrice {
        return ProductPrice(this.price + otherProductPrice.price)
    }

    operator fun times(quantity: Int): ProductPrice {
        return ProductPrice(price * quantity)
    }
}

fun main()
{
    val price1 = ProductPrice(100.0)
    val price2 = ProductPrice(50.0)

    val totalPrice = price1 + price2
    val priceXQuantity = price1 * 3
    val addAndMulti = (price1 + price2) * 2

    println("Price 1     : %.2f".format(price1.price))
    println("Price 2     : %.2f".format(price2.price))
    println("Total Price : %.2f".format(totalPrice.price))

    println("\nPrice X Quantity : %.2f".format(priceXQuantity.price))
    println("Addition and Multiplication : %.2f".format(addAndMulti.price))
}