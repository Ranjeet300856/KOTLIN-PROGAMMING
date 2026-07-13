/*
    Question 9: File Download Manager Using Singleton Object
    Problem Statement
    Create a Kotlin program that uses an Object Declaration (Singleton Object) to manage downloaded files.
    The Singleton Object should maintain the download history and provide functions to add downloads, remove downloads, 
    clear download history, and display all downloaded files. 
*/

object DownloadManager
{
    private val downloadHistory = mutableListOf<String>()


    fun downloadFile(fileName: String)
    {
        if(fileName.isBlank())
        {
            println("File name cannot be blank.")
            return
        }

        if(fileName in downloadHistory) println("This file is already in downloaded history.")
        else
        {
            downloadHistory.add(fileName)
            println("File added successfully in download history.")
        }
    }

    fun removeDownload(fileName: String)
    {
        if(fileName in downloadHistory)
        {
            downloadHistory.remove(fileName)
            println("File removed successfully in dowloaded history.")
        }
        else println("File not found")
    }

    fun clearDownloadHistory()
    {
        if(downloadHistory.isEmpty()) println("No files available in history.")
        else
        {
            downloadHistory.clear()
            println("History cleared successfully.")
        }
    }

    fun displayDownloadHistory()
    {
        if(downloadHistory.isEmpty()) println("No downloaded files found.")
        else
        {
            println("\n========== Download History ==========")
            var x = 1
            for(file in downloadHistory)
            {
                println("$x. $file")
                x++
            }
            println("======================================")
        }
    }

    fun displayTotalDownloads() = println("Total Downloaded Files : ${downloadHistory.size}")
}

fun main()
{
    DownloadManager.displayDownloadHistory()

    println("\nAdd Files:")
    DownloadManager.downloadFile("Kotlin.pdf")
    DownloadManager.downloadFile("Android Notes.pdf")
    DownloadManager.downloadFile("Resume.docx")
    DownloadManager.displayDownloadHistory()
    DownloadManager.displayTotalDownloads()

    println("\nAdd Again:")
    DownloadManager.downloadFile("Resume.docx")

    println("\nRemove a File:")
    DownloadManager.removeDownload("Android Notes.pdf")
    DownloadManager.displayDownloadHistory()
    DownloadManager.displayTotalDownloads()

    println("Remove a File:")
    DownloadManager.removeDownload("Java.pdf")

    println("\nClear Download History:")
    DownloadManager.clearDownloadHistory()
    DownloadManager.displayDownloadHistory()

    println("\nClear Download History Again:")
    DownloadManager.clearDownloadHistory()
}