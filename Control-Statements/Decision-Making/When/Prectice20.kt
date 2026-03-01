fun main()
{
    //Q20th
    /*
    Write a Kotlin program that takes an integer as input
    and determines whether the number is even or odd
    using when as expression.

    Rules:
    If the number is even, assign true.
    If the number is odd, assign false.

    Store the result in a Boolean variable and print it.

    If the input is not a valid integer,
    print "Invalid Input".
     */

     print("Enter a Number : ")
     var number = readln().toIntOrNull()
     if(number == null)
     {
        println("Input is Empty or Invalid Input!")
        return
     }

     var result = when(number % 2)
     {
        0 -> true
        else -> false
     }

     if(result) println("Even Number")
     else println("Odd Number")
}