/*
    Question 9 — Sales Performance Analyzer (Advanced → Portfolio Level)
    Problem Statement
    Create a Kotlin program that analyzes a company's monthly sales performance using a Trailing Lambda that returns a value.

    Requirements
    Create a Higher Order Function named analyzeSales.
    The function should accept:
    A list of monthly sales (List<Double>)
    A lambda parameter that:
    Receives the sales list
    Returns a String
    The Higher Order Function must return the value returned by the lambda.
    Use Trailing Lambda Syntax while calling the function.

    Display:
    All Sales Values
    Total Sales
    Average Sales
    Highest Sales
    Lowest Sales
    Performance Status 
*/

fun analyzeSales(list: List<Double>, performanceStatus: (List<Double>) -> String): String = performanceStatus(list)

fun main()
{
    print("Enter number of total sales : ")
    val number = readln().trim().toIntOrNull()
    if(number == null || number <= 0)
    {
        println("Invalid Input")
        return
    }

    val inputSales = mutableListOf<Double>()

    for(i in 0 until number)
    {
        while(true)
        {
            print("Enter Salse Value ${i + 1} : ")
            val sales = readln().trim().toDoubleOrNull()
            if(sales == null || sales < 0)
            {
                println("Invalid Input")
                continue
            }

            inputSales.add(sales)
            break
        }
    }

    val salesList = inputSales.toList()
    
    var total = 0.0
    var highest = salesList[0]
    var lowest = salesList[0]

    for(value in salesList)
    {
        total += value
        if(value > highest) highest = value
        if(value < lowest) lowest = value
    }

    val average = if(salesList.size > 0) total / salesList.size else 0.0

    val performance = analyzeSales(salesList) {
        list: List<Double> ->

        when {
        average >= 100000 -> "Excellent"
        average >= 50000  -> "Good"
        average >= 20000  -> "Average"
        else -> "Poor"
        }
    }

    println("Sales Values       : $salesList")
    println("Total Sales        : %.2f".format(total))
    println("Average Sales      : %.2f".format(average))
    println("Highest Sales      : %.2f".format(highest))
    println("Lowest Sales       : %.2f".format(lowest))
    println("Performance Status : $performance")
}