fun getSquare(): Int
{
    return 7 * 7
}
fun main()
{
    //Q2nd
    /*
    Write a Kotlin program that defines a function getSquare() which takes no parameters but returns the square of a fixed number.
    The fixed number inside the function should be 7.
    The program should call this function from main() and print the returned result.

    Requirements
    The function must not take any parameters.
    Inside the function, define a number 7.
    Calculate the square of the number.
    The function must return the calculated result.
    Call the function inside main() and print the returned value.
    */

    val square = getSquare()
    println("Square of 7 = $square")
}