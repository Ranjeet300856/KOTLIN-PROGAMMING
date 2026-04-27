/*
    Write a Kotlin program to create a Nullable Double Array using arrayOf().

    Requirements:
    1. Create a nullable Double array of size 9 using arrayOf().
    2. Store some decimal values and keep some positions null.
    3. Print all elements with index.
    4. Count null and non-null values.
    5. Find the sum of all non-null values.
    6. Find the average of all non-null values.
    7. Find the highest non-null value.
    8. Find the lowest non-null value.
    9. Count how many non-null values are greater than average.
    10. Count how many non-null values have decimal part > 0.50
        Example:
        5.75 -> yes
        8.40 -> no
    11. Print all non-null values in ascending order.
    12. Print final array in single line. 
*/

fun main()
{
    //Array Creation
    val arr = arrayOf(10.5, 12.80, null, null, null, 80.14, 72.40, 76.00, null)

    //Printing with index
    for(i in arr.indices)
    {
        if(arr[i] == null) println("Index $i = ${arr[i]} ")
        else println("Index $i = %.2f".format(arr[i]))
    }
    println()

    //Counting
    var nullCount = 0
    var nonNullCount = 0
    var sum = 0.0
    var max: Double? = null
    var min: Double? = null

    for(value in arr)
    {
        if(value == null)
        {
            nullCount++
            continue
        }

        nonNullCount++
        sum += value

        if(max == null || value > max) max = value
        if(min == null || value < min) min = value
    }

    val average = sum / nonNullCount

    var countGreaterThanAverage = 0
    var countDecimalPartMoreThan50 = 0

    for(value in arr)
    {
        if(value == null) continue
        if(value > average) countGreaterThanAverage++

        val decimalPart = value - value.toInt()
        if(decimalPart > 0.50) countDecimalPartMoreThan50++
    }

    println("Null Count                      = $nullCount")
    println("Non-Null Count                  = $nonNullCount")
    println("Sum                             = %.2f".format(sum))
    println("Average                         = %.2f".format(average))
    println("Max Value                       = %.2f".format(max))
    println("Min Value                       = %.2f".format(min))
    println("Count Greater Than Average      = $countGreaterThanAverage")
    println("Count Decimal Part More Than 50 = $countDecimalPartMoreThan50")
    println()

    //Print Ascending Order
    print("Non-null values in ascending order : ")
    val sortedArr = arr.filterNotNull().sorted()
    for(value in sortedArr) print("$value ")
    println()

    print("Final Array : ")
    for(value in arr)
    {
        if(value == null) print("$value ")
        else print("%.2f ".format(value))
    }
}