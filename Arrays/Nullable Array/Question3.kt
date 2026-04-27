/*
    Write a Kotlin program to create a Nullable Double Array using constructor with custom values.

    Requirements:
    1. Create a nullable Double array of size 6 using:
       Array<Double?>(size) { ... }
    2. Fill values using this pattern:
       - If index is even -> store (index + 1) * 2.5
       - If index is odd  -> store null
    3. Print all elements with index.
    4. Count null and non-null values.
    5. Find the sum of all non-null values.
    6. Find the average of all non-null values.
    7. Find the highest non-null value.
    8. Print only values greater than average.
    9. Print final array in single line. 
*/

fun main()
{
    //Array Creation
    val arr = Array<Double?>(6) { i -> if(i % 2 == 0) (i + 1) * 2.5 else null }

    //Printing Elements with index
    for(i in arr.indices) println("Index $i = ${arr[i] ?: "null"}")
    println()

    //Counting, Calculate Sum, Average and Find Highest Non-Null Value
    var nullCount = 0
    var notNullCount = 0
    var sum = 0.0
    var highest: Double? = null

    for(value in arr)
    {
        if(value == null)
        {
            nullCount++
            continue
        }

        notNullCount++
        sum += value

        if(highest == null || value > highest) highest = value
    }

    val average = sum / notNullCount

    println("Null Count      = $nullCount")
    println("Non-Null Count  = $notNullCount")
    println("Sum             = %.2f".format(sum))
    println("Average         = %.2f".format(average))
    println("Highest Value   = %.2f".format(highest))
    println()

    //Printing values only greater than average
    print("Array Values only greater than average : ")
    for(value in arr)
        if(value != null && value > average) print("%.2f ".format(value))
    println()

    //Final Array
    print("\nFinal Array : ")
    for(value in arr)
    {
        if(value == null) print("$value ")
        else print("%.2f ".format(value))
    }
}