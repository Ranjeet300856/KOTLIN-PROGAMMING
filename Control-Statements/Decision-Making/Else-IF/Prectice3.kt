//Q3rd
/*
    Write a Kotlin program that takes the total purchase amount (integer) as input and calculates the final payable amount after applying a discount using an else-if ladder.
    Discount Rules:
    Amount ≥ 5000 → 20% discount
    Amount ≥ 2000 and < 5000 → 10% discount
    Amount ≥ 1000 and < 2000 → 5% discount
    Amount < 1000 → No discount
*/

fun main()
{
    print("Enter Purchase Amount : ")
    val amount = readln().trim().toIntOrNull()
    if(amount == null || amount < 0)
    {
        println("Invalid Amount! Please Enter a Valid Amount")
        return
    }

    var discountPercentage = 0
    if(amount >= 5000) discountPercentage = 20
    else if(amount >= 2000) discountPercentage = 10
    else if(amount >= 1000) discountPercentage = 5
    else discountPercentage = 0

    val finalAmount = amount - (amount * discountPercentage) / 100
    println("Discount Applied: $discountPercentage%")
    println("Final Amount: $finalAmount")  
}