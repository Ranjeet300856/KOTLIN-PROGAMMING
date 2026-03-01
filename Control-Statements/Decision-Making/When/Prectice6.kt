fun main()
{
    //Q6th
    /*
     Write a Kotlin program that takes a month number (1–12) as input
     and prints the corresponding month name using when with argument
     If the number is not between 1 and 12,
     print "Invalid Month Number".
     If the input is not a valid integer,
     print "Invalid Input".
   */

   print("Enter Month Number (1 - 12) : ")
   var monthNumber = readln().toIntOrNull()
   if(monthNumber == null)
   {
    println("Input is Empty or Invalid Input!")
    return
   }

   when(monthNumber)
   {
    1  ->  println("January")
    2  ->  println("February")
    3  ->  println("March")
    4  ->  println("April")
    5  ->  println("May")
    6  ->  println("June")
    7  ->  println("July")
    8  ->  println("August")
    9  ->  println("September")
    10 ->  println("October")
    11 ->  println("November")
    12 ->  println("December")

    else -> println("Invalid Month Number")
   }
}