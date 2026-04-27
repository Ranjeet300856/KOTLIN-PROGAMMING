/*
    Write a Kotlin program to create a Nullable String Array using constructor with custom values.

    Requirements:
    1. Create a nullable String array of size 8 using:
       Array<String?>(8) { ... }
    2. Fill values using this pattern:
       - If index is divisible by 3 -> store null
       - Otherwise -> store "User" + (index + 1)
    3. Print all elements with index.
    4. Count null and non-null values.
    5. Find the longest non-null string.
    6. Find the shortest non-null string.
    7. Count how many strings contain digit '1'.
    8. Print only strings whose length is greater than 5.
    9. Print all non-null strings in reverse order.
    10. Print final array in single line. 
*/

fun main()
{
    //Array Creation
    val arr = Array<String?>(8) { i -> if(i % 3 == 0) null else "user" + (i + 1) }

    //Print Elements with index
    for(i in arr.indices) println("Index $i = ${arr[i]}")
    println()

    //Counting
    var nullCount = 0
    var nonNullCount = 0
    var longestString: String? = null
    var shortestString: String? = null
    var containIsOne = 0

    for(value in arr)
    {
        if(value == null)
        {
            nullCount++
            continue
        }

        nonNullCount++
        if(longestString == null || value.length > longestString.length) longestString = value
        if(shortestString == null || value.length < shortestString.length) shortestString = value
        if("1" in value) containIsOne++
    }

    println("Null Count      = $nullCount")
    println("Non-Null Count  = $nonNullCount")
    println("Longest String  = $longestString")
    println("Shortest String = $shortestString")
    println("Contain is One  = $containIsOne")
    println()

    //Output
    var x = false
    print("Array with String Lengths is Greater than 5 : ")
    for(value in arr)
    {
        if(value != null && value.length > 5)
        {
            print("$value ")
            x = true
        }
    }
    if(!x) print("No String Found")
    println()
    
    print("Strings in Reverse Order : ")
    for(value in arr.reversed())
        if(value != null) print("$value ")
    println()

    print("Final Array : ")
    for(value in arr) print("$value ")
}