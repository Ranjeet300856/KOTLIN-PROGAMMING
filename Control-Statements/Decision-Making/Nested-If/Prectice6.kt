//Q6th
/*
    Write a Kotlin program that calculates final price after applying discount.

    Inputs:
    amount (Int)
    isMember (String: "yes"/"no")
    hasCoupon (String: "yes"/"no")
    Rules (IMPORTANT – Priority Based)
    Step 1: Validation
    If amount ≤ 0 → print "Invalid Amount"
    Step 2: Discount Logic

    If isMember = "yes":
    if amount ≥ 5000:
    If hasCoupon = "yes" → 30% discount
    Else → 20% discount
    Else:
    If hasCoupon = "yes" → 15% discount
    Else → 10% discount

    Else (not a member):
    If amount ≥ 5000:
    If hasCoupon = "yes" → 20% discount
    Else → 10% discount
    Else:
    If hasCoupon = "yes" → 5% discount
    Else → No discount

    Output:
    print final amount after discount: Final Price: X
*/

fun main()
{
    print("Enter Amount : ")
    val amount = readln().trim().toIntOrNull()
    print("Is Memeber ? (yes/no) : ")
    val isMember = readln().trim().lowercase()
    print("Is Coupon ? (yes/no) : ")
    val hasCoupon = readln().trim().lowercase()
    if(amount == null || amount <= 0)
    {
        println("Invalid Amount")
        return
    }
    if(isMember != "yes" && isMember != "no")
    {
        println("Invalid Input")
        return
    }
    if(hasCoupon != "yes" && hasCoupon != "no")
    {
        println("Invalid Input")
        return
    }

    var discount = 0
    if(isMember == "yes") // Is Memeber
    {
        if(amount >= 5000)
        {
            if(hasCoupon == "yes")
            {
                discount = 30
            }
            else
            {
                discount = 20
            }
        }
        else
        {
            if(hasCoupon == "yes")
            {
                discount = 15
            }
            else
            {
                discount = 10
            }
        }
    }
    else // No Member
    {
        if(amount >= 5000)
        {
            if(hasCoupon == "yes")
            {
                discount = 20
            }
            else
            {
                discount = 10
            }
        }
        else
        {
            if(hasCoupon == "yes")
            {
                discount = 5
            }
            else
            {
                discount = 0
            }
        }
    }

    val finalPrice = amount - (amount * discount) / 100
    println("Final Price: $finalPrice")
}