/*
    Problem Statement:
    Create a Kotlin program to develop a Library Book Availability System using a Primary Constructor.

    Requirements:
    1. Create a class named Book.
    2. Use a Primary Constructor to initialize the following properties:
       - Book ID (Int)
       - Book Title (String)
       - Author Name (String)
       - Total Copies (Int)
       - Available Copies (Int)

    3. Inside the init Block, validate the following:
       - Total Copies must not be negative.
       - Available Copies must not be negative.
       - Available Copies must not be greater than Total Copies.
       If any validation fails:
       - Display an appropriate message.
       - Store 0 in the invalid property.

    4. Create a member function named displayBookDetails() that displays:
       - Book ID
       - Book Title
       - Author Name
       - Total Copies
       - Available Copies

    5. Create another member function named checkBookAvailability().
       Rules:
       - If Available Copies is greater than 0,
         display "Book Available".
       - Otherwise,
         display "Book Not Available".

    6. In the main() function:
       - Take all input from the user.
       - Create only ONE Book object.
       - Call both member functions.
*/

class Book(val bookId: Int, val bookTitle: String, val bookAuthor: String, var totalCopies: Int, var availableCopies: Int)
{
    init {
        if(totalCopies < 0)
        {
            println("Invalid Input for Total Copies")
            totalCopies = 0
        }

        if(availableCopies < 0)
        {
            println("Invalid Input for Available Copies")
            availableCopies = 0
        }

        if(availableCopies > totalCopies)
        {
            println("Available Copies More than Total Copies!")
            availableCopies = 0
        }
    }

    fun displayBookDetails()
    {
        println("\nBook ID          : $bookId")
        println("Book Title       : $bookTitle")
        println("Book Author      : $bookAuthor")
        println("Total Copies     : $totalCopies")
        println("Available Copies : $availableCopies")
    }

    fun checkBookAvailability()
    {
        if(availableCopies > 0) println("Book Available")
        else println("Book Not Available")
    }
}

fun main()
{
    print("Enter Book ID : ")
    val id = readln().trim().toIntOrNull()
    print("Enter Book Title : ")
    val title = readln().trim()
    print("Enter Author Name : ")
    val author = readln().trim()
    print("Enter Total Copies : ")
    val totalCopies = readln().trim().toIntOrNull()
    print("Enter Available Copies : ")
    val availableCopies = readln().trim().toIntOrNull()

    if(id == null || id < 0 || totalCopies == null || availableCopies == null || title.isBlank() || author.isBlank())
    {
        println("Invalid Input")
        return
    }

    val book = Book(id, title, author, totalCopies, availableCopies)
    book.displayBookDetails()
    book.checkBookAvailability()
}