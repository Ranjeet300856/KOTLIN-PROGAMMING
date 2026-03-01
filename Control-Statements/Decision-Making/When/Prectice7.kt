fun main()
{
    //Q7th
    /*
     Write a Kotlin program that takes a traffic signal color as input
    ("Red", "Yellow", "Green")
    and prints the corresponding action using when with argument.
    If the input does not match any of these colors,
    print "Invalid Signal".
    If the input is empty,
    print "Invalid Input". 
    */

    print("Enter Traffic Signal : ")
    var trafficSignal = readln()
    if(trafficSignal.isBlank())
    {
        println("Input is Empty or Invalid Input!")
        return
    }

    var normalized = trafficSignal.trim().lowercase()

    when(normalized)
    {
        "red"    -> println("Stop")
        "yellow" -> println("Ready")
        "green" -> println("Go")
        else -> println("Invalid Signal!")
    }
}