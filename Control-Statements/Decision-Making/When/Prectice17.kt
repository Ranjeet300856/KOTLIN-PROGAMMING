fun main()
{
    //Q17th
    /*
    Write a Kotlin program that takes purchase amount as input
    and calculates the discount category using when without argument.

    Rules:
    If amount is less than 0, print "Invalid Amount".
    If amount is 10000 or more, print "20% Discount".
    If amount is 5000 or more, print "10% Discount".
    If amount is 1000 or more, print "5% Discount".
    Otherwise, print "No Discount".

    If the input is not a valid number,
    print "Invalid Input".
     */

     print("Enter Amount : ")
     var amount = readln().toDoubleOrNull()
     if(amount == null)
     {
        println("Input is Empty or Invalid Input!")
        return
     }

     when
     {
        amount < 0 -> println("Invalid Amount!")
        amount >= 10000 -> println("20% Discount")
        amount >= 5000 -> println("10% Discount")
        amount >= 1000 -> println("5% Discount")
        else -> println("No Discount!")
     }
}