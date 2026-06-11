/*
    Question 4: Favorite Movies Manager
    Problem Statement
    Create a Kotlin program that manages a user's favorite movies using a MutableList<String>.

    Requirements
    1. Ask the user to enter 5 movie names and store them in a MutableList<String>.
    2. Print the complete movie list.
    3. Ask the user to enter a movie name to search.
    Check whether that movie exists in the list.
    Print an appropriate message.
    4. Ask the user to enter an index and a new movie name.
    Update the movie at that index.
    5. Print the final updated movie list. 
*/

fun main()
{
    val movies = mutableListOf<String>()
    for(i in 0..4)
    {
        while(true)
        {
            print("Enter Movie Name ${i + 1} : ")
            val movieName = readln().trim()
            if(movieName.isBlank())
            {
                println("Invalid Input! Try Again")
                continue
            }

            movies.add(movieName)
            break
        }
    }

    println("\nMovies List : $movies")

    print("\nEnter a movie name to search : ")
    val searchMovie = readln().trim().lowercase()
    if(searchMovie.isBlank())
    {
        println("Invalid Search Name")
        return
    }

    var found = false
    for(value in movies)
    {
        val movie = value.lowercase()
        if(movie == searchMovie)
        {
            println("$searchMovie exits in the list")
            found = true
        }
    }
    if(!found) println("$searchMovie not exits in the list")

    print("\nEnter New Movie Name : ")
    val newMovie = readln().trim()
    print("Enter a index        : ")
    val index = readln().trim().toIntOrNull()
    if(newMovie.isBlank() || index == null)
    {
        println("Invalid Input")
        return
    }

    if(index < 0 || index > 4)
    {
        println("Invalid Index")
        return
    }

    movies[index] = newMovie

    println("\nUpdated Movies List : $movies")
}