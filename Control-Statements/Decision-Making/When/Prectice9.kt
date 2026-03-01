fun main()
{
    //Q9th
    /* 
    Write a Kotlin program that takes an integer as input
    and determines whether the number is Positive, Negative, or Zero
    using when without argument.
    */

    print("Enter Number : ")
    var number = readln().toIntOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input")
        return
    }

    when
    {
        number < 0  -> println("Negative")
        number > 0  -> println("Positive")
        else -> println("Zero")
    }
}