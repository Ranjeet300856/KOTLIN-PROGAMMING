/*
    Question 4: Cricket Score Analyzer

    Given the scores:
    45, 78, 12, 99, 34, 78, 56, 12

    Perform the following:
    1. Print complete List.
    2. Print all scores using a loop.
    3. Find highest score.
    4. Find lowest score.
    5. Count occurrences of 78.
    6. Count occurrences of 12.
    7. Find first occurrence index of 99.
    8. Find last occurrence index of 12.
    9. Calculate total runs.
    10. Calculate average score.

    Do not use built-in functions for:
    max, min, sum, average, count, index search.
*/

fun main()
{
    val score = listOf(45, 78, 12, 99, 34, 78, 56, 12)

    println("All Score          : $score")

    print("All score using loop : ")
    for(value in score) print("$value ")

    var highest = score[0]
    var lowest = score[0]
    var count78 = 0
    var count12 = 0
    var lastIndex = - 1
    var firstIndex = -1
    var temp = score.size - 1
    var totalRun = 0.0

    for(i in score.indices)
    {
        val value = score[i]

        if(value > highest) highest = value
        if(value < lowest) lowest = value

        if(value == 78) count78++
        if(value == 12) count12++

        if(firstIndex == -1)
            if(value == 99) firstIndex = i
        
        if(lastIndex == -1)
        {
            if(score[temp] == 12)
                lastIndex = temp
        }

        totalRun += value
        temp--
    }

    println("\nHighest Score                  : $highest")
    println("Lowest Score                   : $lowest")
    println("Total 78                       : $count78")
    println("Total 12                       : $count12")
    println("First occurrence index of 99   : $firstIndex")
    println("Last occurrence index of 12    : $lastIndex")
    println("Total Runs                     : %.2f".format(totalRun))

    if(score.size > 0) println("Average     : %.2f".format(totalRun / score.size))
    else println("Division by zero is not allowed")
}