//Question 9: Shopping Cart Item
class CartItem(
    val productName: String,
    private var price: Double,
    private var quantity: Int = 1
) {
    val totalPrice: Double
        get() = price * quantity
    fun updatePrice(newPrice: Double) {
        if(newPrice <= 0) println("Invalid New Price")
        else {
            price = newPrice
            println("Price Updated Successfully")
        }
    }

    fun updateQunatity(newQuantity: Int) {
        if(newQuantity <= 0) println("Invalid New Quantity")
        else {
            quantity = newQuantity
            println("Quantity Changed Successfully")
        }
    }

    fun displayItem() {
        println("Product Name : $productName")
        println("Quantity     : $quantity")
        println("Total Price  : %.2f\n".format(totalPrice))
    }
}

fun main()
{
    val cartItem = CartItem("Keyboard", 1500.0)
    cartItem.displayItem()

    cartItem.updatePrice(1800.0)
    cartItem.displayItem()

    cartItem.updateQunatity(2)
    cartItem.displayItem()

    cartItem.updatePrice(-500.0)
    cartItem.updateQunatity(0)
    cartItem.displayItem()
}