/*
    Create a Kotlin Extension Function for the List<Int> class named calculateAverageScore().
    The function should:
    1. Calculate the average of all numbers present in the list.
    2. Return the average as a Double value.
    3. Handle an empty list safely. 
*/

fun List<Int>.calculateAverageScore(): Double
{
    if(this.isEmpty()) return 0.0
    var sum = 0.0
    for(value in this) sum += value

    return sum / this.size
}

fun main()
{
    val numbers = listOf(40, 20, 30, 50, 10, 60)
    println("%.2f".format(numbers.calculateAverageScore()))
}