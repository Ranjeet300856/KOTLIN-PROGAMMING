//Question 4 — Inner Class with Multiple Objects
class Library(
    val libraryName: String,
    val location: String
) {
    inner class Book(
        val title: String,
        val author: String,
        private var price: Double
    ) {
        fun showBookDetails() {
            println("Book Title       : $title")
            println("Book Author      : $author")
            println("Book Price       : %.2f".format(price))
            println("Library Name     : $libraryName")
            println("Library Location : $location\n")
        }
    }
}

fun main() 
{
    val library = Library("City Central Library", "Jaipur")
    val book1 = library.Book("Kotlin Basics", "John Smith", 450.00)
    val book2 = library.Book("Advanced Kotlin", "Alex Brown", 650.00)
    val book3 = library.Book("Android Development", "David Wilson", 800.00)

    val books = listOf(book1, book2, book3)
    books.forEach {
        it.showBookDetails()
    }
}