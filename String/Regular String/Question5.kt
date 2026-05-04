/*
    Write a Kotlin program that:
    Takes a regular string input from the user.

    Counts:
    Total number of vowels (a, e, i, o, u)
    Total number of consonants
    Ignores:
    Spaces
    Digits
    Special characters
    Prints:
    Original string
    Number of vowels
    Number of consonants 
*/

fun main()
{
    print("Enter a String : ")
    val str = readln().trim()
    if(str.isEmpty())
    {
        println("Invalid Input")
        return
    }

    var countVowel = 0
    var countConsonant = 0

    for(i in 0..str.length - 1)
    {
        if(str[i].isLetter())
        {
            if(str[i] in "aeiouAEIOU") countVowel++
            else countConsonant++
        }
    }

    println("Original String : $str")
    println("Total Vowels    : $countVowel")
    println("Total Consonant : $countConsonant")
}