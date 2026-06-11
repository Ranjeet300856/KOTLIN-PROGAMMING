/*
    Question 6: Temperature Report Analyzer

    Temperatures:
    32, 35, 28, 40, 40,
    25, 30, 42, 28, 35

    Requirements:
    1. Print complete List.
    2. Print all temperatures.
    3. Find highest temperature.
    4. Find lowest temperature.
    5. Count temperatures > 35.
    6. Count temperatures < 30.
    7. Count occurrences of 40.
    8. Find first occurrence index of 28.
    9. Find last occurrence index of 35.
    10. Calculate average temperature.
    11. Print temperatures above average.
    12. Print temperatures below average.

    Do not use:
    maxOrNull(), minOrNull(), average(),
    count(), indexOf(), lastIndexOf(), filter()
*/

fun main()
{
    val temperature = listOf(32, 35, 28, 40, 40, 25, 30, 42, 28, 35)

    println("Temperature                     : $temperature")
    print("Temperature printing using loop   : ")
    for(temp in temperature) print("$temp ")

    var highestTemp = temperature[0]
    var lowestTemp = temperature[0]
    var countMoreThan35 = 0
    var countLessThan30 = 0
    var count40 = 0
    var firstIndexOf28 = -1
    var lastIndexOf35 = -1
    var sum = 0.0

    for(i in temperature.indices)
    {
        val value = temperature[i]
        sum += value

        if(value > highestTemp) highestTemp = value
        if(value < lowestTemp) lowestTemp = value

        if(value > 35) countMoreThan35++
        if(value < 30) countLessThan30++

        if(value == 40) count40++

        if(firstIndexOf28 == -1)
            if(value == 28) firstIndexOf28 = i 
        
        if(value == 35) lastIndexOf35 = i
    }

    println("\nHighest Temperature           : $highestTemp")
    println("Lowest Temperature            : $lowestTemp")
    println("CountTemperature more than 35 : $countMoreThan35")
    println("CountTemperature less than 30 : $countLessThan30")
    println("Total Temperature (40)        : $count40")
    println("First Index Of 28             : $firstIndexOf28")
    println("Last Index Of 35              : $lastIndexOf35")

    val averageTemp = if(temperature.size > 0) sum / temperature.size else 0.0
    println("Average Temperature           : %.2f".format(averageTemp))

    print("\nTemperature Above Average : ")
    for(temp in temperature)
        if(temp > averageTemp) print("$temp ")
    
    print("\nTemperature Below Average : ")
    for(temp in temperature)
        if(temp < averageTemp) print("$temp ")
}