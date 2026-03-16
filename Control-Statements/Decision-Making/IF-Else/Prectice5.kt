//Q5th
/*
    Write a Kotlin program that takes the cost price (CP) and selling price (SP) of a product as input.
    If the selling price is greater than the cost price, print:
    Profit has been made
    Otherwise print:
    Loss has been incurred
*/

fun main()
{
    print("Enter Cost Price    : ")
    val cp = readln().trim().toDoubleOrNull()
    print("Enter Selling Price : ")
    val sp = readln().trim().toDoubleOrNull()
    if(cp == null || sp == null || cp < 0 || sp < 0)
    {
        println("Invalid Input! Please Enter a Valid Input")
        return
    }

    if(sp > cp) println("Profit has been made")
    else println("Loss has been incurred") 
}