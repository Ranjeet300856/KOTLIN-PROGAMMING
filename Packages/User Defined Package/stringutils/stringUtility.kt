package stringutils

fun toUpperCaseText(text: String): String = text.uppercase()

fun toLowerCaseText(text: String): String = text.lowercase()

fun reverseText(text: String): String = text.reversed()

fun countCharacters(text: String): Int
{
    var count = 0
    for(ch in text)
        count++
    
    return count
}