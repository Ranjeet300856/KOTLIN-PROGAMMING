/*
    Create a Kotlin program where:
    You have separate normal functions for:
    Check if character is Vowel
    Check if character is Consonant
    Check if character is Digit
    Check if character is Special Character

    Create a Higher Order Function
    Create a function named: getCharacterAnalyzer()
    that:
    takes an Int parameter
    returns a function 
*/

//Character Checking Functions
fun checkVowel(ch: Char): Boolean = ch in "aeiouAEIOU"
fun checkConsonant(ch: Char): Boolean = (ch !in "aeiouAEIOU" && ch.isLetter())
fun checkDigit(ch: Char): Boolean = ch.isDigit()
fun checkSpecialChar(ch: Char): Boolean = (!ch.isLetter() && !ch.isDigit())
fun invalidChoice(ch: Char): Boolean = false

//Higher Order Function
fun getCharacterAnalyzer(number: Int): (Char) -> Boolean
{
    when
    {
        number == 1 -> return ::checkVowel
        number == 2 -> return ::checkConsonant
        number == 3 -> return ::checkDigit
        number == 4 -> return ::checkSpecialChar
        else -> return ::invalidChoice
    }
}

//Main Function
fun main()
{
    print("Enter a Character : ")
    val input = readln().trim()
    if(input.isBlank() || input.length != 1)
    {
        println("Invalid Input")
        return
    }

    val ch: Char = input[0]

    println("\nCharacter Operations: ")
    println("1. Check char is vowel")
    println("2. Check char is consonant")
    println("3. Check char is digit")
    println("4. check char is spacial character")

    print("\nEnter your choice (1, 2, 3, 4) : ")
    val choice = readln().trim().toIntOrNull()
    if(choice == null)
    {
        println("Invalid Input")
        return
    }

    val charAnalysis = getCharacterAnalyzer(choice)
    val result = charAnalysis(ch)

    println(result)
}