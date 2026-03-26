//Q4th
/*
    Write a Kotlin program that prints the following pattern:

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

    But skip printing the number 3 using the continue statement.
*/

fun main()
{
    for(i in 1..5)
    {
        for(j in 1..i)
        {
            if(j == 3)
            {
                continue
            }

            print("$j ")
        }

        println()
    }
}