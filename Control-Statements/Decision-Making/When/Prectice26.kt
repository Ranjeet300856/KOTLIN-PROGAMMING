fun main()
{
    //Q26th
    /*
    Write a Kotlin program that takes an integer as input
    and classifies the number using when as expression.

    Rules:
    If number is less than 0, assign "Negative".
    If number is equal to 0, assign "Zero".
    If number is between 1 and 10 (inclusive), assign "Small Positive".
    If number is between 11 and 100 (inclusive), assign "Medium Positive".
    Otherwise, assign "Large Positive".

    Store the result in a variable and print it.

    If the input is not a valid integer,
    print "Invalid Input".
     */

     print("Enter Number : ")
     var number = readln().toIntOrNull()
     if(number == null)
     {
        println("Input is Empty or Invalid Input!")
        return
     }

     var isNumber = when
     {
        number < 0 -> "Negative"
        number == 0 -> "Zero"
        number in 1..10 -> "Small Positive"
        number in 11..100 -> "Medium Positive"
        else -> "Large Positive"
     }

     println("Number is $isNumber")
}