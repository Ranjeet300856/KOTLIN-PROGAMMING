//Create a Kotlin program to demonstrate Hierarchical Inheritance for a library resource management system.
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
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        return input
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

fun inputBoolean(text: String): Boolean
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
        
        if(input.lowercase() == "yes") return true
        else if(input.lowercase() == "no") return false
        else println("Invalid Input! Try Again")
    }
}

open class LibraryResource(val resourceId: Int, val title: String, val isAvailable: Boolean)
{
    fun displayResourceInfo()
    {
        println("\nResource ID             : $resourceId")
        println("Title                   : $title")
        println("Is Available            : ${if(isAvailable) "YES" else "NO"}")
    }
}

class Book(
    val authorName: String,
    val pageCount: Int,
    resourceId: Int,
    title: String,
    isAvailable: Boolean
) : LibraryResource(resourceId, title, isAvailable)
{
    fun bookInfo()
    {
        displayResourceInfo()
        println("Author Name             : $authorName")
        println("Page Count              : $pageCount")
        val estimatedReadingTime = pageCount / 2.0
        println("Estimated Reading Time  : %.2f Hour".format(estimatedReadingTime))
    }
}

class Magazine(
    val issueNumber: Int,
    val monthlyPrice: Double,
    resourceId: Int,
    title: String,
    isAvailable: Boolean
) : LibraryResource(resourceId, title, isAvailable)
{
    fun magazineInfo()
    {
        displayResourceInfo()
        println("Issue Number            : $issueNumber")
        println("Monthly Price           : %.2f".format(monthlyPrice))
        val yearlyCost = monthlyPrice * 12
        println("Yearly Cost             : %.2f".format(yearlyCost))
    }
}

class DVD(
    val durationMinutes: Int,
    val rating: Double,
    resourceId: Int,
    title: String,
    isAvailable: Boolean
) : LibraryResource(resourceId, title, isAvailable)
{
    fun dVDInfo()
    {
        displayResourceInfo()
        println("Duration Minutes        : $durationMinutes")
        println("Rating                  : %.2f".format(rating))

        if(rating >= 7.0) println("Recommended")
        else println("Not Highly Rated")
    }
}

fun main()
{
    //Book
    val bookResourceId = inputInteger("Book Resource ID")
    val bookTitle = inputString("Book Title")
    val bookIsAvailable = inputBoolean("Yes or No for Book is Available")
    val authorName = inputString("Book Author Name")
    val pageCount = inputInteger("Book Page Count")
    val book = Book(authorName, pageCount, bookResourceId, bookTitle, bookIsAvailable)

    //Magazine
    println()
    val magazineResourceId = inputInteger("Magazine Resource ID")
    val magazineTitle = inputString("Magazine Title")
    val magazineIsAvailable = inputBoolean("Yes or No for Magazine is Available")
    val issueNumber = inputInteger("Issue Number")
    val monthlyPrice = inputDouble("Monthly Price")
    val magazine = Magazine(issueNumber, monthlyPrice, magazineResourceId, magazineTitle, magazineIsAvailable)

    //DVD
    println()
    val dvdResourceId = inputInteger("DVD Resource ID")
    val dvdTitle = inputString("DVD Title")
    val dvdIsAvailable = inputBoolean("Yes or No for DVD is Available")
    val durationMinutes = inputInteger("Duration Minutes")

    var rating: Double = 0.0
    while(true)
    {
        rating = inputDouble("Rating")
        if(rating > 10) println("Rating is more than 10 is not allowed! Try Again")
        else break
    }
    val dvd = DVD(durationMinutes, rating, dvdResourceId, dvdTitle, dvdIsAvailable)

    //Output
    book.bookInfo()
    magazine.magazineInfo()
    dvd.dVDInfo()
}