/*
    Write a Kotlin program that searches for a specific word in an existing text file named notes.txt 
    and replaces all occurrences of that word with a new word provided by the user. 
*/

import java.io.File
import java.io.IOException
fun main()
{
    val myFile = File("notes.txt")
    if(!myFile.exists()) {
        println("Error: notes.txt does not exist.")
        return
    } else {
        print("Enter Text to Search   : ")
        val searchText = readln().trim()
        print("Enter Replacement Word : ")
        val replaceText = readln().trim()
        if(searchText.isBlank() || replaceText.isBlank()) {
            println("Input cannot be empty.")
            return
        }

        try {
            val content = myFile.readText()
            if(!content.contains(searchText)) {
                println("No occurrences found. File remains unchanged.")
                return
            } else {
                val updateContent = content.replace(searchText, replaceText)
                myFile.writeText(updateContent)

                val count = (content.length - content.replace(searchText, "").length) / searchText.length
                println("$count occurrence(s) replaced successfully.")
            }
        } catch(e: IOException) {
            println(e.message)
        }
    }
}