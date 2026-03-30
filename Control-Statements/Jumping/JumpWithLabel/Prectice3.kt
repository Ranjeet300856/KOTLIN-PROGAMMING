//Q3rd
/*
    Write a Kotlin program using nested loops from 1 to 5 for both i and j.
    Use a labeled outer loop such that:
    If i == 2 and j == 2, skip the current iteration of the outer loop using continue with label.
    If i == 4 and j == 1, terminate the outer loop completely using break with label.

    Print the values in the format:
    i = ?, j = ? 
*/

fun main()
{
    outer@ for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i == 4 && j == 1)
            {
                break@outer
            }

            if(i == 2 && j == 2)
            {
                continue@outer
            }

            println("i = $i, j = $j")
        }
    }
}