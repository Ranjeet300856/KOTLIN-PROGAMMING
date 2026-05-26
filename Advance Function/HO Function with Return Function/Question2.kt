/*
    Create a Kotlin program where:
    You have separate normal functions for:
    Convert String to Uppercase
    Convert String to Lowercase
    Reverse a String

    Create a Higher Order Function
    Create a function named: getFormatter()
    that:
    takes an Int parameter
    returns a function 
*/

//Uppercase Function
fun convertUppercase(text: String): String = text.uppercase()

//Lowercase Function
fun convertLowercase(text: String): String = text.lowercase()

//Reversed Function
fun reverseText(text: String): String
{
    var reverse = ""
    for(ch in (text.length - 1) downTo 0)
        reverse += text[ch]
    
    return reverse
}

//Invalid Choice Function
fun invalidChoice(text: String): String = "Invalid Operation"

//Higher Order
fun getFormatter(number: Int): (String) -> String
{
    if(number == 1) return ::convertUppercase
    else if(number == 2) return ::convertLowercase
    else if(number == 3) return ::reverseText
    else return ::invalidChoice
}

//Main Function
fun main()
{
    print("Enter a Text : ")
    val input = readln().trim()
    if(input.isBlank())
    {
        println("Invalid Input")
        return
    }

    println("\nFormatting Options")
    println("1. Convert text into Uppercase")
    println("2. Convert text into Lowercase")
    println("3. Reversed text")

    print("\nEnter Choice (1, 2, 3) : ")
    val choice = readln().trim().toIntOrNull()
    if(choice == null)
    {
        println("Invalid Choice")
        return
    }

    val getResult = getFormatter(choice)
    println(getResult(input))
}