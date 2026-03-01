fun main()
{
    //Q25h
    /*
    Write a Kotlin program that takes a single character as input
    and classifies it using when as expression.

    Rules:
    If the character is a vowel (a, e, i, o, u),
    assign "Vowel".
    If the character is a consonant (a–z or A–Z except vowels),
    assign "Consonant".
    If the character is a digit (0–9),
    assign "Digit".
    Otherwise, assign "Special Character".

    Store the result in a variable and print it.

    If the input is empty or contains more than one character,
    print "Invalid Input".
     */

     print("Enter a Character : ")
     var input = readln()

     if(input.length != 1)
     {
        println("Invalid Input!")
        return
     }

     var ch = input.lowercase()[0]
     var charName = when
     {
        ch in "aeiou" -> "Vowel"
        ch.isLetter() -> "Consonant"
        ch.isDigit() -> "Digit"
        else -> "Special Character" 
     }

     println("Character is a $charName")
}