/*
    Write a Kotlin program that generates a formatted receipt using Raw String. 
    The receipt should conditionally include a discount section only if the discount is applicable. 
*/

fun main()
{
    //Input
    print("Enter Item Name     : ")
    val itemName = readln()
    
    print("Enter Price         : ")
    val price = readln().toDoubleOrNull()

    print("Enter Quantity      : ")
    val quantity = readln().toIntOrNull()

    print("Enter Discount Pct. : ")
    val discount = readln().toDoubleOrNull()

    println()

    //Validation
    if(itemName.isBlank())
    {
        println("Invalid Item Name")
        return
    }

    if(price == null || quantity == null || price < 0 || quantity < 0)
    {
        println("Invalid Price or Quantity")
        return
    }

    if(discount == null || discount < 0 || discount > 100)
    {
        println("Invalid discount percentage.")
        return
    }

    //Calculation
    val total = price * quantity
    val discountAmount = total * discount / 100
    val finalAmount = total - discountAmount

    val discountSection = if(discount > 0)
    {
        """
        Discount Per:    $discount%
        Discount Amount: ${'$'}${"%.2f".format(discountAmount)}
        """.trimIndent()
    }
    else ""

    //Output
    val receipt = """
    Item Name:       $itemName
    Item Price:      ${'$'}${"%.2f".format(price)}
    Quantity:        $quantity
    Total:           ${'$'}${"%.2f".format(total)}
    $discountSection
    Final Amount:    ${'$'}${"%.2f".format(finalAmount)}
    """.trimIndent()

    println(receipt)
}