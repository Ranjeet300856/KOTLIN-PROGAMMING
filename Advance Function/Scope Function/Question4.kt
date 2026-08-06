//Create a Kotlin program to calculate a product discount using the `run` scope function.
class Product(val productName: String, val productPrice: Double)
fun main()
{
    print("Enter Product Name  : ")
    val productName = readln().trim()
    print("Enter Product Price : ")
    val productPrice = readln().trim().toDoubleOrNull()
    if(productName.isBlank() || productPrice == null || productPrice <= 0)
    {
        println("Invalid Input!")
        return
    }

    val product: Product? = if(productPrice >= 500) Product(productName, productPrice) else null
    val result = product?.run {
        val finalPrice = productPrice - productPrice * 10 / 100
        """
        Product Name              : $productName
        Product Price             : ${"%.2f".format(productPrice)}
        Final Price After Discout : ${"%.2f".format(finalPrice)}
        """.trimIndent()
    }

    if(product == null) println("Product is not eligible for a discount.")
    else println(result)
}