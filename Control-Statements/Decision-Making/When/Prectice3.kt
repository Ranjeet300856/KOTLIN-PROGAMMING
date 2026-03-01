fun main()
{
    /*
    Write a Kotlin program that takes a number from 1 to 7 as input
    and prints the corresponding day of the week using when with argument.
    If the number is not between 1 and 7,
    print "Invalid Day Number".
    */

    print("Enter a Number Between 1 to 7 : ")
    var number = readln().toIntOrNull()
    if(number == null)
    {
        println("Input is Empty or Invalid Input")
        return
    }

    when(number)
    {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid Day Number")
    }
}