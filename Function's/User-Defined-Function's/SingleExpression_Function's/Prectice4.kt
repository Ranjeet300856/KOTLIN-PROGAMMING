fun isPalindrome(text: String): Boolean = text == text.reversed()
fun main()
{
    //Q4th
    /*
    Write a Kotlin program that defines a Single Expression Function named isPalindrome.
    the function should:
    Take one string parameter text
    Return true if the string is a palindrome
    Return false otherwise
    A palindrome is a word that reads the same forward and backward.
    Examples:
    madam   
    level
    racecar
    After defining the function:
    Read a string from the user
    Call the function
    Print whether the string is a palindrome or not
    */

    print("Enter a Word : ")
    val input = readln().trim()
    if(input.isBlank() || input.contains(" "))
    {
        println("Invalid Input! Please Enter a Valid Input.")
        return
    }

    if(isPalindrome(input)) println("$input is a Palindrome")
    else println("$input is not a Palindrome")
}