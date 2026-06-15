/*
    Question 10 — Student Result Analytics System (Final Challenge)
    Problem Statement
    Create a Kotlin program that analyzes student exam results using a MutableMap.

    The program should store:
    Key = Student Name (String)
    Value = Marks (Int) 
*/

fun countPassedStudent(analyzesExamResult: MutableMap<String, Int>): Int
{
    var passedStudent = 0
    for(value in analyzesExamResult.values)
        if(value >= 75) passedStudent++
    
    return passedStudent
}

fun countFailedStudent(analyzesExamResult: MutableMap<String, Int>): Int
{
    var failedStudent = 0
    for(value in analyzesExamResult.values)
        if(value < 75) failedStudent++
    
    return failedStudent
}

fun main()
{
    val analyzesExamResult = mutableMapOf<String, Int>()
    analyzesExamResult.put("Ranjeet", 85)
    analyzesExamResult.put("Mohit", 72)
    analyzesExamResult.put("Aman", 91)
    analyzesExamResult.put("Rahul", 67)
    analyzesExamResult.put("Neha", 88)

    var highestMarks: Int? = null
    var lowestMarks: Int? = null
    var topper: String? = null
    var sum = 0
    for((key, value) in analyzesExamResult)
    {
        sum += value
        
        if(highestMarks == null || value > highestMarks)
        {
            highestMarks = value
            topper = key
        }
        if(lowestMarks == null || value < lowestMarks) lowestMarks = value
    }

    val averageMarks = if(analyzesExamResult.size > 0) sum.toDouble() / analyzesExamResult.size else 0.0

    println("Highest Marks : $highestMarks")
    println("Lowest Marks  : $lowestMarks")
    println("Average Marks : %.2f".format(averageMarks))

    println("\nTopper : $topper")
    println("Marks  : $highestMarks")

    println("\nPassed Students : ${countPassedStudent(analyzesExamResult)}")
    println("Failed Students : ${countFailedStudent(analyzesExamResult)}")

    println("\nFinal Result:")
    for(entry in analyzesExamResult.entries)
    {
        val name = entry.key
        val marks = entry.value

        println("Student Name : $name")
        println("Marks        : $marks")

        val status = if(marks >= 75) "Pass" else "Fail"
        println("Status       : $status")
    }
}