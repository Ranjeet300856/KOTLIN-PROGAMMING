//Q10th
/* 
    Write a Kotlin function that takes an integer n as input and:

    Rules:
    If n is less than or equal to 0 → return "Invalid Input"
    Reverse the number
    Check:
    If the number is palindrome AND divisible by 5 → return "Special Number"
    If the number is only palindrome → return "Palindrome Only"
    If the number is only divisible by 5 → return "Divisible by 5 Only"
    Otherwise → return "Normal Number"
*/

fun checkNumber(n: Int): String
{
    if(n <= 0) return "Invalid Input"
    var reverse = 0
    val originalNumber = n
    var temp = n
    while(temp != 0)
    {
        reverse = (reverse * 10) + (temp % 10)
        temp /= 10
    }

    if(reverse == originalNumber && originalNumber % 5 == 0) return "Special Number"
    if(reverse == originalNumber) return "Palindrome Only"
    if(originalNumber % 5 == 0) return "Divisible by 5 Only"
    return "Normal Number"
}

fun main()
{
    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null)
    {
        println("Invalid Input")
        return
    }

    println(checkNumber(number))
}