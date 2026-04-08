/*
    Write a Kotlin program to:
    Take an integer n as input (size of array)
    Create an array of size n using Array(){}
    Initialize all elements with 0
    Then take n user inputs and store them in the array
    Print all elements of the array 
*/

fun main()
{
    print("Enter Size of Array : ")
    val size = readln().trim().toIntOrNull()
    if(size == null || size <= 0)
    {
        println("Invalid Size")
        return
    }

    val arr = Array(size) { 0 }
    for(i in arr.indices)
    {
        while(true) 
        {
            print("Enter your Element ${i + 1} : ")
            val value = readln().trim().toIntOrNull()
            if(value != null) 
            {
                arr[i] = value
                break
            } 
            else println("Invalid Element, try again!")
        }
    }

    print("Your Array is : ")
    for(value in arr) print("$value ")
}