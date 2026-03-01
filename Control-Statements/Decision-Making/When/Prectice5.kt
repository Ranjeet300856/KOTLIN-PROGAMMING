fun main()
{
    //Q5th
    /*
      Write a Kotlin program that takes marks as input
      and prints the corresponding grade using when with argument.
      Grade Rules (Exact Match Version):
      If the input marks do not match any of these values,
      print "Fail".
      If the input is not a valid integer,
      print "Invalid Input".
     */

     print("Enter Marks Between 0 - 100 : ")
     var marks = readln().toIntOrNull()
     if(marks == null)
     {
        println("Input is Empty or Invalid Input!")
        return
     }
     if(marks < 0 || marks > 100)
     {
        println("Invalid Marks!")
        return
     }

     when(marks)
     {
        in 90..100 -> println("A Grade")
        in 75..89 -> println("B Grade")
        in 60..74 -> println("C Grade")
        else -> println("Fail!")
     }
}