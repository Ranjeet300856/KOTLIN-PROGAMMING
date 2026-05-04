/*
    Write a Kotlin program that:

    Takes a regular string input from the user.
    Finds the longest word in the string. 
*/

fun main() 
{
    print("Enter a String: ")
    val input = readln()
    if(input.isBlank()) 
    {
        println("Invalid Input")
        return
    }

    println("Original String : $input")

    var currentWord = ""
    var longestWord = ""

    for(i in input.indices) 
    {
        if(input[i] != ' ') 
        {
            currentWord += input[i]
        } 
        else 
        {
            if(currentWord.length > longestWord.length) 
            {
                longestWord = currentWord
            }
            currentWord = ""
        }
    }

    // Last word check (important)
    if(currentWord.length > longestWord.length) 
    {
        longestWord = currentWord
    }

    println("Longest Word : $longestWord")
    println("Length       : ${longestWord.length}")
}