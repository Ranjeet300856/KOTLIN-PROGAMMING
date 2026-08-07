//Create a Kotlin program to manage and analyze the marks of students using Lambda with Collections / Collection Higher-Order Functions.
fun main()
{
    val students = mutableListOf(39, 40, 95, 74, 60, 75)
    var studentNumber = 0
    var passStudent = 0
    var failStudent = 0
    var dictStudent = 0
    var totalMarks = 0
    students.forEach {
        totalMarks += it
        studentNumber++
        print("Student $studentNumber: $it Marks - ${if(it >= 40) "PASS" else "FAIL"}")
        if(it >= 40)
        {
            passStudent++
            if(it >= 75)
            {
                print(" - Distinction")
                dictStudent++
            }
        }
        else failStudent++
        println()
    }

    println("\n----- Summary -----")
    println("Total Students      : ${students.size}")
    println("Passed Students     : $passStudent")
    println("Failed Students     : $failStudent")
    println("Distinctions        : $dictStudent")
    println("Total Marks         : $totalMarks")
}