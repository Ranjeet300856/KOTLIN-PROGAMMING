fun main()
{
    //Q24th
    /*
    Write a Kotlin program that takes purchase amount as input
    and assigns discount percentage using when as expression.

    Rules:
    If amount is 10000 or more, assign 20.
    If amount is 5000 or more, assign 10.
    If amount is 1000 or more, assign 5.
    Otherwise, assign 0.

    Store the discount percentage in a variable.
    Then calculate the discount amount and print:
    Discount Percentage
    Discount Amount

    If the input is not a valid number,
    print "Invalid Input".
     */

     print("Enter Purches Amount : ")
     var amount = readln().toDoubleOrNull()
     if(amount == null)
     {
        println("Input is Empty or Invalid Input!")
        return
     }

     if(amount < 0)
     {
        println("Invalid Amoutn!")
        return
     }
     
     var discountPer = when
     {
        amount >= 10000 -> 20
        amount >= 5000 -> 10
        amount >= 1000 -> 5
        else -> 0
     }

     var discountAmt = (amount * discountPer)/100
     println("Discount Percentage : ${discountPer}%")
     println("Discount Amount : $discountAmt") 
}