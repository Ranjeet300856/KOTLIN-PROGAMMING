/*
    Problem Statement
    Create a Kotlin Higher Order Function named createPerformanceEvaluator.

    The function should:
    1. Take a String parameter named evaluationMode.
    2. Return a Lambda.
    3. The returned Lambda should take an IntArray parameter (employee performance scores).
    4. The Lambda should return a String result.

    Evaluation Modes
    For "BEST"
    Return:
    Best Employee Score = <highest score>

    For "WORST"
    Return:
    Worst Employee Score = <lowest score>

    For "AVERAGE"
    return:
    Average Performance = <average score>

    For "REPORT"
    Return a complete report in the format:
    Employees        : <total employees>
    Highest Score    : <highest score>
    Lowest Score     : <lowest score>
    Average Score    : <average score>

    For Any Other Evaluation Mode
    Return: INVALID MODE 
*/

fun createPerformanceEvaluator(evaluationMode: String): (IntArray) -> String
{
    return {
        arr: IntArray ->
        
        if(evaluationMode == "best") 
        {
            var max = arr[0]
            for(value in arr)
                if(value > max) max = value
            
            "Best Employee Score = $max"
        }

        else if(evaluationMode == "worst")
        {
            var min = arr[0]
            for(value in arr)
                if(value < min) min = value
            
            "Worst Employee Score = $min"
        }

        else if(evaluationMode == "average")
        {
            var sum = 0
            for(value in arr) sum += value

            "Average Performance = ${sum / arr.size}"
        }

        else if(evaluationMode == "report")
        {
            val bestScore = createPerformanceEvaluator("best")
            val worstScore = createPerformanceEvaluator("worst")
            val averageScore = createPerformanceEvaluator("average")

            """
            Employees        : ${arr.size} 
            Highest Score    : ${bestScore(arr).filter {it.isDigit()}}
            Lowest Score     : ${worstScore(arr).filter {it.isDigit()}}
            Average Score    : ${averageScore(arr).filter {it.isDigit()}}
            """.trimIndent()
        }

        else "INVALID MODE"
    }
}

fun main()
{
    print("Enter Evaluation Mode     : ")
    val evaluationMode = readln().trim().lowercase()
    print("Enter Number of Employees : ")
    val totalEmployees = readln().trim().toIntOrNull()
    if(evaluationMode.isBlank() || totalEmployees == null || totalEmployees <= 0)
    {
        println("Invalid Input")
        return
    }

    val scores = IntArray(totalEmployees)

    println("\nEnter All Employees Scores: ")
    for(i in scores.indices)
    {
        while(true)
        {
            print("Enter Score of Employee ${i + 1} : ")
            val inputScore = readln().trim().toIntOrNull()
            if(inputScore == null || inputScore < 0 || inputScore > 100)
            {
                println("Invalid Score! Try Again")
                continue
            }

            scores[i] = inputScore
            break
        }
    }

    val result = createPerformanceEvaluator(evaluationMode)
    println("\n${result(scores)}")
}