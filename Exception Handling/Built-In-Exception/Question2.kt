//Write a Kotlin program that asks the user to enter a numeric string and converts it into an Int.
fun main()
{
    print("Enter a numeric string : ")
    val input = readln().trim()
    if(input.isBlank())
    {
        println("Invalid Input!")
        return
    }

    try {
        val integer = input.toInt()
        println("Converted number : $integer")
    }
    catch(e: NumberFormatException) {
        println("Error: Invalid integer format.")
    }

    println("Conversion process completed.")
}