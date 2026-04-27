/*
    Write a Kotlin program to create a Nullable String Array using arrayOf().

    Requirements:
    1. Store 5 student names.
    2. Some positions should contain null.
    3. Print all elements one by one with index.
    4. Count how many null values are present.
    5. Count how many non-null values are present.
    6. Print the length of each non-null string.
    7. Print the final array in single line. 
*/

fun main()
{
    //Array Creation
    val arr = arrayOf("Ranjeet", null, "Rahul", "Jagdish", null)

    //Print Array
    for(i in arr.indices) println("Index $i = ${arr[i]}")
    println()

    //Counting
    var countNullValue = 0
    var countNotNullValue = 0
    for(value in arr)
    {
        if(value == null) countNullValue++
        else countNotNullValue++
    }

    //Print Counting
    println("Null Counts = $countNullValue")
    println("Non - Null Count = $countNotNullValue")
    println()

    //Find Lengths
    for(i in arr.indices)
    {
        if(arr[i] == null) continue
        println("Length of ${arr[i]} = ${arr[i]!!.length}")
    }
    println()

    //Output
    print("Final Array : ")
    for(value in arr) print("$value ")
}