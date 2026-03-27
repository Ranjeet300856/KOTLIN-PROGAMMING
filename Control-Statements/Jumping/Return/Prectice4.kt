//Q4th
/*
    Write a Kotlin function that takes an integer n as input and:

    If n is less than or equal to 0 → return "Invalid Input"
    Reverse the digits of the number
    If the reversed number is equal to the original number → return "Palindrome"
    Otherwise → return "Not Palindrome" 
*/

fun isPalindrome(n: Int): String
{
    if(n <= 0) return "Invalid Input"
    val originalNumber = n
    var reverse = 0
    var number = n
    
    while(number != 0)
    {
        reverse = (reverse * 10) + (number % 10)
        number /= 10
    }

    if(originalNumber == reverse) return "Palindrome"
    return "Not Palindrome"
}

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Number")
        return
    }

    println(isPalindrome(number))
}