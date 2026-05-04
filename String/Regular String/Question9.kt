/*
    Write a Kotlin program that:

    Takes a regular string input from the user.
    Finds the first non-repeating character in the string. 
*/

fun main() 
{

    print("Enter a String: ")
    val input = readln()
    if(input.isBlank()) 
    {
        println("Invalid Input")
        return
    }

    println("Original String : $input")

    val str = input.replace("\\s".toRegex(), "").lowercase()

    var found = false

    for(i in str.indices) 
    {
        var count = 0
        for(j in str.indices) 
        {
            if(str[i] == str[j])  count++
        }

        if(count == 1) 
        {
            println("First non-repeating character: ${str[i]}")
            found = true
            break
        }
    }

    if(!found)  println("No non-repeating character found")
}