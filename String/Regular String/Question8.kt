/*
    Write a Kotlin program that:

    Takes a regular string input from the user.
    Removes all duplicate characters from the string. 
*/

fun main() 
{
    print("Enter a String : ")
    val input = readln()

    if(input.isBlank()) 
    {
        println("Invalid Input! Try Again")
        return
    }

    val str = input.replace("\\s".toRegex(), "").lowercase()
    var result = ""

    for(i in str.indices) 
    {
        var isDuplicate = false

        for(j in 0 until i) 
        {
            if(str[i] == str[j]) 
            {
                isDuplicate = true
                break
            }
        }

        if(!isDuplicate) result += str[i]
    }

    println("New String After Removing Duplicates : $result")
}