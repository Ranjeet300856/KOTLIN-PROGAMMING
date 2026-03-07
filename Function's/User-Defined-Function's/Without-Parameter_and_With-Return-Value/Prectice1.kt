fun getWelcomeMessage(): String
{
    return "Welcome to Kotlin Programming!"
}
fun main()
{
    //Q1st
    /*
    Write a Kotlin program that defines a function getWelcomeMessage() which takes no parameters but returns a String containing a welcome message.
    The program should call this function from main() and print the returned message.

    Requirements
    The function must not take any parameters.
    The function must return a String value.
    The returned message should be something meaningful like - Welcome to Kotlin Programming!
    The function must be called inside main().
    Expected Output Example - Welcome to Kotlin Programming!
    */

    var message = getWelcomeMessage()
    println(message)
}