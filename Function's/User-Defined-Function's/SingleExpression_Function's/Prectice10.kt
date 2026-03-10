fun reverseWords(text: String): String = text.trim().split("\\s+".toRegex()).reversed().joinToString(" ")

fun main() 
{
    // Q10
    /*
    Write a Kotlin program that defines a Single Expression Function named reverseWords.
    The function should:
    Take one string parameter text
    Return a new string where the order of words is reversed
    */

    print("Enter a Sentence : ")
    val input = readln()
    if (input.isBlank()) {
        println("Invalid input! Please Enter a Sentence.")
        return
    }

    println("Reversed Sentence = ${reverseWords(input)}")
}