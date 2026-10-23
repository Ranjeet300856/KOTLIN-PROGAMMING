//Question 4: Product Stock Management
class Product(val productName: String) {
    var stock: Int = 10
        private set

    fun addStock(quantity: Int) {
        if(quantity <= 0) println("Invalid Stock Quantity: $quantity")
        else {
            stock += quantity
            println("Quantity Add Successfully: Items - $quantity")
        }
    }

    fun removeStock(quantity: Int) {
        if(quantity <= 0) println("Invalid Remove Quantity: $quantity")
        else if (quantity > stock) println("Insufficient stock.") 
        else {
            if(stock - quantity < 0) stock = 0
            else stock -= quantity
            println("Quantity Removed Successfully")
        }
    }
}

fun displayQuantityInfo(product: Product) {
    println("Current Stock : ${product.stock}\n")
}

fun main()
{
    val product = Product("NoteBook")
    println("Product Name : ${product.productName}")
    displayQuantityInfo(product)

    product.addStock(5)
    displayQuantityInfo(product)

    product.removeStock(3)
    displayQuantityInfo(product)

    product.addStock(-3)
    displayQuantityInfo(product)

    product.removeStock(20)
    displayQuantityInfo(product)
}