/*
    Question 3: Library Book Management Using LinkedHashMap
    Problem Statement
    Create a Kotlin program to manage library books using LinkedHashMap<Int, String>. 
*/

fun isValidInteger(x: Int?): Boolean
{
    if(x == null || x <= 0)
    {
        println("Invalid Input!")
        return false
    }
    else return true
}

fun inputBookId(): Int
{
    while(true)
    {
        print("\nEnter Book ID : ")
        val inputId = readln().trim().toIntOrNull()
        if(!isValidInteger(inputId)) continue
        return inputId!!
    }
}

fun inputBookTitle(): String
{
    while(true)
    {
        print("Enter Book Title : ")
        val inputTitle = readln().trim()
        if(inputTitle.isBlank() || inputTitle.length < 3)
        {
            println("Invalid Book Title!")
            continue
        }

        return inputTitle
    }
}

fun display(books: LinkedHashMap<Int, String>)
{
    println("\nBook Records:")
    for((key, value) in books.entries)
    println("$key -> $value")
}

fun main()
{
    val books = LinkedHashMap<Int, String>()
    print("Enter the total number of books : ")
    val totalBooks = readln().trim().toIntOrNull()
    if(!isValidInteger(totalBooks)) return
    
    for(i in 1..totalBooks!!)
    {
        while(true)
        {
            val bookId = inputBookId()
            if(books.containsKey(bookId))
            {
                println("Book ID already exists.")
                continue
            }

            val bookTitle = inputBookTitle()
            books[bookId] = bookTitle
            println("Book Added Successfully")
            break
        }
    }
    display(books)

    println("\nSearch Operation:")
    val searchId = inputBookId()
    if(books.containsKey(searchId))
    {
        println("Book Found")
        println("Book ID   : $searchId")
        println("Book Name : ${books[searchId]}")
    }
    else println("Book Not Found.")

    println("\nUpdate Operation:")
    val updateId = inputBookId()
    if(books.containsKey(updateId))
    {
        val newTitle = inputBookTitle()
        books[updateId] = newTitle
        println("Book Updated Successfully.")
    }
    else println("Book ID Not Found.")

    println("\nRemove Operation:")
    val removeId = inputBookId()
    if(books.containsKey(removeId))
    {
        books.remove(removeId)
        println("Book Removed Successfully.")
    }
    else println("Book ID Not Found.")

    display(books)
    println("Total Books : ${books.size}")

    print("\nDo you want to clear all records? (yes/no) : ")
    val input = readln().trim().lowercase()
    if(input.isBlank())
    {
        println("Invalid Input!")
        return
    }

    if(input == "yes")
    {
        books.clear()
        println("Library cleared successfully.")
    }
    else if(input == "no") println("Operation cancelled.")
    else println("Invalid Input!")
    println("Library Empty : ${books.isEmpty()}")
}