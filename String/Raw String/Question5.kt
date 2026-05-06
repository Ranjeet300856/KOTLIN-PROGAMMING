/*
    Write a Kotlin program that prints a formatted bill using Raw String. 
    The output must include the $ symbol correctly along with dynamic values using string templates. 
*/

fun main()
{
    print("Enter Item Name : ")
    val itemName = readln()
    print("Enter Price     : ")
    val price = readln().toDoubleOrNull()
    print("Enter Quantity  : ")
    val qty = readln().toIntOrNull()

    if(itemName.isBlank())
    {
        println("Invalid Item Name")
        return
    }

    if(price == null || qty == null || price < 0 || qty < 0)
    {
        println("Invalid Price or Quantity")
        return
    }

    val totalBill = price * qty

    val bill = """
    Item Name:      $itemName
    Item Price:     ${'$'}${"%.2f".format(price)}
    Item Quantity:  $qty
    Total Bill:     ${'$'}${"%.2f".format(totalBill)}
    """.trimIndent()

    println(bill)
}