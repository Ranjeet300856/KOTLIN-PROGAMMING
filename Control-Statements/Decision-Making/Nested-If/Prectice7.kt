//Q7th
/*
    Write a Kotlin program that simulates an online food ordering system.
    Inputs:
    amount (Int)
    isPremiumUser (String: "yes"/"no")
    distance (Int in km)

    Rules
    Step 1: Validation
    If amount ≤ 0 OR distance < 0 → print "Invalid Input"

    Step 2: Delivery Charge Logic
    If distance ≤ 5 km:
    Delivery Charge = 0
    Else:
    If distance ≤ 10:
    Charge = 50
    Else:
    Charge = 100

    Step 3: Discount Logic (IMPORTANT 🔥)
    If isPremiumUser = "yes":
    If amount ≥ 1000:
    If distance ≤ 5 → 20% discount
    Else → 10% discount
    Else:
    If distance ≤ 5 → 10% discount
    Else → 5% discount

    Else (normal user):
    If amount ≥ 1000:
    If distance ≤ 5 → 10% discount
    Else → 5% discount
    Else:
    No discount

    Output:
    Print final payable amount: Final Amount: X
*/

fun main()
{
    print("Enter Amount : ")
    val amount = readln().trim().toIntOrNull()
    print("isPremiumUser ? (yes/no) : ")
    val isPremiumUser = readln().trim().lowercase()
    print("Enter Distance in KM : ")
    val distance = readln().trim().toIntOrNull()
    if(amount == null || distance == null || amount <= 0 || distance < 0)
    {
        println("Invalid Input")
        return
    }

    if(isPremiumUser != "yes" && isPremiumUser != "no")
    {
        println("Invalid Input")
        return
    }

    var deliveryCharge = 0
    if(distance <= 5)
    {
        deliveryCharge = 0
    }
    else
    {
        if(distance <= 10)
        {
            deliveryCharge = 50
        }
        else
        {
            deliveryCharge = 100
        }
    }

    var discountPercentage = 0
    if(isPremiumUser == "yes")
    {
        if(amount >= 1000)
        {
            if(distance <= 5)
            {
                discountPercentage = 20
            }
            else
            {
                discountPercentage = 10
            }
        }
        else
        {
            if(distance <= 5)
            {
                discountPercentage = 10
            }
            else
            {
                discountPercentage = 5
            }
        }
    }
    else
    {
        if(amount >= 1000)
        {
            if(distance <= 5)
            {
                discountPercentage = 10
            }
            else
            {
                discountPercentage = 5
            }
        }
        else
        {
            discountPercentage = 0
        }
    }

    val finalPrice = amount - (amount * discountPercentage) / 100 + deliveryCharge
    println("Final Amount: $finalPrice")
}