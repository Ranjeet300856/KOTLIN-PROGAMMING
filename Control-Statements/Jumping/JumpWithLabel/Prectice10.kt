//Q10th
/*
    Write a Kotlin program to process users in multiple groups using nested loops.

    There are 5 groups (1 to 5) and each group has 5 users (1 to 5).
    Use a labeled outer loop.
    Conditions:
    If the group number is even, skip the entire group using labeled continue.
    If the user number is 3, skip only that user using normal continue.

    Print the remaining users in the format:
    Processing Group X - User Y 
*/

fun main()
{
    outer@ for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i % 2 == 0) continue@outer
            if(j == 3) continue
            println("Processing Group $i - User $j")
        }
    }
}