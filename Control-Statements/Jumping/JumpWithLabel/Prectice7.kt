//Q7th
/*
    Write a Kotlin program using nested loops from 1 to 5 for both i and j.
    Use a labeled outer loop such that:
    If i == 3, skip the entire iteration of the outer loop using continue with label
    If i == 4 and j == 4, terminate the outer loop completely using break with label
    If j == 2, skip only the current inner loop iteration (normal continue, no label)

    Print the values in the format:
    i = ?, j = ? 
*/

fun main()
{
    outer@ for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i == 3) continue@outer
            if(i == 4 && j == 4) break@outer
            if(j == 2) continue

            println("i = $i, j = $j")
        }
    }
}