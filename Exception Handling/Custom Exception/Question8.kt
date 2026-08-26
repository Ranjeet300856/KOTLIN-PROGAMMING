//Create a Kotlin program that validates a file before processing it using Custom Exception Handling.
class InvalidFileNameException(message: String) : Exception(message)
class UnsupportedFileTypeException(message: String) : Exception(message)
fun processFile(fileName: String) 
{
    if(fileName.isBlank()) throw InvalidFileNameException("File name cannot be empty.")
    if(!(fileName.endsWith(".txt", ignoreCase = true) || fileName.endsWith(".pdf", ignoreCase = true))) throw UnsupportedFileTypeException("Unsupported file type.")
    println("File processed successfully.")
}

fun main()
{
    print("Enter File Name : ")
    val fileName = readln().trim()
    try {
        processFile(fileName)
    } catch(e: InvalidFileNameException) {
        println(e.message)
    } catch(e: UnsupportedFileTypeException) {
        println(e.message)
    }
}