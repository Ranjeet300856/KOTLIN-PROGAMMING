//Create a Kotlin program to process student marks using the `let` scope function.
class Student(val name: String, val marks: MutableList<Int>)
fun main()
{
    print("Enter Name : ")
    val name = readln().trim()
    if(name.isBlank())
    {
        println("Invalid Name!")
        return
    }

    val marks = mutableListOf<Int>()
    for(i in 1..3)
    {
        print("Enter Marks of Subject $i : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input < 0 || input > 100)
        {
            println("Invalid Input!")
            return
        }

        marks.add(input)
    }

    val student = Student(name, marks)
    val result = student.let {
        var totalMarks = 0
        var isPassed = true
        for(value in it.marks)
        {
            totalMarks += value
            if(value < 33) isPassed = false
        }

        val percentage = if(it.marks.size > 0) totalMarks.toDouble() / it.marks.size else 0.0

        """
        Total Marks : $totalMarks
        Percentages : ${"%.2f".format(percentage)}
        Result      : ${if(isPassed) "PASS" else "FAIL"}
        """.trimIndent()
    }

    println("\nStudent Name: ${student.name}")
    println(result)
}