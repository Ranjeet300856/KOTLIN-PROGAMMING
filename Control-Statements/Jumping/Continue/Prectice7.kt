//Q7th
/*
    Write a Kotlin program to print the following pattern:

    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5

    But skip printing numbers that are equal to the current row number using the continue statement. 
*/

fun main()
{
    for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i == j)
            {
                continue
            }

            print("$j ")
        }

        println()
    }
}