package mathutils

fun square(number: Int): Int = number * number

fun cube(number: Int): Int = number * number * number

fun factorial(number: Int): Long
{
    var result: Long = 1
    for(i in 1..number) 
        result *= i
    
    return result
}