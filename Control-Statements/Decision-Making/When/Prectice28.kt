fun main()
{
    //Q28th
    /*
    Write a Kotlin program that takes an integer as input
    and uses when as expression with multi-line blocks.

    Rules:
    If number is 1:
    - Print "Processing 1"
    - Return "One"

    If number is 2:
    - Print "Processing 2"
    - Return "Two"

    Otherwise:
    - Print "Unknown Number"
    - Return "Other"

    Store the result in a variable and print it.
    If the input is not a valid integer,
    print "Invalid Input".
     */

     print("Enter a Number (1 - 2) : ")
     var number = readln().toIntOrNull()
     if(number == null)
     {
        println("Input is Empty or Invali Input!")
        return
     }

     var numberName = when(number)
     {
        1 -> 
        {
            println("Processing 1")
            "One"
        }

        2 ->
        {
            println("Processing 2")
            "Two"
        }

        else -> 
        {
            println("Unknown Number!")
            "Other"
        }
     }

     println(numberName)
}