/*
    Question 3 — Nested Class with Multiple Objects
    Library Book Management

    Create a Kotlin program using a Nested Class. 
*/

class Library {
    class Book(
        val title: String,
        val author: String,
        private val price: Double
    ) {
        fun displayBook() {
            println("Book Title  : $title")
            println("Book Author : $author")
            println("Book Price  : %.2f".format(price))
        }

        fun isExpensive(): Boolean {
            if(price > 500) return true
            else return false
        }
    }
}

fun main()
{
    val book1 = Library.Book("Kotlin Basic", "John", 450.0)
    val book2 = Library.Book("Kotin Advance", "Alex", 750.0)
    val book3 = Library.Book("Android Development", "David", 600.0)

    val book1IsExpensive = if(book1.isExpensive()) "Yes" else "No"
    val book2IsExpensive = if(book2.isExpensive()) "Yes" else "No"
    val book3IsExpensive = if(book3.isExpensive()) "Yes" else "No"

    book1.displayBook()
    println("Book is Expensive : $book1IsExpensive")
    println()

    book2.displayBook()
    println("Book is Expensive : $book2IsExpensive")
    println()

    book3.displayBook()
    println("Book is Expensive : $book3IsExpensive")
}