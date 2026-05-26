/*
    Create a Kotlin program where:

    You have separate normal functions for:
    Calculate Total Marks
    Calculate Average Marks
    Find Highest Mark
    Generate Grade

    Create a Higher Order Function
    Create a function named: getStudentProcessor()
    that:
    takes a String parameter
    returns a function 
*/

//Normal Functions
fun totalMarks(arr: IntArray): Int
{
    var totalMarks = 0
    for(value in arr)
        totalMarks += value
    
    return totalMarks
}

fun calculateTotalMarks(arr: IntArray): String
{
    var totalMarks = 0
    for(value in arr)
        totalMarks += value
    
    return "Total Marks : $totalMarks"
}

fun calculateAverage(arr: IntArray): String
{
    val totalMarks = totalMarks(arr)
    val average = totalMarks.toDouble() / arr.size
    return "Average Marks : $average"
}

fun findHighestMarks(arr: IntArray): String
{
    var max = arr[0]
    for(value in arr)
        if(value > max) max = value
    
    return "Highest Marks : $max"
}

fun generateGrade(arr: IntArray): String
{
    val totalMarks = totalMarks(arr)
    val average = totalMarks.toDouble() / arr.size

    val grade = when
    {
        average >= 90 -> "A"
        average >= 75 -> "B"
        average >= 60 -> "C"
        average >= 40 -> "D"
        else -> "F"
    }

    return "Grade : $grade"
}

fun invalidChoice(arr: IntArray): String = "Invalid Operation"

//Higher Order Function
fun getStudentProcessor(choice: String): (IntArray) -> String
{
    return when(choice.lowercase())
    {
        "total" -> ::calculateTotalMarks
        "highest" -> ::findHighestMarks
        "average" -> ::calculateAverage
        "grade" -> ::generateGrade
        else -> ::invalidChoice
    }
}

//Main Function
fun main()
{
    print("Enter Total Subjects : ")
    val totalSubjects = readln().trim().toIntOrNull()
    if(totalSubjects == null || totalSubjects <= 0)
    {
        println("Invalid Input")
        return
    }

    val marks = IntArray(totalSubjects)
    print("\nEnter all marks: ")
    for(i in marks.indices)
    {
        while(true)
        {
            print("\nEnter Subject ${i + 1} Marks : ")
            val inputMarks = readln().trim().toIntOrNull()
            if(inputMarks == null || inputMarks < 0 || inputMarks > 100)
            {
                println("Invalid Marks! Try Again")
                continue
            }

            marks[i] = inputMarks
            break
        }
    }

    println("\nResult Checklist: \n")
    println("1. Calculate Total Marks")
    println("2. Calculate Average Marks")
    println("3. Find Highest Marks")
    println("4. Generate Grade")

    print("\nEnter your choice (total, average, highest or grade) : ")
    val choice = readln().trim()
    if(choice.isBlank())
    {
        println("Invalid Input")
        return
    }

    val processor = getStudentProcessor(choice)
    val result = processor(marks)
    println(result)
}