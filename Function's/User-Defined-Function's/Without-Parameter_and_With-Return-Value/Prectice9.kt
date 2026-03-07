import kotlin.math.max
fun getLargestNumber(): Int
{
    val a = 45
    val b = 78
    val c = 62
    val largest = maxOf(a,b,c)
    return largest
}
fun main()
{
    //Q9th
    /*
    Write a Kotlin program that defines a function getLargestNumber() which takes no parameters but returns the largest number among three numbers.
    Inside the function define:
    a = 45
    b = 78
    c = 62
    The function should determine the largest number among these three numbers and return it.
    The program should call this function from main() and print the returned value.
    */

    val largestNumber = getLargestNumber()
    println("Largest Number = $largestNumber")
}