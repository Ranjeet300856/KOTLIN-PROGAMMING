//Q4th
/*
    Write a Kotlin program that takes the number of electricity units consumed (integer) as input and calculates the total bill amount using an else-if ladder.
    Billing Rules:
    Units ≤ 100 → ₹2 per unit
    Units > 100 and ≤ 200 → ₹3 per unit
    Units > 200 and ≤ 300 → ₹5 per unit
    Units > 300 → ₹7 per unit
*/

fun main()
{
    print("Enter Electricity Units : ")
    val unit = readln().trim().toIntOrNull()
    if(unit == null || unit < 0)
    {
        print("Invalid Units! Please Enter a Valid Value")
        return
    }

    var amountPerUnit = 0
    if(unit <= 100) amountPerUnit = 2
    else if(unit <= 200) amountPerUnit = 3
    else if(unit <= 300) amountPerUnit = 5
    else amountPerUnit = 7

    val totalBill = unit * amountPerUnit
    println("Rate per unit: $amountPerUnit INR")
    println("Total Bill: $totalBill INR")
}