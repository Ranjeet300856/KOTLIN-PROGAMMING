/*
    Question 6 — Error Code Message System
    Problem Statement
    Create a Kotlin program that works as an Error Code Message System using an Immutable Map.
*/

fun checkErrorCode(errorMessage: Map<Int, String>, errorCode: Int)
{
    if(errorMessage.containsKey(errorCode))
    {
        println("Error Code : $errorCode")
        println("Message    : ${errorMessage[errorCode]}")

        when(errorCode)
        {
            in 100..199 -> println("Category   : Informational\n")
            in 200..299 -> println("Category   : Success\n")
            in 300..399 -> println("Category   : Redirection\n")
            in 400..499 -> println("Category   : Client Error\n")
            in 500..599 -> println("Category   : Server Error\n")
        }
    }

    else
    {
        println("Error Code : $errorCode")
        println("Unknown Error Code\n")
    } 
}

fun main()
{
    val errorMessage = mapOf(
        100 to "Continue",
        200 to "Success",
        301 to "Moved Permanently",
        404 to "Page Not Found",
        500 to "Internal Server Error"
    )

    val errorCode = 404
    checkErrorCode(errorMessage, errorCode)

    val code1 = 200
    checkErrorCode(errorMessage, code1)

    val code2 = 500
    checkErrorCode(errorMessage, code2)

    val code3 = 700
    checkErrorCode(errorMessage, code3)
}