//Write a Kotlin program that creates a text file named notes.txt and writes user-provided text into it.
import java.io.File
import java.io.IOException
fun main()
{
     print("Enter any Text : ")
     val text = readln().trim()
     if(text.isBlank()) {
        println("Error: Note cannot be empty.")
        return
     }

     try {
        val myFile = File("notes.txt")
        myFile.createNewFile()
        myFile.writeText(text)
        println("Note saved successfully to notes.txt.")
     } catch(e: IOException) {
        println(e.message)
     }
}