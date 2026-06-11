/*
    Question 7 — Student Grade Evaluator using Higher Order Function and Lambda
    Problem Statement
    Create a Kotlin program where:

    You create a Higher Order Function named evaluateMarks.
    The function should:
    take one student's marks (Int)
    take one Lambda parameter for evaluation
    The Lambda should evaluate the marks in different ways.
*/

fun evaluateMarks(marks: Int, evaluate: (Int) -> String): String = evaluate(marks)

fun main()
{
    print("Enter Marks : ")
    val marks = readln().trim().toIntOrNull()
    if(marks == null || marks < 0 || marks > 100)
    {
        println("Invalid Input")
        return
    }

    val grade = {
        studentMarks: Int ->
        when
        {
            studentMarks >= 90 -> "A"
            studentMarks >= 80 -> "B"
            studentMarks >= 70 -> "C"
            studentMarks >= 60 -> "D"
            else -> "F"
        }
    }

    val result = {
        studentMarks: Int ->
        if(studentMarks >= 40) "Pass"
        else "Fail"
    }

    val scholarshipEligibility = {
        studentMarks: Int ->
        if(studentMarks >= 85) "Eligible"
        else "Not Eligible"
    }

    val performanceLevel = {
        studentMarks: Int ->
        when
        {
            studentMarks >= 90 -> "Excellent"
            studentMarks >= 75 -> "Good"
            studentMarks >= 60 -> "Average"
            else -> "Poor"
        }
    }

    println("\nGrade                 : ${evaluateMarks(marks, grade)}")
    println("Pass/Fail             : ${evaluateMarks(marks, result)}")
    println("Scholarship Status    : ${evaluateMarks(marks, scholarshipEligibility)}")
    println("Performance Level     : ${evaluateMarks(marks, performanceLevel)}")
}