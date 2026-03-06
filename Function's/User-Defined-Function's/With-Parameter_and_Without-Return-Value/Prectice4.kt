fun checkEvenOdd(num: Int)
{
    if(num%2 == 0) println("Even Number")
    else println("Odd Number")
}
fun main()
{
    //Q4th
    /*
    Write a Kotlin program that defines a function checkEvenOdd(num: Int) which prints whether the given number is Even or Odd.
    */

    print("Enter a Number : ")
    var number = readln().toIntOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    checkEvenOdd(number)
}