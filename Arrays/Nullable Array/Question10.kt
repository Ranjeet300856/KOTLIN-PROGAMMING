/*
    Write a Kotlin program to create a Nullable String Array using arrayOfNulls().
    Scenario:A company stores employee names in fixed slots.

    Requirements:
    1. Create a nullable String array of size 10 using arrayOfNulls().
    2. Insert names manually at some indexes.
    3. Keep some indexes null.
    4. Print all elements with index.
    5. Count null and non-null values.
    6. Find the longest non-null name.
    7. Find the shortest non-null name.
    8. Count how many names start with vowel.
    9. Count how many names end with vowel.
    10. Print all names in alphabetical order.
    11. Print all names whose length is even.
    12. Print final array in single line. 
*/

fun main()
{
    //Array Creation
    val arr = arrayOfNulls<String>(10)
    println()

    //Input Array Elements
    for(i in arr.indices)
    {
        while(true)
        {
            print("Enter Employee Full Name ${i + 1} : ")
            val name = readln().trim()
            if(!name.all { it.isLetter() || it.isWhitespace() })
            {
                println("Invalid Input! Please Enter a Valid Name")
                continue
            }

            if(!name.isEmpty())
            {
                arr[i] = name
                break
            }
            else
            {
                arr[i] = null
                break
            }
        }
    }

    //Print Array with index
    for(i in arr.indices) println("Index $i = ${arr[i]}")
    println()

    //Counting
    var countNull = 0
    var countNonNull = 0
    var countStartWithVowel = 0
    var countEndtWithVowel = 0
    var longestStr: String? = null
    var shortestStr: String? = null

    for(value in arr)
    {
        if(value == null)
        {
            countNull++     //Count Null Values
            continue
        }
        countNonNull++     //Count Non-Null Values

        if(longestStr == null || longestStr.length < value.length) longestStr = value           //Find Longest String
        if(shortestStr == null || shortestStr.length > value.length) shortestStr = value      //Find Shortest String

        val vowel = "aeiouAEIOU"
        if(value[0] in vowel) countStartWithVowel++                     //Count Name Start With Vowels
        if(value[value.length - 1] in vowel) countEndtWithVowel++       //Count Name End With Vowels
    }

    println("Null Count                      = $countNull")
    println("Non-Null Count                  = $countNonNull")
    println("Longest String                  = $longestStr")
    println("Shortest String                 = $shortestStr")
    println("Name Start With Vowel Count     = $countStartWithVowel")
    println("Name End With Vowel Count       = $countEndtWithVowel")
    println()

    //Print all names in alphabetical order
    val filterArr = arr.filterNotNull().sortedBy { it.lowercase() }
    print("All names in alphabetical order : ")
    for(name in filterArr) print("$name ")
    println()

    //Print all names whose length is even
    print("\nAll names whose length is even : ")
    for(name in arr)
    {
        if(name == null) continue
        if(name.length % 2 == 0) print("$name ")
    }
    println()

    //Final Array
    print("Final Array : ")
    for(name in arr) print("$name ")
}