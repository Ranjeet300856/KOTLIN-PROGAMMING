//Create a Kotlin program to analyze students' marks using Collection Higher-Order Functions.
fun inputInteger(text: String): Int 
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    val totalStudents = inputInteger("Number of Students")
    val marks = mutableListOf<Int>()
    for(i in 1..totalStudents)
    {
        while(true)
        {
            val inputMarks = inputInteger("Marks of Student $i")
            if(inputMarks < 0 || inputMarks > 100)
            {
                println("Invalid Marks! Try Again")
                continue
            }

            marks.add(inputMarks)
            break
        }
    }

    val passedStudent = marks.filter { it >= 40 }
    val bonusMarksStudent = passedStudent.map { if(it + 5 <= 100) it + 5 else 100 }
    val totalPassedStudent = passedStudent.count()
    val totalMarks = marks.sumOf { it }
    val highestMarks = marks.maxOrNull()
    val lowestMarks = marks.minOrNull()
    val descendingOrderMarks = marks.sortedDescending()

    val searchMarks = inputInteger("A Marks to Search")
    val findValue = marks.find { it == searchMarks }

    println("\nOriginal Marks:")
    marks.forEach { println(it) }

    println("\nPassed Marks:")
    passedStudent.forEach { println(it) }

    println("\nGrace Marks Collection:")
    bonusMarksStudent.forEach { println(it) }

    println("\nMarks in Descending Order:")
    descendingOrderMarks.forEach { println(it) }

    val totalStu = marks.size
    val passedStudentTotal = passedStudent.size
    println("\n----- Summary -----")
    println("Total Students  : ${totalStu}")
    println("Passed Students : ${passedStudentTotal}")
    println("Failed Students : ${totalStu - passedStudentTotal}")
    println("Total Marks     : $totalMarks")
    println("Highest Marks   : $highestMarks")
    println("Lowest Marks    : $lowestMarks")
    println("Search Result   : ${findValue ?: "No Marks Found"}")
}