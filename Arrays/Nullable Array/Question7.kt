/*
    Write a Kotlin program to create a Nullable Int Array using constructor with custom values.

    Requirements:
    1. Create a nullable Int array of size 10 using:
       Array<Int?>(10) { ... }
    2. Fill values using this pattern:
       - If index is divisible by 4 -> store null
       - Otherwise -> store (index + 1) * 7
    3. Print all elements with index.
    4. Count null and non-null values.
    5. Find the sum of all non-null values.
    6. Find the average of all non-null values.
    7. Find the largest non-null value.
    8. Find the smallest non-null value.
    9. Count how many non-null values are divisible by 3.
    10. Print all non-null values in reverse order.
    11. Print final array in single line. 
*/

fun main()
{
    //Array Creation
    val arr = Array<Int?>(10) { i -> if(i % 4 == 0) null else (i + 1) * 7 }

    //Printing with index
    for(i in arr.indices) println("Index $i = ${arr[i]}")
    println()

    //Counting
    var nullCount = 0
    var nonNullCount = 0
    var sum = 0
    var max: Int? = null
    var min: Int? = null
    var countDivisibleBy3 = 0

    for(value in arr)
    {
        if(value == null)
        {
            nullCount++
            continue
        }

        nonNullCount++
        sum += value
        if(value % 3 == 0) countDivisibleBy3++

        if(max == null || value > max) max = value
        if(min == null || value < min) min = value
    }

    val average = sum / nonNullCount

    println("Null Count           = $nullCount")
    println("Non-Null Count       = $nonNullCount")
    println("Sum                  = $sum")
    println("Average              = $average")
    println("Max Value            = $max")
    println("Min Value            = $min")
    println("Count Divisible By 3 = $countDivisibleBy3")
    println()

    //Output
    print("Non-Null Values in Reverse Order : ")
    for(i in arr.size - 1 downTo 0)
        if(arr[i] != null) print("${arr[i]} ")
    println()

    print("Final Array : ")
    for(value in arr) print("$value ")
}