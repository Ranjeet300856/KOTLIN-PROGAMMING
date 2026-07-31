//Create a Kotlin program to manage the maximum ticket booking limit using a Companion Object.
class MovieTicket(val customerName: String, var numberOfTickets: Int)
{
    companion object {
        private var maximumBookingLimit = 5
        fun updateBookingLimit(newLimit: Int)
        {
            if(newLimit >= 1 && newLimit <= 10) maximumBookingLimit = newLimit
            else println("Invalid Booking Limit!")
        }
        fun displayBookingLimit() = println("Current Booking Limit : $maximumBookingLimit")
    }

    fun displayBookingStatus()
    {
        println("\nCustomer Name     : $customerName")
        println("Number of tickets : $numberOfTickets")
        println("Booking Status    : ${if(numberOfTickets <= maximumBookingLimit) "Booking Accepted" else "Booking Rejected"}")
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
        print("\nEnter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
    }
}

fun display(customers: MutableList<MovieTicket>)
{
    for(customer in customers)
    customer.displayBookingStatus()
}

fun main()
{
    val totalCustomer = inputInteger("how many customers you want to enter")
    val customers = mutableListOf<MovieTicket>()
    for(i in 1..totalCustomer)
    {
        val customerName = inputString("Customer Name $i")
        val totalTickets = inputInteger("Number Of Tickets")
        val customer = MovieTicket(customerName, totalTickets)
        customers.add(customer)
    }
    MovieTicket.displayBookingLimit()
    display(customers)

    val newLimit = inputInteger("New Booking Limit")
    MovieTicket.updateBookingLimit(newLimit)
    MovieTicket.displayBookingLimit()

    println("\nBooking Status After Update New Limit:")
    display(customers)
}