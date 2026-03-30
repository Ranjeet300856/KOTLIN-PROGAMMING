//Q2nd
/*
    Write a Kotlin program using nested loops to print numbers from 1 to 5 for both i and j.
    Use a labeled loop such that:
    When j == 3, skip the current iteration of the outer loop using continue with label.
    Print the values in the format:
    i = ?, j = ? 
*/

fun main()
{
    outer@ for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(j == 3)
            {
                continue@outer
            }

            println("i = $i, j = $j")
        }
    }
}