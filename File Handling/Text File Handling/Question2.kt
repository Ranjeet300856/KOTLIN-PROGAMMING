//Write a Kotlin program that reads the contents of an existing text file named notes.txt and calculates basic statistics about its content.
import java.io.File
import java.io.IOException

fun displayInfo(
    totalCharacters: Int = 0,
    totalWords: Int = 0,
    totalLines: Int = 0
) {
    println("Total Characters = $totalCharacters")
    println("Total Words = $totalWords")
    println("Total Lines = $totalLines")
}

fun main()
{
    val myFile = File("notes.txt")
    if(myFile.exists()) {
        var totalCharacters = 0
        var totalWords = 0
        var totalLines = 0
        try {
            myFile.forEachLine{ line ->
                totalLines++
                totalCharacters += line.length
                totalWords += line.split("\\s+".toRegex()).filter { it.isNotEmpty() }.count()

                println(line)
            }

            displayInfo(totalCharacters, totalWords, totalLines)
        } catch(e: IOException) {
            println(e.message)
        }
    } else {
        println("Error: notes.txt does not exist.")
    }
}