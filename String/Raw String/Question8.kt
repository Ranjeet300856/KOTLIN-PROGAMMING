//Write a Kotlin program that prints a formatted invoice using Raw String with a custom margin prefix and aligned columns.

fun main()
{
    print("Enter Product Name     : ")
    val productName = readln()
    print("Enter Product Price    : ")
    val productPrice = readln().toDoubleOrNull()
    print("Enter Product Quantity : ")
    val quantity = readln().toIntOrNull()

    println()

    if(productName.isBlank())
    {
        println("Invalid Product Name : ")
        return
    }

    if(productPrice == null || quantity == null || productPrice < 0 || quantity < 0)
    {
        println("Invalid Product Price or Qunatity")
        return
    }

    val total = productPrice * quantity

    val invoice = """
    #========== INVOICE ==========
    #
    #Product Name  : $productName
    #Product Price : ${'$'}${"%.2f".format(productPrice)}
    #Quantity      : $quantity
    #
    #-----------------------------
    #Total Amount  : ${'$'}${"%.2f".format(total)}
    #-----------------------------
    """.trimMargin("#")

    println(invoice)
}