fun square(n: Int): Int = n * n
fun main()
{
    //Q1st
    /*
    Write a Kotlin program that defines a Single Expression Function named square.
    The function should:
    Take one integer parameter n
    Return the square of the number
    */

    print("Enter a Number : ")
    val number = readln().trim().toIntOrNull()
    if(number == null) 
    {
        println("Number is Empty or Invalid Number!")
        return
    }

    println("Square of $number = ${square(number)}")
}