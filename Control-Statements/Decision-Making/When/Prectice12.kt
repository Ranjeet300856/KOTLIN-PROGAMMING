fun main()
{
    //Q12th
    /*
     Write a Kotlin program that takes an integer as input
     and determines the type of number using when without argument.
     Rules:
     If the number is greater than 0 and even, print "Positive Even".
     If the number is greater than 0 and odd, print "Positive Odd".
     If the number is less than 0, print "Negative".
     Otherwise, print "Zero".
     If the input is not a valid integer,
     print "Invalid Input".
    */

    print("Entar a Number : ")
    var number = readln().toIntOrNull()
    if(number == null)
    {
        println("Input is Empty of Invalid Input")
        return
    }

    when
    {
        number%2 == 0 && number > 0 -> println("Positive Even")
        number%2 != 0 && number > 0 -> println("Positive Odd")
        number < 0 -> println("Negative")  
        else -> println("Zero")   
    }
}