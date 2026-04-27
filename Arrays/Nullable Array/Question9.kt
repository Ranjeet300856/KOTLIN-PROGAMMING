/*
    Write a Kotlin program to create a Nullable Char Array using constructor with custom values.

    Requirements:
    1. Create a nullable Char array of size 12 using:
       Array<Char?>(12) { ... }
    2. Fill values using this pattern:
       - If index is divisible by 5 -> store null
       - Otherwise:
           If index is even -> store uppercase alphabet starting from 'A'
           If index is odd  -> store lowercase alphabet starting from 'a'

    3. Print all elements with index.
    4. Count null and non-null values.
    5. Count uppercase letters.
    6. Count lowercase letters.
    7. Count vowels among non-null characters.
    8. Count consonants among non-null characters.
    9. Print all uppercase characters in reverse order.
    10. Print all lowercase characters in ascending order.
    11. Print final array in single line. 
*/

fun main()
{
    //Array Creation
    var x = -1
    var y = -1
    val arr = Array<Char?>(12) { i -> 
        if(i % 5 == 0) null
        else
        {
            if(i % 2 == 0)
            {
                ++x
                'A' + x
            }
            else
            {
                ++y
                'a' + y
            }
        }
    }

    //Printing with Index
    for(i in arr.indices) println("Index $i = ${arr[i]}")
    println()

    //Counting
    var countNull = 0
    var countNonNull = 0
    var countUppercase = 0
    var countLowercase = 0
    var countVowel = 0
    var countConsonant = 0

    for(value in arr)
    {
        if(value == null)
        {
            countNull++     //Count Null Values
            continue
        }
        countNonNull++      //Count Non-Null Values

        if(value in 'A'..'Z') countUppercase++      //Count Uppercase Char.
        if(value in 'a'..'z') countLowercase++      //Count Lowercase Char.

        val vowel = "AEIOUaeiou"
        if(value in vowel) countVowel++     //Count Vowels  
        else countConsonant++              //Count Consonant
    }

    println("Null Count            = $countNull")
    println("Non-Null Count        = $countNonNull")
    println("Uppercase Char. Count = $countUppercase")
    println("Lowercase Char. Count = $countLowercase")
    println("Vowel Count           = $countVowel")
    println("Consonant Count       = $countConsonant")
    println()

    //Print all uppercase characters in reverse order.
    print("All uppercase characters in reverse order : ")
    for(i in arr.size - 1 downTo 0)
    {
        if(arr[i] == null) continue
        if(arr[i] in 'A'..'Z') print("${arr[i]} ")
    }
    println()

    //Print all lowercase characters in ascending order.
    print("All lowercase characters in ascending order : ")
    val sortedArr = arr.filterNotNull().sorted()
    for(value in sortedArr)
        if(value in 'a'..'z') print("$value ")
    println()

    //Final Array
    print("Final Array : ")
    for(value in arr) print("$value ")
}