/*
    Question 10: Library Book Borrow Manager Using Singleton Object
    Problem Statement
    Create a Kotlin program that uses an Object Declaration (Singleton Object) to manage a library's borrowed books.
    The Singleton Object should maintain records of borrowed books along with the name of the student who borrowed each book. 
*/

object LibraryManager
{
    private val borrowedBooks = mutableMapOf<String, String>()
    private fun isBorrow(borrowBook: String): Boolean
    {
        if(borrowedBooks.containsKey(borrowBook)) return true
        else
        {
            println("No borrowd Book!")
            return false
        }
    }

    fun borrowBook(borrowBook: String, studentName: String)
    {
        if(!borrowBook.isBlank() && !studentName.isBlank())
        {
            if(borrowedBooks.containsKey(borrowBook)) println("Already book borrowed.")
            else
            {
                borrowedBooks[borrowBook] = studentName
                println("Book borrowd successfully.")
            }
        }
        else println("BorrowBook and StudentName cannot be blank.")
    }

    fun returnBook(bookName: String)
    {
        if(isBorrow(bookName))
        {
            borrowedBooks.remove(bookName)
            println("Book returned successfully.")
        }
        else println("No book borrowed.")
    }

    fun searchBook(bookName: String)
    {
        if(isBorrow(bookName))
        {
            println("Book Name    : $bookName")
            println("Borrowed By  : ${borrowedBooks[bookName]}")
        }
        else println("No Book Found.")
    }

    fun displayBorrowedBooks()
    {
        if(borrowedBooks.isEmpty()) println("No books are currently borrowed.")
        else
        {
            println("\n========== Borrowed Books ==========")
            var x = 1
            for((key, value) in borrowedBooks.entries)
            {
                println("$x. $key\t -> $value")
                x++
            }
            println("====================================")
        }
    }

    fun displayTotalBorrowedBooks() = println("Total Borrowed Books : ${borrowedBooks.size}")
    fun clearLibraryRecords()
    {
        if(borrowedBooks.isEmpty()) println("No books are currently borrowed.")
        else
        {
            borrowedBooks.clear()
            println("Library records cleared successfully.")
        }
    }
}

fun main()
{
    LibraryManager.displayBorrowedBooks()

    println("\nBorrow Books:")
    LibraryManager.borrowBook("Kotlin in Action", "Ranjeet")
    LibraryManager.borrowBook("Clean Code", "Amit")
    LibraryManager.borrowBook("Atomic Habits", "Rahul")
    LibraryManager.displayBorrowedBooks()
    LibraryManager.displayTotalBorrowedBooks()

    println("\nBorrow Book Again:")
    LibraryManager.borrowBook("Clean Code", "Amit")

    println("\nSearch Books:")
    LibraryManager.searchBook("Atomic Habits")
    LibraryManager.searchBook("Java Basics")

    println("\nReturn Books:")
    LibraryManager.returnBook("Clean Code")
    LibraryManager.displayBorrowedBooks()
    LibraryManager.displayTotalBorrowedBooks()
    LibraryManager.returnBook("Python Basics")

    println("\nClear Library Records:")
    LibraryManager.clearLibraryRecords()
    LibraryManager.displayBorrowedBooks()

    println("\nClear Library Records Again:")
    LibraryManager.clearLibraryRecords()
}