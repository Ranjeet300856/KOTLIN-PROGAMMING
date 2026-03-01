fun main()
{
    //Q18th
    /*
    Write a Kotlin program that takes an integer as input
    and classifies the number using when without argument.

    Rules:
    If number is less than 0, print "Negative".
    If number is equal to 0, print "Zero".
    If number is between 1 and 10 (inclusive), print "Small Positive".
    If number is between 11 and 100 (inclusive), print "Medium Positive".
    Otherwise, print "Large Positive".

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

     when
     {
        number < 0 -> println("Negative")
        number == 0 -> println("Zero")
        number in 0..10 -> println("Small Positive")
        number in 11..100 -> println("Medium Positive")
        else -> println("Large Positive")
     }
}