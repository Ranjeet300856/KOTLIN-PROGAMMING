/*
    Write a Kotlin program to create an array using arrayOf() 
    and search for a given element. If the element is found, print its index; otherwise, print "Element not found". 
*/

fun main()
{
    val arr = arrayOf(10,50,30,20,40,60)
    print("Enter Target : ")
    val target = readln().trim().toIntOrNull()
    if(target == null)
    {
        println("Invalid Input")
        return
    }

    var found = false
    for(i in 0 until arr.size)
    {
        if(arr[i] == target)
        {
            println("Element found at index = $i")
            found = true
            break
        }
    }

    if(!found) println("Element not found")
}
