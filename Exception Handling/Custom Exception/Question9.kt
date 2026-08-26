//Create a Kotlin program that converts a String into an Integer using Custom Exception Handling.
class NumberConversionException(message: String, cause: Throwable? = null) : Exception(message, cause)
fun convertToNumber(value: String): Int
{
    try {
        return value.toInt()
    } catch(e: NumberFormatException) {
        throw NumberConversionException("Invalid Input (String) Number!", e)
    }
}

fun main()
{
    print("Enter a String Number : ")
    val strNumber = readln().trim()
    if(strNumber.isBlank())
    {
        println("Invalid Input!")
        return
    }

    try {
        val intNumber = convertToNumber(strNumber)
        println("Integer Number : $intNumber")
    } catch(e: NumberConversionException) {
        println(e.message)

        if(e.cause != null) println(e.cause)
    }
}