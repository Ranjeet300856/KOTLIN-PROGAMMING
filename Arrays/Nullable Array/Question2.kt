/*
    Write a Kotlin program to create a Nullable Int Array using arrayOfNulls().

    Requirements:
    1. Create an array of size 7.
    2. Insert integer values at some indexes.
    3. Keep some indexes null.
    4. Print all elements with index.
    5. Count null and non-null values.
    6. Find the sum of all non-null values.
    7. Find the largest non-null value.
    8. Find the smallest non-null value.
    9. Print only even non-null values.
    10. Print final array in single line.
*/

fun main()
{
    //Array Creation
    val arr = arrayOfNulls<Int>(7)

    //Input Elements
    for(i in arr.indices)
    {
        print("Enter Element ${i + 1} : ")
        val element = readln().trim().toIntOrNull()
        arr[i] = element
    }

    //Print Array Values with Index
    for(i in arr.indices) println("Index $i = ${arr[i]}")
    println()

    //Counting
    var countNullValue = 0
    var countNotNullValue = 0
    var sum = 0
    var largest: Int? = null
    var smallest: Int? = null
    var first = false
    for(value in arr)
    {
        if(value == null)
        {
            countNullValue++
            continue
        }
        else
        {
            if(!first)
            {
                smallest = value
                largest = value
                first = true
            }
            countNotNullValue++
            sum += value
               
            if(value > largest!!) largest = value
            if(value < smallest!!) smallest = value
        }
    }

    println("Null Count     = $countNullValue")
    println("Non-Null Count = $countNotNullValue")
    println("Sum = $sum")

    if(smallest == null && largest == null) println("Array is Null. No Minimum or Maximum values found")
    else
    {
        println("Max = $largest")
        println("Min = $smallest")
    }
    println()

    //Printing only even non-null values
    print("Even Value : ")
    for(value in arr)
        if(value != null && value % 2 == 0) print("$value ")
    println()

    //Final Array
    print("Final Array : ")
    for(value in arr) print("$value ")
}