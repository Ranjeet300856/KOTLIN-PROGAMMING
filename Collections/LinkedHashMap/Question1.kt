//Create a Kotlin program to manage student scores using LinkedHashMap.

fun inputId(studentScores: LinkedHashMap<Int, Double>, i: Int): Int
{
    while(true)
    {
        print("\nEnter Student ID $i : ")
        val studentId = readln().trim().toIntOrNull()
        if(studentId == null || studentId <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }
        if(studentScores.containsKey(studentId))
        {
            println("Duplicate student not allowed! Try Again")
            continue
        }

        return studentId
    }
}

fun inputScore(studentScores: LinkedHashMap<Int, Double>, i: Int): Double
{
    while(true)
    {
        print("Enter Student Score : ")
        val studentScore = readln().trim().toDoubleOrNull()
        if(studentScore == null)
        {
            println("Invalid Input! Try Again")
            continue
        }
        if(studentScore < 0 || studentScore > 100)
        {
            println("Invalid Score Entered! Please Enter Score in 0..100")
            continue
        }

        return studentScore
    }
}

fun display(studentScores: LinkedHashMap<Int, Double>)
{
    println("\nAll Student Records:")
    for((key, value) in studentScores.entries)
    println("$key :\t%.2f".format(value))
}

fun calculation(studentScores: LinkedHashMap<Int, Double>)
{
    var highestScore: Double? = null
    var lowestScore: Double? = null
    var sum = 0.0
    for(value in studentScores.values)
    {
        sum += value
        if(highestScore == null || value > highestScore) highestScore = value
        if(lowestScore == null || value < lowestScore) lowestScore = value
    }

    val averageScore = if(studentScores.size > 0) sum / studentScores.size else 0.0

    println("Total Students : ${studentScores.size}")
    println("Highest Score  : %.2f".format(highestScore))
    println("Lowest Score   : %.2f".format(lowestScore))
    println("Average Score  : %.2f".format(averageScore))
}

fun main()
{
    val studentScores = LinkedHashMap<Int, Double>()
    print("Enter the total number of students : ")
    val totalStudent = readln().trim().toIntOrNull()
    if(totalStudent == null || totalStudent <= 0)
    {
        println("Invalid Input!")
        return
    }

    for(i in 1..totalStudent)
    {
        val studentId = inputId(studentScores, i)
        val studentScore = inputScore(studentScores, i)
        studentScores.put(studentId, studentScore)
        break
    }

    display(studentScores)
    calculation(studentScores)
}