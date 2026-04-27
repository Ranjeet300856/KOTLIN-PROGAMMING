/*
    Write a Kotlin program to create a Nullable Char Array using arrayOf().

    Requirements:
    1. Create a nullable Char array of size 8 using arrayOf().
    2. Store some alphabet characters and keep some positions null.
    3. Print all elements with index.
    4. Count null and non-null values.
    5. Count vowels among non-null characters.
    6. Count consonants among non-null characters.
    7. Find the first non-null character.
    8. Find the last non-null character.
    9. Print all uppercase characters only.
    10. Print final array in single line. 
*/

fun main()
{
    //Array Creation
    val arr = arrayOf('r', 'A', null, null, 'h', null, 'U', 'L')

    //Print elements with index
    for(i in arr.indices) println("Index $i = ${arr[i]}")
    println()

    //Counting
    var nullCount = 0
    var notNullCount = 0
    var vowelsCount = 0
    var consonantsCount = 0
    var firstNonNull: Char? = null
    var lastNonNull: Char? = null

    for(value in arr)
    {
        if(value == null)
        {
            nullCount++
            continue
        }

        if(firstNonNull == null) firstNonNull = value
        lastNonNull = value

        notNullCount++
        if(value.lowercaseChar() in "aeiou") vowelsCount++
        else consonantsCount++
    }

    println("Null Count      = $nullCount")
    println("Non-Null Count  = $notNullCount")
    println("Vowel Count     = $vowelsCount")
    println("Consonant Count = $consonantsCount")
    println("First Non-Null  = $firstNonNull")
    println("Last Non - Null = $lastNonNull")
    println()


    //Printing only uppercase char.
    print("Uppercase Letters : ")
    for(value in arr) if(value != null && value == value.uppercaseChar()) print("$value ")
    println("\n")

    //Final Array
    for(value in arr) print("$value, ")
}