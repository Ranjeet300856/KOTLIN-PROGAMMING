//Create a Kotlin program to manage a library using Single Inheritance.
open class Book(val bookId: Int, val bookName: String, val bookAuthor: String)
{
    fun displayBookDetails()
    {
        println("Book ID     : $bookId")
        println("Book Name   : $bookName")
        println("Book Author : $bookAuthor")
    }
}

class LibraryRecord(
    val studentName: String,
    private var isBookIssued: Boolean,
    var fineAmount: Double,
    bookId: Int,
    bookName: String,
    bookAuthor: String
) : Book(bookId, bookName, bookAuthor)
{
    fun issueBook()
    {
        if(isBookIssued) println("Book is already issued")
        else 
        {
            isBookIssued = true
            println("Book issued successfully")
        }
    }

    fun returnBook()
    {
        if(isBookIssued)
        {
            isBookIssued = false
            println("Book Returned Successfully")
        }
        else println("No book issued")
    }

    fun updateFine(amount: Double)
    {
        if(isBookIssued)
        {
            fineAmount = amount
            println("Fine updated successfully")
        }
        else println("No book issued")
    }

    fun displayLibraryRecord()
    {
        println("\nStudent Name : $studentName")
        println("Book Issue Status : ${if(isBookIssued) "Book is issued" else "Book not issued"}")
        println("Fine Amount : %.2f".format(fineAmount))
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
    println("\n========== Library Menu ==========\n")

    val bookId = inputInteger("Book ID")
    val bookName = inputString("Book Name")
    val bookAuthor = inputString("Book Author")
    val studentName = inputString("Student Name")
    val isBookIssued = inputBoolean("Book Issued")
    val fineAmount = inputDouble("Fine Amount")

    val library = LibraryRecord(studentName, isBookIssued, fineAmount, bookId, bookName, bookAuthor)
    while(true)
    {
        println("\n1. Display Book Details")
        println("2. Issue Book")
        println("3. Return Book")
        println("4. Update Fine")
        println("5. Display Library Record")
        println("6. Exit")

        val choice = inputInteger("Your Choice (1-6)")
        when(choice)
        {
            1 -> library.displayBookDetails()
            2 -> library.issueBook()
            3 -> library.returnBook()
            4 -> {
                val newFine = inputDouble("New Fine Amount")
                library.updateFine(newFine)
            }
            5 -> library.displayLibraryRecord()
            6 -> {
                println("Program Exited")
                break
            }

            else -> println("Invalid Choice! Please Enter 1..6")
        }
    }
}