//Create a Kotlin program to analyze daily expenses using Collection Higher-Order Functions.
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

fun inputDouble(text: String): Double
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toDoubleOrNull()
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
    val totalExpenses = inputInteger("The Number of Expenses")
    val expenses = mutableListOf<Double>()
    for(i in 1..totalExpenses)
    {
        val inputAmount = inputDouble("Expense Amount of $i")
        expenses.add(inputAmount)
    }

    val countResult = expenses.count { it >= 500.0 }
    val totalExpensesSum = expenses.sumOf { it }
    val minExpenses = expenses.minOrNull()
    val maxExpenses = expenses.maxOrNull()
    expenses.forEachIndexed {
        index, value ->
        println("Expenses ${index + 1} : %.2f".format(value))
    }

    println("\n----- Expense Summary -----")
    println("Total Expenses       : ${expenses.size}")
    println("Expenses >= 500      : $countResult")
    println("Total Amount         : %.2f".format(totalExpensesSum))
    println("Lowest Expense       : %.2f".format(minExpenses))
    println("Highest Expense      : %.2f".format(maxExpenses))
}