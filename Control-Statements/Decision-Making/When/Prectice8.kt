fun main()
{
    //Q8th
    /*
        Write a Kotlin program that takes a number as input
        and checks whether the number belongs to the Odd Group
        or Even Group using when with argument.

        Group Rules:
        1, 3, 5  -> Odd Group
        2, 4, 6  -> Even Group

        If the number does not belong to these values,
        print "Other Number".

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

    when(number)
    {
        1,3,5 -> println("Odd Group")
        2,4,6 -> println("Even Group")
        else  -> println("Other Number")
    }
}