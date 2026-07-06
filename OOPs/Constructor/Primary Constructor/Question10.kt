//Create a Kotlin program to develop an Online Shopping Order System using a Primary Constructor.
class Order(val orderId: Int, val customerName: String, val productName: String, var productPrice: Double, var productQuantity: Int)
{
    init {
        if(productPrice < 0)
        {
            println("Invalid Product Price!")
            productPrice = 0.0
        }

        if(productQuantity <= 0)
        {
            println("Invalid Product Quantity!")
            productQuantity = 0
        }
    }

    var totalAmount = 0.0
    var finalAmount = 0.0
    var discountPercentage = 0
    var discountedAmount = 0.0
    fun calculateTotalAmount()
    {
        totalAmount = productPrice * productQuantity
    }

    fun applyDiscount()
    {
        if(totalAmount >= 10000)
        {
            discountPercentage = 15
            discountedAmount = totalAmount - (totalAmount * discountPercentage / 100)
            println("\nDiscount Applied - $discountPercentage%")
        }
        else
        {
            println("\nNo discount should be applied.")
            discountedAmount = totalAmount
        }
    }

    fun applyGST()
    {
        finalAmount = discountedAmount + (discountedAmount * 18 / 100)
    }

    fun displayOrderDetails()
    {
        println("\nOrder ID         : $orderId")
        println("Customer Name    : $customerName")
        println("Product Name     : $productName")
        println("Product Price    : %.2f".format(productPrice))
        println("Product Quantity : $productQuantity")
        println("Total Amount     : %.2f".format(totalAmount))
        println("Final Amount     : %.2f".format(finalAmount))
    }
}

fun main()
{
    print("Enter Product Name     : ")
    val productName = readln().trim()
    print("Enter Order ID         : ")
    val orderId = readln().trim().toIntOrNull()
    print("Enter Customer Name    : ")
    val customerName = readln().trim()
    print("Enter Product Price    : ")
    val productPrice = readln().trim().toDoubleOrNull()
    print("Enter Product Quantity : ")
    val productQuantity = readln().trim().toIntOrNull()

    if(productName.isBlank() || customerName.isBlank() || orderId == null || orderId <= 0 || productPrice == null || productQuantity == null)
    {
        println("Invalid Input")
        return
    }

    val order = Order(orderId, customerName, productName, productPrice, productQuantity)
    order.calculateTotalAmount()
    order.applyDiscount()
    order.applyGST()
    order.displayOrderDetails()
}