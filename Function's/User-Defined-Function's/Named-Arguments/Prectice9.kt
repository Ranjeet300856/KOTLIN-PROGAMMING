/*
Question 9: Movie Ticket Booking System using Named Arguments and Default Parameters

This program simulates a movie ticket booking system.
It calculates the total cost of tickets including booking fees
and demonstrates the use of named arguments, default parameters,
input validation, and formatted output.
*/

fun bookingMovieTicket(customerName: String, movieName: String, numberOfTickets: Int, ticketPrice: Double, bookingFee: Double = 30.0)
{
    val ticketCost = numberOfTickets * ticketPrice
    val totalCost = ticketCost + bookingFee

    println("Customer Name  : $customerName")
    println("Movie Name     : $movieName")
    println("Tickets Booked : $numberOfTickets")
    println("Ticket Price   : %.2f".format(ticketPrice))
    println("Booking Fee    : %.2f".format(bookingFee))
    println("Total Cost     : %.2f".format(totalCost))
}

fun main()
{
    print("Enter Customer Name     : ")
    val name = readln().trim()
    print("Enter Movie Name        : ")
    val movie = readln().trim()
    print("Enter Number of Tickets : ")
    val tickets = readln().trim().toIntOrNull()
    print("Enter Ticket Price      : ")
    val price = readln().trim().toDoubleOrNull()

    if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace() })
    {
        println("Invalid Customer Name!")
        return
    }

    if(movie.isBlank())
    {
        println("Invalid Movie Name!")
        return
    }

    if(tickets == null || price == null || tickets <= 0 || price <= 0)
    {
        println("Invalid Price or Number of Tickets!")
        return
    }

    println()
    bookingMovieTicket(customerName = name, movieName = movie, numberOfTickets = tickets, ticketPrice = price)
}