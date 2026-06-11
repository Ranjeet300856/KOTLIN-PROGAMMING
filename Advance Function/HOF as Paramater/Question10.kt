/*
    Question 10 — Advanced Student Result Processing System Using Function as Parameter
    Problem Statement - Create a Kotlin program that processes a student's marks using different result-processing functions passed into a Higher Order Function.

    This program should demonstrate a professional real-world use of Higher Order Functions with multiple validations and calculations. 
*/

fun calculateTotalMarks(marks: IntArray): Int
{
    var sum = 0
    for(m in marks)
        sum += m
    
    return sum
}

fun calculateAverageMarks(marks: IntArray): Double = calculateTotalMarks(marks).toDouble() / marks.size
fun calculateGrade(marks: IntArray): String
{
    val averageMarks = calculateAverageMarks(marks)
    val grade = when
    {
        averageMarks >= 90 -> "A+"
        averageMarks >= 75 -> "A"
        averageMarks >= 60 -> "B"
        averageMarks >= 45 -> "C"
        else -> "Fail"
    }

    return grade
}

fun processIntegerResult(marks: IntArray, calculateTotal: (IntArray) -> Int): Int = calculateTotal(marks)
fun processDoubleResult(marks: IntArray, calculateAverage: (IntArray) -> Double): Double = calculateAverage(marks)
fun processStringResult(marks: IntArray, calculate_Grade: (IntArray) -> String): String = calculate_Grade(marks) 

fun main()
{
    val marks = IntArray(5)
    for(i in marks.indices)
    {
        while(true)
        {
            print("Enter Subject ${i + 1} Marks : ")
            val input = readln().trim().toIntOrNull()
            if(input == null || input < 0 || input > 100)
            {
                println("Invalid Marks! Try Again")
                continue
            }

            marks[i] = input
            break
        }
    }

    println("\nStudent Result Report")
    println("----------------------\n")
    
    print("Subject Marks : ")
    for(m in marks) print("$m ")

    val totalMarks = processIntegerResult(marks, ::calculateTotalMarks)
    val averageMarks = processDoubleResult(marks, ::calculateAverageMarks)
    val grade = processStringResult(marks, ::calculateGrade)

    println("\nTotal Marks   : $totalMarks")
    println("Average Marks : %.2f".format(averageMarks))
    println("Final Grade   : $grade")
}