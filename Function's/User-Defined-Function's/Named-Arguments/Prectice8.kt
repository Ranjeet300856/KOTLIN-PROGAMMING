/*
Question 8: Online Food Order System using Named Arguments and Default Parameters

This program simulates a simple online food ordering system.
It calculates the total bill including delivery charges and
demonstrates the use of named arguments, default parameters,
input validation, and formatted output.
*/

fun placeOrder(customerName: String, foodItem: String, quantity: Int, pricePerItem: Double, deliveryCharge: Double = 40.0)
{
    val itemCost = quantity * pricePerItem
    val totalBill = itemCost + deliveryCharge

    println("Customer Name   : $customerName")
    println("Food Item       : $foodItem")
    println("Quantity        : $quantity")
    println("Price Per Item  : %.2f".format(pricePerItem))
    println("Delivery Charge : %.2f".format(deliveryCharge))
    println("Total Bill      : %.2f".format(totalBill))
}

fun main()
{
    print("Enter Customer Name  : ")
    val name = readln().trim()
    print("Enter Food Item      : ")
    val item = readln().trim()
    print("Enter Quantity       : ")
    val qty = readln().trim().toIntOrNull()
    print("Enter Price Per Item : ")
    val price = readln().trim().toDoubleOrNull()

    if(name.isBlank() || item.isBlank() || !name.all { it.isLetter() || it.isWhitespace() })
    {
        println("Invalid Name or Food Item!")
        return
    }

    if(qty == null || price == null || qty <= 0 || price <= 0)
    {
        println("Invalid Quantity or Price!")
        return
    }

    println()
    placeOrder(customerName = name, foodItem = item, quantity = qty, pricePerItem = price)
}