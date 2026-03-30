//Q8th
/*
    Write a Kotlin program using nested loops from 1 to 5 for both i and j.
    Use a labeled outer loop such that:
    If i is even, skip the entire outer loop iteration using continue with label
    If j is divisible by 3, skip only the current inner loop iteration (normal continue)
    If i == 5 and j == 4, terminate the outer loop completely using break with label

    Print the values in the format:
    i = ?, j = ? 
*/

fun main()
{
    outer@ for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i == 5 && j == 4) break@outer
            if(i % 2 == 0) continue@outer
            if(j % 3 == 0) continue

            println("i = $i, j = $j")
        }
    }
}