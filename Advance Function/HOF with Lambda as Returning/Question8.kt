/*
    Problem Statement
    Create a Kotlin Higher Order Function named createGradeEvaluator.

    The function should:
    1. Take a String parameter named gradingSystem.
    2. Return a Lambda.
    3. The returned Lambda should take one Int parameter (student marks).
    4. The Lambda should return a String grade.

    Grading Rules
    For gradingSystem = "STANDARD"
    90 - 100  → A
    75 - 89   → B
    60 - 74   → C
    40 - 59   → D
    0  - 39   → F

    For gradingSystem = "PASSFAIL"
    40 - 100  → PASS
    0  - 39   → FAIL

    Any Other Grading System
    Return: UNKNOWN SYSTEM
*/

fun createGradeEvaluator(gradingSystem: String): (Int) -> String
{
    return {
        marks: Int ->

        if(gradingSystem == "STANDARD")
        {
            when
            {
                marks >= 90 -> "A"
                marks >= 75 -> "B"
                marks >= 60 -> "C"
                marks >= 40 -> "D"
                else -> "F"
            }
        }

        else if(gradingSystem == "PASSFAIL")
        {
            if(marks >= 40) "PASS"
            else "FAIL"
        }

        else "UNKNOWN SYSTEM"
    }
}

fun main()
{
    print("Enter Grade System : ")
    val gradingSystem = readln().trim().uppercase()
    print("Enter Marks        : ")
    val marks = readln().trim().toIntOrNull()
    if(gradingSystem.isBlank() || marks == null)
    {
        println("Invalid Input")
        return
    }

    if(marks < 0 || marks > 100)
    {
        println("Invalid Marks")
        return
    }

    val result = createGradeEvaluator(gradingSystem)
    println("Grade : ${result(marks)}")
}