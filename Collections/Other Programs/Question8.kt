//Create a Kotlin program to sort student marks using Collection Higher-Order Functions.
fun inputInteger(text: String): Int 
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    val totalStudents = inputInteger("The Number of Students")
    val marks = mutableListOf<Int>()
    for(i in 1..totalStudents)
    {
        while(true)
        {
            val input = inputInteger("Marks of Student $i")
            if(input < 0 || input > 100)
            {
                println("Invalid Marks! Try Again")
                continue
            }

            marks.add(input)
            break
        }
    }

    val ascendingOrder = marks.sorted()
    val descendingOrder = marks.sortedDescending()

    println("\n----- Original Marks -----")
    marks.forEach { println("$it ")}

    println("\n----- Ascending Order -----")
    ascendingOrder.forEach { println("$it ")}

    println("\n----- Descending Order -----")
    descendingOrder.forEach { println("$it ")}
}