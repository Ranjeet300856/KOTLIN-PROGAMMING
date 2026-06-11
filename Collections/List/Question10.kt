/*
    Question 10: Student Marks Validation Report

    Marks:
    85, 92, -5, 76, 110,
    45, 67, 92, 0, 100

    Valid Range:
    0 to 100

    Requirements:
    1. Print complete List.
    2. Print all marks.
    3. Count valid marks.
    4. Count invalid marks.
    5. Print all invalid marks.
    6. Find highest valid mark.
    7. Find lowest valid mark.
    8. Calculate average of valid marks.
    9. Count Distinction, Pass, Fail.
    10. Determine whether data is valid.

    Do not use:
    filter(), count(),
    maxOrNull(), minOrNull(),
    average()
*/

fun main()
{
    val marks = listOf(85, 92, -5, 76, 110, 45, 67, 92, 0, 100)

    println("Marks : $marks")

    println("All Marks : ")
    for(value in marks) print("$value ")

    var countValidMarks = 0
    var countInvalidMarks = 0
    var highestValidMarks: Int? = null
    var lowestValidMarks: Int? = null
    var sum = 0.0

    var distinction = 0
    var pass = 0
    var fail = 0
    for(value in marks)
    {
        if(value >= 0 && value <= 100)
        {
            sum += value
            countValidMarks++
            if(highestValidMarks == null || value > highestValidMarks) highestValidMarks = value
            if(lowestValidMarks == null || value < lowestValidMarks) lowestValidMarks = value

            if(value >= 75) distinction++
            else if(value >= 33) pass++
            else fail++
        }
        else countInvalidMarks++
    }

    println("\nTotal valid marks     : $countValidMarks")
    println("Total invalid marks   : $countInvalidMarks")

    print("All invalid marks     : ")
    for(value in marks)
        if(value < 0 || value > 100) print("$value ")

    println("\nHighest valid marks : $highestValidMarks")
    println("HighestValidMarks   : $lowestValidMarks")

    val averageValidMarks = if(countValidMarks > 0) sum / countValidMarks else 0.0
    println("Average Marks       : %.2f".format(averageValidMarks))

    println("Total Distinction Students : $distinction")
    println("Total Pass Students        : $pass")
    println("Total Fail Students        : $fail")

    if(countInvalidMarks >= 1) println("\nInvalid Data")
    else println("Valid Data")
}