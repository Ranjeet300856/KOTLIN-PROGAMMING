fun printSquare(num: Int)
{
    var square = num * num
    println("Square of $num = $square")
}
fun main()
{
    //Q2nd
    /*
    Write a Kotlin program that defines a function printSquare(num: Int) which prints the square of the given number.
    Example:
    Square of 6 = 36
     */

     print("Enter a Number to Find Square : ")
     var number = readln().toIntOrNull()
     if(number == null)
     {
         println("Input is Empty or Invalid Input!")
         return
     }    
     printSquare(number)
}