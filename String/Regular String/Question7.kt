/*
    Write a Kotlin program that:

    Takes a regular string input from the user.
    Counts the frequency of each character in the string.

    Conditions:
    Ignore spaces
    Case-insensitive (A = a)
    Prints:
    Original string
    Each character with its frequency 
*/

fun main()
{
    print("Enter a String : ")
    val str = readln()
    if(str.isEmpty())
    {
        println("Invalid Input")
        return
    }

    val cleanedStr = str.replace(" ", "").lowercase()

    //Count Frequency
    var isVisited = BooleanArray(str.length)
    for(i in cleanedStr.indices)
    {
        if(isVisited[i]) continue
        var count = 1
        for(j in i + 1 until cleanedStr.length)
        {
            if(cleanedStr[i] == cleanedStr[j])
            {
                count++
                isVisited[j] = true
            }
        }

        println("${cleanedStr[i]} -> $count")
    }
}