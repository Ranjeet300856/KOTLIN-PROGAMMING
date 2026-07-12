//Create a Kotlin program to manage a small book collection using appropriate Visibility Modifiers.
class Book(val title: String, val author: String, private var price: Double)
{
    fun displayBookDetails()
    {
        println("\nBook Title  : $title")
        println("Book Author : $author")
        println("Book Price  : %.2f".format(price))
    }

    fun updatePrice(newPrice: Double)
    {
        if(newPrice > 0)
        {
            price = newPrice
            println("Price updated successfully")
        }
        else println("Invalid book price.")
    }
}

fun display(books: MutableList<Book>)
{
    for(obj in books)
    obj.displayBookDetails()
}

fun main()
{
    val books = mutableListOf<Book>()
    for(i in 1..3)
    {
        print("\nEnter Book Title $i : ")
        val title = readln().trim()
        print("Enter Book Author   : ")
        val author = readln().trim()
        print("Enter Book Price    : ")
        val price = readln().trim().toDoubleOrNull()
        if(title.isBlank() || author.isBlank() || price == null)
        {
            println("Invalid Input!")
            return
        }

        val bookObject = Book(title, author, price)
        books.add(bookObject)
    }

    display(books)

    print("\nEnter Book Number (1/2/3) : ")
    val bookNumber = readln().trim().toIntOrNull()
    print("Enter New Price           : ")
    val newPrice = readln().trim().toDoubleOrNull()
    if(bookNumber == null || newPrice == null)
    {
        println("Invalid Input!")
        return
    }

    when(bookNumber)
    {
        1 -> books[0].updatePrice(newPrice)
        2 -> books[1].updatePrice(newPrice)
        3 -> books[2].updatePrice(newPrice)
        else -> println("Invalid Book Number")
    }

    display(books)
}