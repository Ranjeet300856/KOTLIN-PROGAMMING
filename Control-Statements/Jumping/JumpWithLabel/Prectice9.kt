//Q9th
/*
    Write a Kotlin program using nested loops from 1 to 5 for both i and j.
    Use a labeled outer loop such that:
    If i == 2, skip the entire outer loop iteration using continue with label
    If j == 4, skip only the current inner loop iteration (normal continue)
    If i * j == 12, terminate the outer loop completely using break with label
    If i + j == 6, print "Special Pair Found" before continuing execution

    Print the values in the format:
    i = ?, j = ?
*/

fun main()
{
    outer@ for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i + j == 6) println("Special Pair Found")
            if(i == 2) continue@outer
            if(i * j == 12) break@outer
            if(j == 4) continue

            println("i = $i, j = $j")
        }
    }
}