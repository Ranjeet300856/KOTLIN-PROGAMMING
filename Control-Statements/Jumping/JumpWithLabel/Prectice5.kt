//Q5th
/*
    Write a Kotlin program using nested loops from 1 to 5 for both i and j.
    Use a labeled outer loop and a boolean flag such that:
    If i == j, set a flag isEqualFound = true and continue the outer loop using continue with label
    If i + j == 7, terminate the outer loop completely using break with label

    After the loops:
    If isEqualFound is true → print "Equal Pair Found"
    Otherwise → print "No Equal Pair Found"
    Print all valid (i, j) pairs before termination in the format:
    i = ?, j = ? 
*/

fun main()
{
    var isEqualFound = false
    outer@ for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i + j == 7)
            {
                break@outer
            }

            if(i == j)
            {
                isEqualFound = true
                println("i = $i, j = $j")
                continue@outer
            }

            println("i = $i, j = $j")
        }
    }

    if(isEqualFound) println("Equal Pair Found")
    else println("No Equal Pair Found")
}