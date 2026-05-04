/*
    Write a Kotlin program that:

    Declares a regular string.
    Reverses the string without using any built-in reverse function.
    Prints:
    Original string
    Reversed string 
*/

fun main()
{
    //Input String
    print("Enter a String : ")
    val str = readln()
    if(str.isBlank())
    {
        println("Invalid Input")
        return
    }

    println("Original String : $str")

    //Reverse String
    var reversedStr = ""

    for(i in (str.length - 1) downTo 0)
    {
        reversedStr += str[i]
    }

    print("Reversed String : $reversedStr")
}