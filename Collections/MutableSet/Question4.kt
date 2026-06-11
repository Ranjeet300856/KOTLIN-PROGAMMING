/*
    Question 4 — Unique Favorite Programming Languages Manager

    Problem Statement:
    Create a Kotlin program that accepts programming language names
    from the user using MutableSet<String>. The program should store
    only unique languages, allow searching and removing languages,
    and display updated results.
*/

fun main()
{
    print("How many programming languages do you want to enter? : ")
    val n = readln().trim().toIntOrNull()
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    val favoriteLanguages = mutableSetOf<String>()

    for(i in 0 until n)
    {
        while(true)
        {
            print("Enter Language ${i + 1} : ")
            val language = readln().trim()
            if(language.isBlank())
            {
                println("Invalid Input! Try Again")
                continue
            }

            favoriteLanguages.add(language)
            break
        }
    }

    println("\nUnique Programming Languages:")
    for(value in favoriteLanguages) println("$value")

    println("\nTotal Unique Languages : ${favoriteLanguages.size}")

    print("\nEnter a language to search : ")
    val searchLanguage = readln().trim()
    if(searchLanguage.isBlank())
    {
        println("Invalid Input")
        return
    }

    if(searchLanguage in favoriteLanguages) println("Language Found")
    else println("Language not found")

    print("\nEnter a language to remove : ")
    val removeLanguage = readln().trim()
    if(removeLanguage.isBlank())
    {
        println("Invalid Input")
        return
    }

    if(favoriteLanguages.remove(removeLanguage)) println("Language removed successfully.")
    else println("Language does not exist.")

    print("\nUpdated Set        : ")
    for(value in favoriteLanguages) print("$value ")

    println("\nUpdated Set Size : ${favoriteLanguages.size}")
}