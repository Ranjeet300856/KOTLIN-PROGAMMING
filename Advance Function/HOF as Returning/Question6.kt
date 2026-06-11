/*
    Create a Kotlin program where:
    You have separate normal functions for:
    Find Maximum Number in Array
    Find Minimum Number in Array
    Find Sum of Array
    Find Average of Array

    Create a Higher Order Function
    Create a function named: getArrayProcessor()
    that:
    takes a String parameter
    returns a function 
*/

//Array Processor Functions
fun findMaximum(arr: IntArray): Double
{
    var max = arr[0]
    for(value in arr)
        if(value > max) max = value
    
    return max.toDouble()
}

fun findMinimum(arr: IntArray): Double
{
    var min = arr[0]
    for(value in arr)
        if(value < min) min = value
    
    return min.toDouble()
}

fun calculateSum(arr: IntArray): Double
{
    var sum = 0
    for(value in arr)
        sum += value
    
    return sum.toDouble()
}

fun calculateAverage(arr: IntArray): Double = calculateSum(arr) / arr.size
fun invalidChoice(arr: IntArray): Double = -1.0

//Higher Order Function
fun getArrayProcessor(operation: String): (IntArray) -> Double
{
    when
    {
        operation == "max" -> return ::findMaximum
        operation == "min" -> return ::findMinimum
        operation == "sum" -> return ::calculateSum
        operation == "avg" -> return ::calculateAverage
        else -> return ::invalidChoice
    }
}

fun main()
{
    print("Enter Size of Array : ")
    val size = readln().trim().toIntOrNull()
    if(size == null || size <= 0)
    {
        println("Invalid Size")
        return
    }
    println()

    val numbers = IntArray(size)

    //Input Element
    for(i in numbers.indices)
    {
        while(true)
        {
            print("Enter Element ${i + 1} : ")
            val element = readln().trim().toIntOrNull()
            if(element == null)
            {
                println("Invalid Element! Try Again")
                continue
            }

            numbers[i] = element
            break
        }
    }
    println()

    println("\n--Array Operations--\n")

    println("1. Find Maximum (Max)")
    println("2. Find Minimum (Min)")
    println("3. Sum of all elements (Sum)")
    println("4. Calculate Average (Avg)")

    print("\nEnter your choice : ")
    val choice = readln().trim().lowercase()
    if(choice.isBlank())
    {
        println("Invalid Input")
        return
    }

    val getResult = getArrayProcessor(choice)
    val result = getResult(numbers)

    if(result == -1.0) println("Invalid Choice")
    else println("Result : $result")
}