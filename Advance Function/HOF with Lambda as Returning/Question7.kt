/*
    Problem Statement
    Create a Kotlin Higher Order Function named createTextFormatter.

    The function should:
    1. Take a String parameter named formatType.
    2. Return a Lambda.
    3. The returned Lambda should take one String parameter (text).
    4. The Lambda should return the transformed text.

    Formatting Rules:
    - "UPPER"  → Convert text to uppercase.
    - "LOWER"  → Convert text to lowercase.
    - "TITLE"  → Convert the first character of the text to uppercase and keep the remaining characters unchanged.
    - Any Other Format Type → Return the original text.

    Requirements:
    - Use HOF with Lambda as Return Type.
    - Do not use any global variables.
    - The Lambda must be returned from the function.
    - Take format type from the user.
    - Take text input from the user.
    - Handle empty text properly.
    - Print the transformed text.
*/

fun createTextFormatter(formatType: String): (String) -> String
{
    return{
        text: String ->
        when
        {
            formatType == "upper" -> text.uppercase()
            formatType == "lower" -> text.lowercase()
            formatType == "title" -> text[0].uppercaseChar() + text.substring(1)
            else -> text
        }
    }
}

fun main()
{
    print("Enter Format Type : ")
    val formatType = readln().trim().lowercase()
    print("Enter Text        : ")
    val text = readln().trim()
    if(formatType.isBlank() || text.isBlank())
    {
        println("Invalid Input")
        return
    }

    val formattedText = createTextFormatter(formatType)
    println("Formatted Text : ${formattedText(text)}")
}