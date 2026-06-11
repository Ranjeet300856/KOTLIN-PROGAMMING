/*
    Question 10: Book Collection Manager (Final MutableList Mini Project)
    Problem Statement
    Create a Kotlin program that manages a personal book collection using a MutableList<String>.

    Requirements
    1. Ask the user to enter 5 book names and store them in a MutableList<String>.
    Rules:
    Book name cannot be blank.
    Invalid input should be rejected and asked again.
    2. Print the complete book collection.

    3. Ask the user to enter a book name to search.
    Check whether the book exists in the collection.
    Print: Book Found
    or
    Book Not Found

    4. Ask the user to enter:
    An index
    A new book name
    Update the book at that index.
    Then print the updated collection.

    5. Ask the user to enter a book name to remove.
    Remove the first occurrence using: remove()
    Print an appropriate message.

    6. Print the final report:
    Final Book Collection
    Total Books (size)
    Collection Empty or Not (isEmpty()) 
*/

fun main()
{
    val books = mutableListOf<String>()

    for(i in 0..4)
    {
        while(true)
        {
            print("Enter Book Name ${i + 1} : ")
            val bookName = readln().trim()
            if(bookName.isBlank())
            {
                println("Invalid Input")
                continue
            }

            books.add(bookName)
            break
        }
    }

    println("\nBook Collection : $books")

    print("\nEnter a book name to search : ")
    val searchBook = readln().trim()
    if(searchBook.isBlank())
    {
        println("Invalid Input")
        return
    }

    if(books.contains(searchBook)) println("Book Found")
    else println("Book not found")

    print("\nEnter Index to Update : ")
    val index = readln().trim().toIntOrNull()

    print("Enter New Book Name   : ")
    val newBookName = readln().trim()
    
    if(newBookName.isBlank() || index == null || index < 0 || index >= books.size)
    {
        println("Invalid Input")
        return
    }

    books[index] = newBookName
    println("Updated Book Collection : $books")

    print("\nEnter a book name to remove : ")
    val removeBookName = readln().trim()
    if(removeBookName.isBlank())
    {
        println("Invalid Input")
        return
    }

    if(books.contains(removeBookName))
    {
        books.remove(removeBookName)
        println("Book Remove Successfully")
    }
    else println("Book Not Found")

    println("\nFinal Book Collection : $books")
    println("Book collection size  : ${books.size}")
    if(books.isEmpty()) println("Books collection is empty")
    else println("Books collection is not empty")
}