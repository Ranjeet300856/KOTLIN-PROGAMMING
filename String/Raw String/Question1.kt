//Write a Kotlin program that takes a multi-line input from the user using Raw String and prints it exactly as entered.

fun main()
{
    print("Enter Raw String (Write End to Stop): ")
    val rawString = StringBuilder()
    while(true)
    {
        val line = readln()
        if(line.lowercase() == "end") break
        rawString.append(line).append("\n")
    }

    if(rawString.isEmpty())
    {
        println("String is Empty")
        return
    }
    print(rawString)
}