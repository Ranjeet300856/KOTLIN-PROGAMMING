fun main()
{
    //Q4th
    /*
      Write a Kotlin program that takes an integer as input
      and determines whether the number is Even or Odd
      using when with argument. 
      If the input is not a valid integer,
      print "Invalid Input".
   */

   print("Enter Number : ")
   var number = readln().toIntOrNull()
   if(number == null)
   {
    println("Input is Empty or Input is not a valid integer!")
    return
   }

   when(number % 2)
   {
     0 -> println("Even Number")
     else -> println("Odd Number")
   }
}