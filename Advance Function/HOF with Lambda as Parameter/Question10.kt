/*
    Question 10 — Employee Performance Management System (Final Challenge)
    Problem Statement

    Create a Kotlin program where:

    You create Higher Order Function(s) to process employee performance data.
    The program should:
    take performance scores of multiple employees using an IntArray
    use Lambdas to perform different evaluations and analyses
    Each Lambda should perform a different business operation. 
*/

fun performance(arr: IntArray, operation: (IntArray) -> Int): Int = operation(arr)
fun performance2(arr: IntArray, operation: (IntArray) -> Double): Double = operation(arr)
fun performance3(arr: IntArray, operation: (IntArray) -> String): String = operation(arr)

fun main()
{
    print("Enter Number of Employees : ")
    val totalEmployees = readln().trim().toIntOrNull()
    if(totalEmployees == null || totalEmployees <= 0)
    {
        println("Invalid Input")
        return
    }

    val employeesScores = IntArray(totalEmployees)
    println("\nEnter all employees score: ")
    for(i in employeesScores.indices)
    {
        while(true)
        {
            print("Enter Employee ${i + 1} Score : ")
            val score = readln().trim().toIntOrNull()
            if(score == null || score < 0 || score > 100)
            {
                println("Invalid Input! Try Again")
                continue
            }

            employeesScores[i] = score
            break
        }
    }

    val highestScore = {
        arr: IntArray ->
        var max = arr[0]
        for(value in arr)
            if(value > max) max = value
        
        max
    }

    val lowestScore = {
        arr: IntArray ->
        var min = arr[0]
        for(value in arr)
            if(value < min) min = value
        
        min
    }

    val averagePerformance = {
        arr: IntArray ->
        var sum = 0
        for(value in arr) sum += value

        if(arr.size > 0) sum.toDouble() / arr.size 
        else 0.0
    }

    val countExcellentEmployees = {
        arr: IntArray ->
        var count = 0
        for(value in arr)
            if(value >= 85) count++
        
        count
    }

    val overallTeamPerformance = {
        arr: IntArray ->
        val average = performance2(arr, averagePerformance)
        when
        {
            average >= 85 -> "Excellent Team"
            average >= 70 -> "Good Team"
            average >= 50 -> "Average Team"
            else -> "Poor Team"
        }
    }

    println("\nHighest Score        : ${performance(employeesScores, highestScore)}")
    println("Lowest Score         : ${performance(employeesScores, lowestScore)}")
    println("Average Score        : %.2f".format(performance2(employeesScores, averagePerformance)))
    println("Excellent Employees  : ${performance(employeesScores, countExcellentEmployees)}")
    println("Team Performance     : ${performance3(employeesScores, overallTeamPerformance)}")
}