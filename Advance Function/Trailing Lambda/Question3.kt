/*
    Question 3 — Student Percentage Analyzer (Intermediate Level)
    Problem Statement
    Create a Kotlin program that analyzes a student's percentage using a Trailing Lambda.

    Requirements
    Create a Higher Order Function named analyzePercentage.
    The function should accept:
    Student percentage (Double)
    A lambda parameter that receives the percentage and returns Unit.

    Use Trailing Lambda Syntax while calling the function.
    Inside the lambda:
    Display the student's percentage.
    Display the student's grade according to the following rules:
    Percentage	Grade
    90 - 100	A+
    80 - 89.99	A
    70 - 79.99	B
    60 - 69.99	C
    Below 60	Fail

    Use meaningful function and variable names.
    The program should work correctly for valid percentage values. 
*/

fun analyzePercentage(percentage: Double, findGrade: (Double) -> Unit) = findGrade(percentage)

fun main()
{
    print("Enter Percentage : ")
    val inputPercentage = readln().trim().toDoubleOrNull()
    if(inputPercentage == null || inputPercentage < 0.0 || inputPercentage > 100.0)
    {
        println("Invalid Input")
        return
    }

    analyzePercentage(inputPercentage) {
        percentage: Double ->
        println("Student Percentage : %.2f".format(percentage))

        val grade = when
        {
            percentage >= 90 -> "A+"
            percentage >= 80 -> "A"
            percentage >= 70 -> "B"
            percentage >= 60 -> "C"
            else -> "Fail"
        }

        println("Grade              : $grade")
    }
}