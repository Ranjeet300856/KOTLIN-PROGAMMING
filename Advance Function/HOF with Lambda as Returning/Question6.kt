/*
    Problem Statement
    Create a Kotlin Higher Order Function named createDiscountCalculator.

    The function should:
    1. Take a String parameter named customerType.
    2. Return a Lambda.
    3. The returned Lambda should take one Double parameter (purchase amount).
    4. The Lambda should return the final amount after applying a discount.

    Discount Rules:
    - "Regular" Customer → 5% Discount
    - "Premium" Customer → 10% Discount
    - "VIP" Customer → 20% Discount
    - Any Other Customer Type → No Discount

    Formula:
    Final Amount = Purchase Amount - Discount

    Requirements:
    - Use HOF with Lambda as Return Type.
    - Do not use any global variables.
    - The Lambda must be returned from the function.
    - Take customer type from the user.
    - Take purchase amount from the user.
    - Purchase amount must be positive.
    - Handle invalid input properly.
    - Print the final amount.
*/

fun createDiscountCalculator(customerType: String): (Double) -> Double
{
    return{
        amount: Double ->
        
        when
        {
            customerType == "regular" -> amount - (amount * 0.05)
            customerType == "premium" -> amount - (amount * 0.10)
            customerType == "vip" -> amount - (amount * 0.20)
            else -> amount
        }
    } 
}

fun main()
{
    print("Enter Customer Type   : ")
    val customerType = readln().trim().lowercase()
    print("Enter Purchase Amount : ")
    val purchaseAmount = readln().trim().toDoubleOrNull()
    if(customerType.isBlank() || purchaseAmount == null || purchaseAmount <= 0)
    {
        println("Invalid Input")
        return
    }

    val calculateFinalAmount = createDiscountCalculator(customerType)
    val finalAmout = calculateFinalAmount(purchaseAmount)
    println("Final Amount : %.2f".format(finalAmout))
}