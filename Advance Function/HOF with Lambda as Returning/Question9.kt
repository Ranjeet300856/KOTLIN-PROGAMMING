/*
    Problem Statement
    Create a Kotlin Higher Order Function named createResultAnalyzer.

    The function should:
    1. Take a String parameter named analysisType.
    2. Return a Lambda.
    3. The returned Lambda should take an IntArray parameter (student marks).
    4. The Lambda should return an Int result.

    Analysis Rules
    For analysisType = "MAX"
    Return the highest mark from the array.

    For analysisType = "MIN"
    Return the lowest mark from the array.

    For analysisType = "AVERAGE"
    Return the average marks (integer division).

    For Any Other Analysis Type
    Return -1. 
*/

fun createResultAnalyzer(analysisType: String): (IntArray) -> Int
{
    return {
        arr: IntArray ->
        
        if(analysisType == "max")
        {
            var max = arr[0]
            for(value in arr)
                if(value > max) max = value
            
            max
        }

        else if(analysisType == "min")
        {
            var min = arr[0]
            for(value in arr)
                if(value < min) min = value
            
            min
        }

        else if(analysisType == "average")
        {
            var sum = 0
            for(value in arr)
                sum += value
            
            sum / arr.size
        }

        else -1
    }
}

fun main()
{
    print("Enter Analysis Type      : ")
    val analysisType = readln().trim().lowercase()
    print("Enter Number of Subjects : ")
    val totalSubject = readln().trim().toIntOrNull()
    if(analysisType.isBlank() || totalSubject == null || totalSubject <= 0)
    {
        println("Invalid Input")
        return
    }

    val marks = IntArray(totalSubject)

    println("\nEnter all subjects marks:")
    for(i in marks.indices)
    {
        while(true)
        {
            print("Enter Subject ${i + 1} Marks : ")
            val inputMarks = readln().trim().toIntOrNull()
            if(inputMarks == null || inputMarks < 0 || inputMarks > 100)
            {
                println("Invalid Marks Input! Try Again")
                continue
            }

            marks[i] = inputMarks
            break
        }
    }

    val result = createResultAnalyzer(analysisType)
    println("\nResult : ${result(marks)}")
}