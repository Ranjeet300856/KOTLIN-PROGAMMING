/*
Question 9: Text Formatter using Default Parameters

Write a Kotlin function formatText(text: String,
toUpperCase: Boolean = false,
addExclamation: Boolean = false)
that formats text based on the given options.

Return the formatted text instead of printing it.
*/

fun formatText(text: String, toUpperCase: Boolean = false, addExclamation: Boolean = false): String
{
    var result = text
    if (toUpperCase) result = result.uppercase()
    if (addExclamation)  result += "!"
    return result
}

fun main()
{
     println(formatText("hello"))
     println(formatText("hello", toUpperCase = true))
     println(formatText("hello", addExclamation = true))
     println(formatText("hello", true, true))
}