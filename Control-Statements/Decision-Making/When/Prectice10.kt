fun main()
{
    //Q10th
    /*
        Write a Kotlin program that takes age as input
        and determines whether a person is eligible to vote
        using when without argument.

        Rules:
        If age is less than 0, print "Invalid Age".
        If age is less than 18, print "Not Eligible to Vote".
        If age is 18 or greater, print "Eligible to Vote".

        If the input is not a valid integer,
        print "Invalid Input".
     */

     print("Enter Age : ")
     var age = readln().toIntOrNull()
     if(age == null)
     {
        println("Invalid Input or Input is Empty")
        return
     }

     when
     {
        age < 0  -> println("Invalid Age!")
        age < 18 -> println("Not Eligible to Vote")
        else -> println("Eligible to Vote")
     }
}