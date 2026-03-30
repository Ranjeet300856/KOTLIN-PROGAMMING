//Q6th
/*
    Write a Kotlin program using nested loops from 1 to 5 for both i and j.
    Use a labeled outer loop such that:
    If j is even, skip the current iteration of the outer loop using continue with label
    If i == 5 and j == 5, terminate the outer loop completely using break with label

    Only print the pairs where j is odd (1, 3, 5) before termination
    Print the values in the format:
    i = ?, j = ? 
*/

fun main()
{
    outer@ for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(j % 2 == 0)
            {
                continue@outer
            }

            if(i == 5 && j == 5)
            {
                println("i = $i, j = $j")
                break@outer
            }

            println("i = $i, j = $j")
        }
    }
}