//Create a Kotlin program to develop a Book Search System using a Primary Constructor, a Single Secondary Constructor, and MutableList.
class Book(val bookId: Int, val bookName: String, var bookPrice: Double)
{
    init {
        if(bookPrice < 0)
        {
            println("Invalid Book Price!")
            bookPrice = 0.0
        }

        println("Primary constructor executed")
    }

    constructor(bookName: String, bookPrice: Double) : this(0, bookName, bookPrice)
    {
        println("Secondary constructor executed")
    }

    fun displayBookDetails()
    {
        println("Book Name  : $bookName")
        println("Book ID    : $bookId")
        println("Book Price : %.2f".format(bookPrice))
    }
}

fun inputName(): String
{
    while(true)
    {
        print("Enter Book Name : ")
        val name = readln().trim()
        if(name.isBlank())
        {
            println("Invalid Name! Try Again")
            continue
        }

        return name
    }
}

fun inputId(): Int
{
    while(true)
    {
        print("Enter Book ID : ")
        val id = readln().trim().toIntOrNull()
        if(id == null || id <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return id    
    }
}

fun inputPrice(): Double
{
    while(true)
    {
        print("Enter Price : ")
        val price = readln().trim().toDoubleOrNull()
        if(price == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return price
    }
}

fun main()
{
    print("Enter how many book objects you want to create (1, 2, or 3) : ")
    val input = readln().trim().toIntOrNull()
    if(input == null || input !in 1..3)
    {
        println("Invalid Input!")
        return
    }

    val books = mutableListOf<Book>()
    for(i in 1..input)
    {
        println("\n----- Book $i -----\n")
        println("\nPress 1 to call primary constructor")
        println("Press 2 to call secondary constructor")
        print("Enter your choice (1 or 2) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null || choice !in 1..2)
        {
            println("Invalid Input!")
            return
        }

        when(choice)
        {
            1 -> {
                val name = inputName()
                val id = inputId()
                val price = inputPrice()
                val book = Book(id, name, price)
                books.add(book)
            }

            2 -> {
                val name = inputName()
                val price = inputPrice()
                val book = Book(name, price)
                books.add(book)
            }

            else -> println("Invalid Choice")
        }
    }

    print("\nEnter Book Name To Search : ")
    val searchInput = readln().trim()
    if(searchInput.isBlank())
    {
        println("Invalid Input!")
        return
    }

    var isfound = false
    for(book in books)
    {
        if(book.bookName == searchInput)
        {
            isfound = true
            println("Book Found")
            book.displayBookDetails()
            break
        }
    }

    if(!isfound) println("Book name $searchInput is not found")
}