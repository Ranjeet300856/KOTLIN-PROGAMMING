//Create a Kotlin program to manage hotel room booking information using Single Inheritance.
open class Room(val roomNumber: Int, val roomType: String, protected var ratePerNight: Double)
{
    fun displayRoomDetails()
    {
        println("Room Number    : $roomNumber")
        println("Room Type      : $roomType")
        println("Rate Per Night : %.2f".format(ratePerNight))
    }
}

class Booking(
    val customerName: String,
    val totalNight: Int,
    private var isRoomBooked: Boolean,
    roomNumber: Int,
    roomType: String,
    ratePerNight: Double
) : Room(roomNumber, roomType, ratePerNight)
{
    fun roomBook()
    {
        if(isRoomBooked) return
        else
        {
            isRoomBooked = true
            println("Room Booked Successfully")
        }
    }

    fun roomCancle()
    {
        if(isRoomBooked)
        {
            isRoomBooked = false
            println("Room Cancled Successfully")
        }
        else println("Room is not booked")
    }

    fun calculateTotalAmount(): Double = ratePerNight * totalNight
    fun displayBookingDetails()
    {
        println("Customer Name : $customerName")
        println("Total Night   : $totalNight")
        println("Room Status   : ${if(isRoomBooked) "Room is Booked" else "Room Is Not Booked"}")
        println("Total Amount  : %.2f".format(calculateTotalAmount()))
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

fun inputPrice(): Double
{
    while(true)
    {
        print("Enter Rate Per Night : ")
        val input = readln().trim().toDoubleOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun inputRoomBook(): Boolean
{
    while(true)
    {
        val input = inputString("Yes or No for room booked : ")
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
    val roomNumber = inputInteger("Room Number")
    val totalNight = inputInteger("Total Number Of Nights")
    val roomType = inputString("Room Type")
    val customerName = inputString("Customer Name")
    val ratePerNight = inputPrice()
    val roomBooked = inputRoomBook()

    val room = Booking(customerName, totalNight, roomBooked, roomNumber, roomType, ratePerNight)
    room.roomBook()
    room.displayRoomDetails()
    room.displayBookingDetails()
}