/*
    Question 5: Password Strength Analyzer

    Password:
    'A', 'b', '1', '@', 'K', '9', '#', 'm'

    Requirements:
    1. Print complete List.
    2. Print all characters.
    3. Count uppercase letters.
    4. Count lowercase letters.
    5. Count digits.
    6. Count special characters.
    7. Find first digit.
    8. Find first special character index.
    9. Determine whether the password is Strong or Weak.

    Do not use:
    count(), filter(), find(), indexOfFirst(), any()
*/

fun main()
{
    val password = listOf('A', 'b', '1', '@', 'K', '9', '#', 'm')

    println("Password : $password")

    print("All Character : ")
    for(ch in password) print("$ch ")

    var countUppercase = 0
    var countLowercase = 0
    var countDigit = 0
    var countSpecialChar = 0
    var firstDigit: Char? = null
    var firstSpecialCharIndex = -1

    var hasOneUppercase = false
    var hasOneLowercase = false
    var hasOneDigit = false
    var hasOneSpacialChar = false

    for(i in password.indices)
    {
        val ch = password[i]

        if(ch in 'A'..'Z')
        {
            countUppercase++
            hasOneUppercase = true
        }

        else if(ch in 'a'..'z')
        {
            countLowercase++
            hasOneLowercase = true
        }

        else if(ch in "0123456789")
        {
            countDigit++
            if(firstDigit == null) firstDigit = ch
            hasOneDigit = true
        }

        else
        {
            countSpecialChar++

            if(firstSpecialCharIndex == -1)
                firstSpecialCharIndex = i
            
            hasOneSpacialChar = true
        }
    }

    println("\nTotal Uppercase          : $countUppercase")
    println("Total Lowercase          : $countLowercase")
    println("Total Digits             : $countDigit")
    println("Total Special Characters : $countSpecialChar")
    println("First Digit              : $firstDigit")
    println("First SpecialChar Index  : $firstSpecialCharIndex")

    if(hasOneDigit && hasOneLowercase && hasOneUppercase && hasOneSpacialChar)
        println("\nStrong Password")
    else println("\nWeak Password")
}