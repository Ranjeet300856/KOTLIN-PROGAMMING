//Create a Kotlin program using Abstraction to calculate discounts for different types of products.
abstract class Product(val name: String, val price: Double) {
    abstract fun calculateDiscount(): Double
    fun calculateFinalPrice(): Double {
        if(name.isBlank() || price <= 0 || !price.isFinite()) return -1.0
        else return price - calculateDiscount()
    }
}

class Electronics(name: String, price: Double) : Product(name, price) {
    override fun calculateDiscount(): Double {
        if(name.isBlank() || price <= 0 || !price.isFinite()) return -1.0
        else return price * 10 / 100
    }
}

class Clothing(name: String, price: Double) : Product(name, price) {
    override fun calculateDiscount(): Double {
        if(name.isBlank() || price <= 0 || !price.isFinite()) return -1.0
        else return price * 20 / 100
    }
}

fun main()
{
    val electronics = Electronics("Laptop", 60000.0)
    val clothing = Clothing("Shirt", 500.0)

    val finalPriceOfLaptop = electronics.calculateFinalPrice()
    val finalPriceOfShirt = clothing.calculateFinalPrice()

    if(finalPriceOfLaptop != -1.0 && electronics.calculateDiscount() != -1.0) {
        println("Product     : ${electronics.name}")
        println("Discount    : %.2f".format(electronics.calculateDiscount()))
        println("Final Price : %.2f\n".format(finalPriceOfLaptop))
    } else {
        println("Invalid Discount or Final Price!")
    }

    if(finalPriceOfShirt != -1.0 && clothing.calculateDiscount() != -1.0) {
        println("Product     : ${clothing.name}")
        println("Discount    : %.2f".format(clothing.calculateDiscount()))
        println("Final Price : %.2f".format(finalPriceOfShirt))
    } else {
        println("Invalid Discount or Final Price!")
    }
}