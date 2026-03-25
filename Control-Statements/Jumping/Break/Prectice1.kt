//Q1st
/*
    Write a Kotlin program to print numbers from 1 to 10.
    Stop the loop when the number becomes 5 using break. 
*/

fun main()
{
    for(i in 1..10)
    {
        if(i == 5) break
        print("$i ")
    }
}