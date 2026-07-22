//Create a Kotlin program to manage a mobile store billing system using Multilevel Inheritance.
open class Person(val personName: String, var personAge: Int)
{
    fun displayPersonDetails()
    {
        println("\nName         : $personName")
        println("Age          : $personAge")
    }        
}

open class Customer(
    protected val customerId: Int,
    var mobileBrand: String,
    personName: String,
    personAge: Int
) : Person(personName, personAge)
{
    fun displayCustomerDetails()
    {
        displayPersonDetails()
        println("Customer ID  : $customerId")
        println("Mobile Brand : $mobileBrand")
    }
}

class MobilePurchase(
    private var mobilePrice: Double,
    var isStudent: Boolean,
    customerId: Int,
    mobileBrand: String,
    personName: String,
    personAge: Int
) : Customer(customerId, mobileBrand, personName, personAge)
{
    fun displayBillDetails()
    {
        displayCustomerDetails()
        println("Mobile Price : %.2f".format(mobilePrice))
        println("Is Student   : ${if(isStudent) "YES" else "NO"}")

        val discount = calculateDiscount()
        val gst = calculateGST()
        val finalAmount = calculateFinalAmount()

        println("Discount     : %.2f%%".format(discount))
        println("GST          : %.2f%%".format(gst))
        println("Final Amount : $%.2f".format(finalAmount))
    }

    private fun calculateDiscount(): Double = if(isStudent) 10.0 else 5.0
    private fun calculateGST(): Double = 18.0
    private fun calculateFinalAmount(): Double
    {
        val discountAmount = mobilePrice * calculateDiscount() / 100
        val gstAmount = mobilePrice * calculateGST() / 100
        return mobilePrice - discountAmount + gstAmount
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input < 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input < 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputBoolean(text: String): Boolean
{
    while(true)
    {
        val input = inputString("Yes or No for $text")
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else 
        {
            println("Invalid Input! Try Again")
        }
    }
}

fun main()
{
    val customerName = inputString("Customer Name")
    val customerAge = inputInteger("Customer Age")
    val customerId = inputInteger("Customer ID")
    val mobileBrand = inputString("Mobile Brand")
    val mobilePrice = inputDouble("Mobile Price")
    val isStudent = inputBoolean("Is Student")

    val mobilePurchase = MobilePurchase(mobilePrice, isStudent, customerId, mobileBrand, customerName, customerAge)
    mobilePurchase.displayBillDetails()
}