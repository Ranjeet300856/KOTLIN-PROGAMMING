fun main()
{
    //Q14th
    /*
    Write a Kotlin program that takes temperature as input
    and categorizes the weather using when without argument.

    Rules:
    If temperature is greater than 40, print "Very Hot".
    If temperature is 30 or more, print "Hot".
    If temperature is 20 or more, print "Warm".
    If temperature is 10 or more, print "Cool".
    Otherwise, print "Cold".

    If the input is not a valid number,
    print "Invalid Input".
     */

     print("Enter Tamperature : ")
     var temp = readln().toIntOrNull()
     if(temp == null)
     {
        println("Input is Empty or Invalid Input!")
        return
     }

     when
     {
        temp > 40 -> println("Very Hot")
        temp >= 30 -> println("Hot")
        temp >= 20 -> println("Warm")
        temp >= 10 -> println("Cool")
        else -> println("Cold")
     }
}