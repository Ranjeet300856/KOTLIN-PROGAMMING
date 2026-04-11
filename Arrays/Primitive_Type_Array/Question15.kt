/*
    Write a Kotlin program to create an integer array of size n using IntArray() {} such that:
    arr[i] = ∣i−(n−1−i)∣
    (Each element is the absolute difference between the index and its mirror index)

    Then:
    Print the array.
    Check whether the array is palindromic (same forward and backward).
    Print "Palindrome" or "Not Palindrome". 
*/

import kotlin.math.abs
fun main()
{
    print("Enter Size of Array : ")
    val n = readln().trim().toIntOrNull()

    //Input Validation
    if(n == null || n <= 0)
    {
        print("Invalid Input")
        return
    }

    //Array Creation
    val arr = IntArray(n) { i -> abs(i - (n - 1 - i)) }

    //Check Palindromic Array
    var start = 0
    var end = arr.size - 1
    var isPalindrome = true
    while(start < end)
    {
        if(arr[start] != arr[end])
        {
            isPalindrome = false
            break
        }
        start++
        end--
    }

    //Output
    print("Array : ")
    for(value in arr) print("$value ")
    println()

    if(isPalindrome) println("Palindrome")
    else println("Not Palindrome")
}