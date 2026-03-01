fun main()
{
    //Q22th
    /*
    Write a Kotlin program that takes temperature as input
    and assigns a weather category using when as expression.

    Rules:
    If temperature is greater than 40, assign "Very Hot".
    If temperature is 30 or more, assign "Hot".
    If temperature is 20 or more, assign "Warm".
    Otherwise, assign "Cold".

    Store the result in a variable and print it.

    If the input is not a valid integer,
    print "Invalid Input".
     */

     print("Enter Temperature : ")
     var temp = readln().toIntOrNull()
     if(temp == null)
     {
        println("Input is Empty or Invalid Input!")
        return
     }

     var tempType = when
     {
        temp >  40 -> "Very Hot"
        temp >= 30 -> "Hot"
        temp >= 20 -> "Warm"
        else -> "Cold" 
     }

     println("Temperature is $tempType")
}