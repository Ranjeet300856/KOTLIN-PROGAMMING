//Create a Kotlin program to manage an online shopping order system using Multilevel Inheritance.
open class Person(val personName: String, var personAge: Int)
{
    fun displayPersonDetails()
    {
        println("\nName                : $personName")
        println("Age                 : $personAge")
    }        
}

open class Customer(
    protected val customerId: Int,
    var city: String,
    personName: String,
    personAge: Int
) : Person(personName, personAge)
{
    fun displayCustomerDetails()
    {
        displayPersonDetails()
        println("Customer ID         : $customerId")
        println("City                : $city")
    }
}

class Order(
    private var orderAmount: Double,
    var isPremiumCustomer: Boolean,
    customerId: Int,
    city: String,
    personName: String,
    personAge: Int
) : Customer(customerId, city, personName, personAge)
{
    fun displayOrderDetails()
    {
        displayCustomerDetails()
        println("Order Amount        : %.2f".format(orderAmount))
        println("Is Premium Customer : ${if(isPremiumCustomer) "YES" else "NO"}")

        val discount = calculateDiscount()
        println("Discount            : %.2f".format(discount))
        println("Final Amount        : %.2f".format(orderAmount - discount))
    }
    private fun calculateDiscount(): Double = if(isPremiumCustomer) orderAmount * 15 / 100 else orderAmount * 5 / 100
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
    val personName = inputString("Customer Name")
    val personAge = inputInteger("Customer Age")
    val customerId = inputInteger("Customer ID")
    val city = inputString("Customer City")
    val orderAmount = inputDouble("Order Amount")
    val isPremiumCustomer = inputBoolean("Is Premium Customer")

    val order = Order(orderAmount, isPremiumCustomer, customerId, city, personName, personAge)
    order.displayOrderDetails()
}