//Question 10 - E-Commerce Discount System 
abstract class Product(
    val productName: String,
    val price: Double
) {
    abstract fun calculateDiscount(): Double
    open fun calculateFinalPrice(): Double {
        return price - calculateDiscount()
    }
}

class Electronics(productName: String, price: Double) : Product(productName, price) {
    override fun calculateDiscount(): Double {
        if(price <= 0) return -1.0
        else return price * 10 / 100
    }
}

class ClothingProduct(productName: String, price: Double) : Product(productName, price) {
    override fun calculateDiscount(): Double {
        if(price <= 0) return -1.0
        else return price * 20 / 100
    }
}

class GroceryProduct(productName: String, price: Double) : Product(productName, price) {
    override fun calculateDiscount(): Double {
        if(price <= 0) return -1.0
        else return price * 5 / 100
    }
}

fun displayProductDetails(product: Product) {
    val productName = product.productName
    val price = product.price
    val discountPrice = product.calculateDiscount()
    val finalPrice = product.calculateFinalPrice()

    println("Product Name   : $productName")
    println("Prodcut Price  : %.2f".format(price))

    if(discountPrice == -1.0) {
        println("Invalid Price!")
    } else {
        println("Discount Price : %.2f".format(discountPrice))
        println("Final Price    : %.2f\n".format(finalPrice))
    }
}

fun main()
{
    val electronic = Electronics("Laptop", 10000.0)
    val clothing = ClothingProduct("Shirt", 2000.0)
    val grocery = GroceryProduct("Rice", 500.0)

    val products = listOf(electronic, clothing, grocery)
    for(product in products) {
        displayProductDetails(product)
    }
}