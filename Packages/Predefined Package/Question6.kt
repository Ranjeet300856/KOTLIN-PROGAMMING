/*
    Write a Kotlin program that analyzes file names and identifies file information using Kotlin predefined string functions.

    Your program should:

    Take a file name as input from the user.
    Validate the file name properly.
    Display:
    Original File Name
    Trimmed File Name
    File Name Length
    File Extension
    File Name Without Extension
    Uppercase File Name
    Lowercase File Name
    Check and display:
    Whether the file contains spaces
    Whether the file is a hidden file
    Whether the file extension is valid
    Determine file category:
    Image
    Video
    Audio
    Document
    Unknown 
*/

fun main()
{
    //Input file name and validation
    print("Enter File Name : ")
    val fileName = readln()
    if(fileName.isBlank())
    {
        println("Invalid File Name")
        return
    }

    val containsSpace = if(fileName.contains(" ")) true else false
    val validExtensions = arrayOf(
    "jpg", "png", "jpeg", "gif",
    "mp4", "mkv", "avi",
    "mp3", "wav",
    "pdf", "txt", "docx"
    )

    //Analyzes file names and Identifies file information
    val cleanedName = fileName.trim()
    val fileNameLength = cleanedName.length
    val fileExtension = cleanedName.substringAfterLast(".")
    val fileNameBeforeExtension = cleanedName.substringBeforeLast(".")
    val isHidden = cleanedName.startsWith(".")
    val validExt = fileExtension.lowercase() in validExtensions
    //Output
    println("\n-------- File Analysis Report --------\n")

    println("Original File Name      : $fileName")
    println("Trimmed File Name       : $cleanedName")
    println("File Name Length        : $fileNameLength")
    println("File Extension          : $fileExtension")
    println("File Name Without Ext   : $fileNameBeforeExtension")
    println("Uppercase File Name     : ${cleanedName.uppercase()}")
    println("Lowercase File Name     : ${cleanedName.lowercase()}")
    println()

    println("Contains Spaces         : $containsSpace")
    println("Hidden File             : $isHidden")
    println("Valid Extension         : $validExt")
    println()

    //Find File Category

    if(fileExtension.lowercase() == "jpg" || fileExtension.lowercase() == "jpeg" || fileExtension.lowercase() == "png" || fileExtension.lowercase() == "gif")
        println("File Category           : Image")
    else if(fileExtension.lowercase() == "mp4" || fileExtension.lowercase() == "mkv" || fileExtension.lowercase() == "avi")
        println("File Category           : Video")
    
    else if(fileExtension.lowercase() == "mp3" || fileExtension.lowercase() == "wav")
        println("File Category           : Audio")
    
    else if(fileExtension.lowercase() == "pdf" || fileExtension.lowercase() == "txt" || fileExtension.lowercase() == "docx")
        println("File Category           : Document")
    
    else
        println("File Category           : Unknown")
}