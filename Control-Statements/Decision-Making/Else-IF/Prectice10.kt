//Q10th
/*
    Write a Kotlin program that simulates an online shopping payment system using an else-if ladder.
    Inputs:
    Total Amount (integer)
    Payment Method (String: "card", "upi", "cash")

    Rules:
    If amount ≤ 0 →
    "Invalid Amount"
    Else if payment method is invalid →
    "Invalid Payment Method"

    Discount Rules:
    If payment method = "card" and amount ≥ 5000 →
    15% discount
    Else if payment method = "upi" and amount ≥ 3000 →
    10% discount
    Else if payment method = "cash" →
    No discount
*/

fun main()
{
    print("Enter Total Amount : ")
    val amount = readln().trim().toIntOrNull()
    print("Enter Payment Method (Card, UPI or Cash) : ")
    val paymentMethod = readln().trim().lowercase()
    if(amount == null || amount <= 0)
    {
        println("Invalid Amount")
        return
    }
    else if(paymentMethod != "upi" && paymentMethod != "card" && paymentMethod != "cash")
    {
        println("Invalid Payment Method")
        return
    }

    var discountPercentage = 0
    if(paymentMethod == "card" && amount >= 5000) discountPercentage = 15
    else if(paymentMethod == "upi" && amount >= 3000) discountPercentage = 10
    else if(paymentMethod == "cash") discountPercentage = 0

    val finalAmount = amount - amount * discountPercentage / 100
    println("Payment Method: $paymentMethod")
    println("Discount Applied: $discountPercentage%")
    println("Final Amount: $finalAmount")
}