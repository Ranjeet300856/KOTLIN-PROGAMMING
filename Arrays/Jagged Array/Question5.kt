/*
    Kotlin Jagged Array Project #5
    Company Monthly Sales Report using Double Primitive Jagged Array
*/

//--------------- Input Salse Funcion ----------//
fun inputSalse(arr: Array<DoubleArray>)
{
    for(row in arr.indices)
    {
        println("Enter Agent ${row + 1} Salse: ")
        for(col in arr[row].indices)
        {
            while(true)
            {
                print("Enter Salse of Month ${col + 1} : ")
                val salse = readln().trim().toDoubleOrNull()
                if(salse == null || salse < 0)
                {
                    println("Invalid Salse! Try Again")
                    continue
                }

                arr[row][col] = salse
                break
            }
        }
        println()
    }
}

//--------------- Output Report Funcion ----------//
fun output(arr: Array<DoubleArray>)
{
    //Varibles Declare for Overall Dashboard
    var highestTotalSalse = 0.0
    var agentWithHighestTotalSalse = -1
    var lowestTotalSalse = 0.0
    var agentWithLowestTotalSalse = -1
    var companyGrandTotalSalse = 0.0
    var totalMonths = 0
    var highestSingleMonthSalse = 0.0

    println("\n ===== Company Monthly Sales Report ===== \n")

    for(row in arr.indices)
    {
        //Variables Declare For Each Agent
        var agentTotalSalse = 0.0
        var highestSalse = arr[row][0]
        var lowestSalse = arr[row][0]

        print("Agent ${row + 1} Sales: ")
        for(col in arr[row].indices)
        {
            val salse = arr[row][col]
            totalMonths++               //Count Total Months

            //Print All Salses
            print("%.2f\t".format(salse))

            //Sum of All Salse
            agentTotalSalse += salse
            companyGrandTotalSalse += salse

            //Find Highest and Lowest salse
            if(salse > highestSalse) highestSalse = salse
            if(salse < lowestSalse) lowestSalse = salse
        }

        //Calculate Average Salse
        val averageSalse =  agentTotalSalse / arr[row].size

        //Print Other Information For Each Agent
        println("\nTotal Sales       : %.2f".format(agentTotalSalse))
        println("Average Sales     : %.2f".format(averageSalse))
        println("Highest Sale      : %.2f".format(highestSalse))
        println("Lowest Sale       : %.2f".format(lowestSalse))

        //Performance
        if(averageSalse >= 80000.0) println("Performance       : EXCELLENT")
        else if(averageSalse >= 50000.0) println("Performance       : GOOD")
        else println("Performance       : LOW")
        println("\n")

        //-----Calculation for Overall Dashboard-----//

        //Calulate Highest and Lowest Salse
        if(agentTotalSalse > highestTotalSalse)
        {
            highestTotalSalse = agentTotalSalse
            agentWithHighestTotalSalse = row + 1
        }
        
        if(agentTotalSalse < lowestTotalSalse || lowestTotalSalse == 0.0)
        {
            lowestTotalSalse = agentTotalSalse
            agentWithLowestTotalSalse = row + 1
        }

        //Calculate Highest Single Months Salse
        if(highestSalse > highestSingleMonthSalse) highestSingleMonthSalse = highestSalse
    }

    val companyMonthlyAvg = companyGrandTotalSalse / totalMonths
    
    println("\n--------------------------------------------------\n")

    println("Agent with Highest Total Sales : Agent $agentWithHighestTotalSalse (%.2f)".format(highestTotalSalse))
    println("Agent with Lowest Total Sales  : Agent $agentWithLowestTotalSalse (%.2f)".format(lowestTotalSalse))
    println("Company Grand Total Sales      : %.2f".format(companyGrandTotalSalse))
    println("Company Average Monthly Sale   : %.2f".format(companyMonthlyAvg))
    println("Highest Single Month Sale      : %.2f".format(highestSingleMonthSalse))
}


//--------------- Main Funciton ---------------//
fun main()
{
    //Array Creartion
    var months: Int? = null
    val salseReport = Array(5) { row ->
        while(true)
        {
            print("Enter Total Months for Agent ${row + 1} : ")
            months = readln().trim().toIntOrNull()
            if(months == null || months <= 0)
            {
                print("Invalid Number of Months! Try Again\n")
                continue
            }

            break
        }

        DoubleArray(months)
    }
    println()

    inputSalse(salseReport)     //Input Salse For Each Agent
    output(salseReport)         //Print Each Agent Report
}