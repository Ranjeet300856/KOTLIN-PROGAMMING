//Q1st
/*
    Write a Kotlin program that prints numbers from 1 to 10.
    But skip all numbers that are divisible by 3 using the continue statement. 
*/

fun main()
{
    for(i in 1..10)
    {
        if(i % 3 == 0)
        {
            continue
        }
        
        print("$i ")
    }
}