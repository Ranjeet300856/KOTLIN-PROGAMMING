fun main()
{
    //Q1st
    /*
     Write a Kotlin program that takes a number from 1 to 5 
     and prints its corresponding word using when with argument.
     If the number is not between 1 and 5, print "Invalid Number".
     */

     print("Enter a Number Between 1 to 5 : ")
     var number = readln().toIntOrNull()
     if(number == null)
     {
        println("Invalid Input or Input is Empty!")
        return
     }

     when(number)
     {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")

        else -> println("Invalid Number!")
     }
}