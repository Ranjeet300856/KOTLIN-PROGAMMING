//Q10th
/*
Write a Kotlin program that simulates an e-commerce order checkout system.
*/

fun main()
{
    print("Enter Amount : ")
    val amount = readln().trim().toIntOrNull()
    print("isPrimeruser ? (yes/no) : ")
    val isPremiumUser = readln().trim().lowercase()
    print("Enter Payment Method (Card, UPI, Cod) : ")
    val paymentMethod = readln().trim().lowercase()

    //Validation
    if(amount == null || amount <= 0)
    {
        println("Invalid Amount")
        return
    }
    if(isPremiumUser.isBlank() || paymentMethod.isBlank())
    {
        println("Invalid Input")
        return
    }
    if(paymentMethod != "upi" && paymentMethod != "card" && paymentMethod != "cod")
    {
        println("Invalid Payment Method")
        return
    }
    if(isPremiumUser != "yes" && isPremiumUser != "no")
    {
        println("Invalid Input")
        return
    }

    //Discount Logic
    var discountPercentage: Int
    if(isPremiumUser == "yes")
    {
        if(amount >= 5000)
        {
            if(paymentMethod == "card")
            {
                discountPercentage = 25
            }
            else
            {
                discountPercentage = 20
            }
        }
        else
        {
            if(paymentMethod == "upi")
            {
                discountPercentage = 15
            }
            else
            {
                discountPercentage = 10
            }
        }
    }
    else
    {
        if(amount >= 5000)
        {
            if(paymentMethod == "card")
            {
                discountPercentage = 15
            }
            else
            {
                discountPercentage = 10
            }
        }
        else
        {
            if(paymentMethod == "upi")
            {
                discountPercentage = 5
            }
            else
            {
                discountPercentage = 0
            }
        }
    }

    var finalAmount = amount - (amount * discountPercentage) / 100
    if(paymentMethod == "cod")
    {
        finalAmount += 50
    }

    println("Final Amount : $finalAmount")
}