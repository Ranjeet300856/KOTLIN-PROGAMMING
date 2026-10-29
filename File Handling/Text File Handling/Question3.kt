//Write a Kotlin program that appends new text to an existing text file named notes.txt without deleting or overwriting its existing content.
import java.io.File
import java.io.IOException
fun main()
{
    val myFile = File("notes.txt")
    if(myFile.exists()) {
        print("Enter new text to append : ")
        val newText = readln().trim()
        if(newText.isBlank()) {
            println("Error: Text cannot be empty.")
            return
        }

        try {
            if(myFile.length() == 0L) myFile.appendText(newText, Charsets.UTF_8)
            else myFile.appendText("\n" + newText, Charsets.UTF_8)
            println("Text appended successfully to notes.txt.")
        } catch(e: IOException) {
            println(e.message)
        }

    } else {
        println("Error: notes.txt does not exist.")
        return
    }
}