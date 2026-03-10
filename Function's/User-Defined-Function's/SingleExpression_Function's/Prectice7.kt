fun countVowels(text: String): Int = text.count { it in "aeiouAEIOU" }
fun main()
{
    //Q7th
    /*
    Write a Kotlin program that defines a Single Expression Function named countVowels.
    The function should:
    Take one string parameter text
    Return the number of vowels in the string
    Vowels are:
    a, e, i, o, u
    Both uppercase and lowercase vowels should be counted.
    */

    print("Enter a Sentence : ")
    val input = readln().trim()
    if(input.isBlank())
    {
        println("Invalid Input!")
        return
    }

    print("Number of Vowels = ${countVowels(input)}")
}