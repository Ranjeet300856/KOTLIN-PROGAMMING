/*
    Create a Kotlin Extension Function for the String class named countWords().
    The function should:
    1. Count the total number of words in the string.
    2. Ignore leading and trailing spaces.
    3. Ignore multiple spaces between words.
    4. Return the total word count as an Int. 
*/

fun String.countWords(): Int
{
    var count = 0
    var isWord = false
    for(ch in this)
    {
        if(ch != ' ')
        {
            if(!isWord)
            {
                count++
                isWord = true
            }
        }
        else isWord = false
    }

    return count
}

fun main()
{
    print("Enter a text : ")
    val text = readln().trim()
    if(text.isBlank())
    {
        println("Invalid Input")
        return
    }

    val totalWords = text.countWords()
    println("Total Words : $totalWords")
}