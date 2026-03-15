/*
Question 4: Power Calculator with Default Parameter

Write a Kotlin function calculatePower(base: Double, exponent: Int = 2)
that calculates base raised to the power of exponent and prints the result.

Demonstrate function calls using:
1. Default exponent
2. Passing both arguments
3. Named arguments
*/

fun calculatePower(base: Double, exponent: Int = 2)
{
    var result = 1.0
    for(i in 1..exponent)
    {
        result *= base
    }
    println("Result = $result")
}
fun main()
{
    calculatePower(5.0)
    calculatePower(2.0,3)
    calculatePower(base = 4.0, exponent = 3)
}