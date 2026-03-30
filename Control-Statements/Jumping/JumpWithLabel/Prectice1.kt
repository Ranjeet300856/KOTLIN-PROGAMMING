//Q1st
/*
    Write a Kotlin program using nested loops to print numbers from 1 to 5 for both i and j.
    Use a labeled loop such that:
    When i == 3 and j == 2, terminate the outer loop completely using break with label.
    Print the values in the format:
    i = ?, j = ? 
*/

fun main()
{
    outer@ for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i == 3 && j == 2)
            {
                break@outer
            }
            
            println("i = $i, j = $j")
        }

        println()
    }
}