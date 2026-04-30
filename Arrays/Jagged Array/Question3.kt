/*
    Kotlin Jagged Array Project #3
    Hospital Patient Temperature Monitor using Nullable Jagged Array
*/


//--------------- Input Function ---------------//
fun inputTemperature(arr: Array<Array<Double?>>)
{
    for(row in arr.indices)
    {
        for(col in arr[row].indices)
        {
            while(true)
            {
                print("Enter Patient ${row + 1} Temperatue, Day ${col + 1} : ")
                val input = readln().trim()
                if(input.isEmpty())
                {
                    arr[row][col] = null
                    break
                }

                val temperatue = input.toDoubleOrNull()
                if(temperatue == null || temperatue !in 95.0..108.0)
                {
                    println("Invalid Temperature! Try Again")
                    continue
                }

                arr[row][col] = temperatue
                break
            } 
        }
        println()
    }
}


//--------------- Output Function ---------------//
fun output(arr: Array<Array<Double?>>)
{
    //Varibles Declare for Overall Dashboard
    var highestAverage: Double? = null
    var lowestAverage: Double? = null
    var totalMissing = 0
    var totalTemp = 0.0
    var totalValidTemp = 0

    var patientWithHighAvg: Int? = null
    var patientWithLowAvg: Int? = null

    println("\n===== Hospital Patient Temperature Monitor =====\n")

    for(row in arr.indices)
    {
        //--Variable Declare for Each Patient--//
        var x = false
        var totalSum = 0.0
        var validTemp = 0
        var missingReadings = 0
        var highestTemp: Double? = null
        var lowestTemp: Double? = null
        var averageTemp: Double? = null

        //--Output--//
        print("Patient ${row + 1} Records: ")
        for(col in arr[row].indices)
        {
            val value = arr[row][col]
            if(value == null)
            {
                print("MISSING  ")
                missingReadings++               //Count Missing Readings
                totalMissing++                  //Count Total Missing Readings
                continue
            }

            //Print Temperatures
            print("%.2f  ".format(value))
            x = true

            //Caluclate Sum of Temperature
            totalSum += value             
            validTemp++
            totalValidTemp++
            totalTemp += value

            //Calculate Highest and Lowest Temperature
            if(highestTemp == null || value > highestTemp) highestTemp = value
            if(lowestTemp == null || value < lowestTemp) lowestTemp = value
        }
        println()

        if(averageTemp == null)
            averageTemp = if(validTemp > 0) totalSum / validTemp else null     //Calulate Average

        println("Total Valid Sum   : %.2f".format(totalSum))        //Print Total Sum of Temperature

        //Average Status
        if(x) println("Average Temp      : %.2f".format(averageTemp))
        else println("Average Temp      : NO DATA")

        //Highest and Lowest Temperature Status
        if(x) println("Highest Temp      : %.2f".format(highestTemp))
        else println("Highest Temp      : NO DATA")

        if(x) println("Lowest Temp       : %.2f".format(lowestTemp))
        else println("Lowest Temp       : NO DATA")

        //Missing Readings Stauts
        println("Missing Readings  : $missingReadings")

        //Health Status
        if(missingReadings == arr[row].size) println("Health Status     : NO DATA")
        else if(averageTemp != null && averageTemp >= 100.4) println("Health Status     : FEVER")
        else println("Health Status     : NORMAL")

        println("\n")

        //Counting for Overall Dashboard
        if(highestAverage == null || (averageTemp != null && averageTemp > highestAverage))
        {
            highestAverage = averageTemp
            patientWithHighAvg = row + 1
        }

        if(lowestAverage == null || (averageTemp != null && averageTemp < lowestAverage))
        {
            lowestAverage = averageTemp
            patientWithLowAvg = row + 1
        }
    }

    val overallAvg = totalTemp / totalValidTemp

    println("--------------------------------------------------")
    println("\n===== Overall Dashboard =====\n")

    //Highest and Lowest Status
    if(highestAverage == null) println("Patient with Highest Average Temp : NO DATA")
    else println("Patient with Highest Average Temp : Patient $patientWithHighAvg (%.2f)".format(highestAverage))

    if(lowestAverage == null) println("Patient with Lowest Average Temp : NO DATA")
    else println("Patient with Lowest Average Temp  : Patient $patientWithLowAvg (%.2f)".format(lowestAverage))

    //Total Missing Readings Status
    println("Total Missing Readings : $totalMissing")

    //Overall Hospital Average Temp Status
    if(totalTemp == 0.0) println("Overall Hospital Average Temp   : NO DATA")
    else println("Overall Hospital Average Temp   : %.2f".format(overallAvg))
}


//--------------- Main Function ---------------//

fun main()
{
    //Array Cration

    var days: Int? = null
    val arr = Array(5) { row ->
        while(true)
        {
            print("Enter Days of Patient ${row + 1} : ")
            days = readln().trim().toIntOrNull()
            if(days == null || days <= 0)
            {
                println("Invalid Days! Try Again")
                continue
            }

            break
        }

        arrayOfNulls<Double>(days)
     }
     println()

     inputTemperature(arr)      //Input Temperatures for each patient
     output(arr)                //Print All Info
}