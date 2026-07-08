//Create a Kotlin program to develop a Book Inventory System using only Secondary Constructors.
class Book
{
    var bookId = 0
    var bookTitle = ""
    var bookAuthor = "Unknown"
    var bookPrice = 0.0
    constructor(title: String)
    {
        bookTitle = title
        println("Constructor 1 Executed Successfully")
    }

    constructor(title: String, author: String) : this(title)
    {
        bookAuthor = author
        println("Constructor 2 Executed Successfully")
    }

    constructor(id: Int, title: String, author: String, price: Double) : this(title, author)
    {
        bookId = id
        bookPrice = price
        println("Constructor 3 Executed Successfully")
    }

    fun displayBookDetails(x: Int)
    {
        println("\nBook $x ID     : $bookId")
        println("Book $x Title  : $bookTitle")
        println("Book $x Author : $bookAuthor")
        println("Book $x Price  : %.2f".format(bookPrice))
    }
}

fun main()
{
    val book1 = Book("C++")
    val book2 = Book("Java", "Strustrop")
    val book3 = Book(1001, "Kotlin", "XYZ", 500.00)
    book1.displayBookDetails(1)
    book2.displayBookDetails(2)
    book3.displayBookDetails(3)
}