/* 
    Write a Kotlin program to create a DoubleArray of size n using DoubleArray() {} such that:
    arr[i] = 1.5×(i+1)
    Each element increases by 1.5

    Then:
    Print the array with 2 decimal places.
    Find and print the sum of all elements.
    Find and print the average of all elements.
*/

fun main()
{
    print("Enter Size of Array : ")
    val n = readln().trim().toIntOrNull()
    
    //Input Validation
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    //Array Creation
    val arr = DoubleArray(n) { i -> 1.5 * (i + 1) }

    //Calculate Sum and Average
    var sum = 0.0
    for(value in arr) sum += value
    val average = sum / n

    //Output
    print("Array : ")
    for(value in arr) print("%.2f".format(value) + " ")
    println()

    println("Sum : %.2f".format(sum))
    println("Average : %.2f".format(average))
}