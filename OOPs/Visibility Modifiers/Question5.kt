//Create a Kotlin program to manage a movie ticket price using appropriate Visibility Modifiers.
class MovieTicket(val movieName: String, private var ticketPrice: Double)
{
    fun displayTicketDetails()
    {
        println("Movie Name   : $movieName")
        println("Ticket Price : %.2f".format(ticketPrice))
    }

    fun updateTicketPrice(newPrice: Double)
    {
        if(newPrice > 0)
        {
            ticketPrice = newPrice
            println("Ticket Price Updated Successfully")
        }
        else println("Invalid ticket price.")
    }
}

fun main()
{
    print("Enter Movie Name   : ")
    val movieName = readln().trim()
    print("Enter Ticket Price : ")
    val ticketPrice = readln().trim().toDoubleOrNull()
    if(movieName.isBlank() || ticketPrice == null)
    {
        println("Invalid Input!")
        return
    }

    val movie = MovieTicket(movieName, ticketPrice)
    movie.displayTicketDetails()

    print("Enter new movie price : ")
    val newPrice = readln().trim().toDoubleOrNull()
    if(newPrice == null)
    {
        println("Invalid Input")
        return
    }

    movie.updateTicketPrice(newPrice)
    movie.displayTicketDetails()
}