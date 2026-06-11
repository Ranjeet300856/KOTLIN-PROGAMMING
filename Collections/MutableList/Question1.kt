/*
    Question 1: Student Marks Validation Report
    Problem Statement

    Create a Kotlin program that manages a student's marks record using a MutableList<Int>.

    You are given the following marks:
    85, 92, -5, 76, 110, 45, 67, 92, 0, 100

    Valid Marks Range
    0 to 100 (inclusive)

    Requirements
    Store all marks in a MutableList<Int>.
    Print the complete list.
    Print all valid marks only.
    Print all invalid marks only.

    Count:
    Total Marks Entered
    Total Valid Marks
    Total Invalid Marks

    Calculate:
    Sum of Valid Marks
    Average of Valid Marks
    Find and print:
    Highest Valid Mark
    Lowest Valid Mark

    Check whether the mark 92 exists in the list.
    Print the index of the first occurrence of 92.
    Create a new MutableList containing only valid marks and print it.
*/

fun main()
{
    val marks = mutableListOf(85, 92, -5, 76, 110, 45, 67, 92, 0, 100)

    println("Marks : $marks")

    //Counting and Calculation
    var totalMarks = marks.size
    var validMarks = 0
    var invalidMarks = 0
    var sum = 0.0
    var highestValidMarks: Int? = null
    var lowestValidMarks: Int? = null

    for(value in marks)
    {
        if(value >= 0 && value <= 100)
        {
            validMarks++
            sum += value

            if(highestValidMarks == null || highestValidMarks < value) highestValidMarks = value
            if(lowestValidMarks == null || lowestValidMarks > value) lowestValidMarks = value
        }
        else invalidMarks++
    }

    print("\nAll valid marks   : ")
    for(value in marks)
        if(value in 0..100) print("$value ")
    
    print("\nAll invalid marks : ")
    for(value in marks)
        if(value !in 0..100) print("$value ")
    
    println("\n\nTotal Marks         : $totalMarks")
    println("Total valid marks   : $validMarks")
    println("Total invalid marks : $invalidMarks")

    println("\n\nSum of valid marks     : %.2f".format(sum))
    
    val average = if(validMarks > 0) sum / validMarks else 0.0
    println("Average of valid marks : %.2f".format(average))

    println("\n\nHighest valid marks : $highestValidMarks")
    println("Lowest valid marks  : $lowestValidMarks")

    if(marks.contains(92)) println("\n\n92 is exists in the list")
    else println("92 is not exists in the list")

    println("First Index of ${92} is ${marks.indexOf(92)}")

    val onlyValidMarks = mutableListOf<Int>()
    for(value in marks)
        if(value in 0..100) onlyValidMarks.add(value)

    println("New marks list : $onlyValidMarks")
}