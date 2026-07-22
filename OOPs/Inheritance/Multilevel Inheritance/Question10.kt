//Create a Kotlin program to manage a hotel booking system using Multilevel Inheritance.
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
    var roomType: String,
    personName: String,
    personAge: Int
) : Person(personName, personAge)
{
    fun displayCustomerDetails()
    {
        displayPersonDetails()
        println("Customer ID         : $customerId")
        println("Room Type           : $roomType")
    }
}

open class HotelBooking(
    private var roomChargePerDay: Double,
    val totalDays: Int,
    var isMember: Boolean,
    customerId: Int,
    roomType: String,
    personName: String,
    personAge: Int
) : Customer(customerId, roomType, personName, personAge)
{
    fun displayBookingDetails()
    {
        displayCustomerDetails()
        println("Room Charge Per Day : %.2f".format(roomChargePerDay))
        println("Total Days          : $totalDays")
        println("Is Member           : ${if(isMember) "YES" else "NO"}")
        println("Total Room Charge   : %.2f".format(calculateRoomCharge()))
        println("Discount            : %.2f%%".format(calculateDiscount()))
        println("GST                 : %.2f%%".format(calculateGST()))
        println("Final Bill          : %.2f".format(calculateFinalBill()))
    }

    private fun calculateRoomCharge(): Double = roomChargePerDay * totalDays
    private fun calculateDiscount(): Double = if(isMember) 12.0 else 5.0
    private fun calculateGST(): Double = 18.0
    private fun calculateFinalBill(): Double
    {
        val totalRoomCharge = calculateRoomCharge()
        val discount = totalRoomCharge * calculateDiscount() / 100
        val amountAfterDiscount = totalRoomCharge - discount
        val gstAmount = amountAfterDiscount * calculateGST() / 100
        return amountAfterDiscount + gstAmount
    }
}

fun inputInteger(text: String): Int
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
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
    val roomType = inputString("Room Type")
    val roomChargePerDay = inputDouble("Room Charge Of Par Day")
    val totalDays = inputInteger("Total Days")
    val isMember = inputBoolean("Is Member")

    val hotalBooking = HotelBooking(roomChargePerDay, totalDays, isMember, customerId, roomType, customerName, customerAge)
    hotalBooking.displayBookingDetails()
}