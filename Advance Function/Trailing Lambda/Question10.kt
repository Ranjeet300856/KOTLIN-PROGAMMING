/*
    Question 10 — Student Result Analytics System (Final Challenge)
    Problem Statement
    Create a Kotlin program that analyzes student exam results using a Trailing Lambda and a MutableMap.
    This is the final challenge of the Trailing Lambda practice series. 
*/

fun analyzeExamResults(
    studentData: MutableMap<String, Int>, 
    resultStatus: (MutableMap<String, Int>) -> String
): String = resultStatus(studentData)

fun main()
{
    print("Enter Number of Students : ")
    val number = readln().trim().toIntOrNull()
    if(number == null || number <= 0)
    {
        println("Invalid Input")
        return
    }

    val studentData = mutableMapOf<String, Int>()
    for(i in 0 until number)
    {
        while(true)
        {
            print("Enter Student ${i + 1} Name  : ")
            val studentName = readln().trim()
            if(studentName.isBlank() || !studentName.all { it.isLetter() || it.isWhitespace()})
            {
                println("Invalid Student Name! Try Again")
                continue
            }

            print("Enter Student ${i + 1} Marks : ")
            val studentMarks = readln().trim().toIntOrNull()
            if(studentMarks == null || studentMarks < 0 || studentMarks > 100)
            {
                println("Invalid Student Marks! Try Again")
                continue
            }

            studentData[studentName] = studentMarks
            break
        }
    }

     println("\nStudent Records    : $studentData")

     var totalMarks = 0
     var passedCount = 0
     var failedCount = 0
     var highestMarks: Int? = null
     var lowestMarks: Int? = null
     var topper: String? = null
     var lowestScorer: String? = null

     for((key, value) in studentData)
     {
        totalMarks += value
        if(value >= 40) passedCount++
        else failedCount++

        if(highestMarks == null || value > highestMarks)
        {
            highestMarks = value
            topper = key
        }

        if(lowestMarks == null || value < lowestMarks)
        {
            lowestMarks = value
            lowestScorer = key
        }
     }

     val averageMarks = if(studentData.size > 0) totalMarks.toDouble() / studentData.size else 0.0

     println("\nTotal Students     : ${studentData.size}")
     println("Total Marks        : $totalMarks")
     println("Average Marks      : %.2f".format(averageMarks))

     println("\nHighest Scorer     : $topper ($highestMarks)")
     println("Lowest Scorer      : $lowestScorer ($lowestMarks)")

     println("\nPassed Students    : $passedCount")
     println("Failed Students    : $failedCount")

     val resultsStatus = analyzeExamResults(studentData) {
        studentsInfo: MutableMap<String, Int> ->

        var sum = 0
        for(value in studentsInfo.values) sum += value

        val average = if(studentsInfo.size > 0) sum.toDouble() / studentsInfo.size else 0.0
        when {
            average >= 80 -> "Excellent Performance"
            average >= 60 -> "Good Performance"
            average >= 40 -> "Average Performance"
            else -> "Poor Performance"
        }
     }

     println("\nResult Status      : $resultsStatus")
}