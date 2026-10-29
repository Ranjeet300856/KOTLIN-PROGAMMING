//Write a Kotlin program that copies the contents of an existing text file named notes.txt into another file named backup.txt.
import java.io.File
import java.io.IOException
fun main()
{
    val myFile = File("notes.txt")
    if(!myFile.exists()) {
        println("Error: notes.txt does not exist.")
        return
    } else {
        try {
            val content = myFile.readText()
            val anotherFile = File("backup.txt")
            anotherFile.writeText(content)
            println("File copied successfully to backup.txt.")
        } catch(e: IOException) {
            println(e.message)
        }
    }
}