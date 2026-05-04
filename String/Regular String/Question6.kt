/*
    Write a Kotlin program that:

    Takes a regular string input from the user.
    Checks whether the string is a palindrome or not. 
*/

fun main()
{
    //Input String
    print("Enter a String : ")
    val str = readln()
    if(str.isBlank())
    {
        println("Invalid Input")
        return
    }
    println("Original String : $str")

    val cleanedStr = str.replace(" ", "").lowercase()

    //Reversed String
    var reversedStr = ""
    for(i in (cleanedStr.length - 1) downTo 0)
    {
        reversedStr += cleanedStr[i]
    }

    //Check Palindrome
    if(cleanedStr == reversedStr) println("String is a Palindrome")
    else println("String is not a Palindrome")
}