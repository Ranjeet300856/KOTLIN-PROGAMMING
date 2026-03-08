fun findMaximum(a: Int, b: Int): Int
{
    if(a > b) return a
    else return b
}
fun main()
{
    //Q6th
    /*
    Write a Kotlin program that defines a function findMaximum(a: Int, b: Int)
    which takes two integers as parameters and returns the larger number.
    The program should call this function from main() and print the returned result.
    */

    print("Enter 1st Number : ")
    val number1 = readln().trim().toIntOrNull()
    print("Enter 2nd Number : ")
    val number2 = readln().trim().toIntOrNull()
    if(number1 == null || number2 == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    val max = findMaximum(number1, number2)
    println("Maximum Number = $max")
}