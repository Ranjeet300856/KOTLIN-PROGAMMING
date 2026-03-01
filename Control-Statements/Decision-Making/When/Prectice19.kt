fun main()
{
    //Q19th
    /*
    Write a Kotlin program that takes an integer as input
    and converts the number to its word form using when as expression.

    Rules:
    1 -> "One"
    2 -> "Two"
    3 -> "Three"
    Any other number -> "Invalid Number"

    Store the result in a variable and print it.

    If the input is not a valid integer,
    print "Invalid Input".
     */

     print("Enter a Number (1 - 3) : ")
     var number = readln().toIntOrNull()
     if(number == null)
     {
        println("Input is Empty or Invalid Input!")
        return
     }

     var numberName = when(number)
     {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Invalid Number!"
     }

     println(numberName)
}