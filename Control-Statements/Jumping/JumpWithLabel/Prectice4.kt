//Q4th
/*
    Write a Kotlin program using nested loops to print a pattern of numbers.
    Pattern logic:

    Outer loop runs from 1 to 5
    Inner loop runs from 1 to 5

    Use a labeled outer loop such that:
    If j > i, skip the current iteration of the outer loop using continue with label
    If i == 5 and j == 3, terminate the outer loop completely using break with label

    Print the values in the format:
    i = ?, j = ?
*/

fun main()
{
    outer@ for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i == 5 && j == 3)
            {
                break@outer
            }

            if(j > i)
            {
                continue@outer
            }

            println("i = $i, j = $j")
        }
    }
}