//Write a Kotlin program that generates a student report using Raw String with dynamic data, conditional logic, and proper formatting. 

fun main()
{
    print("Enter Student Name   : ")
    val name = readln()
    print("Enter Student Marks  : ")
    val marks = readln().toIntOrNull()

    if(name.isBlank() || !name.all { it.isLetter() || it.isWhitespace()})
    {
        println("Invalid Student Name")
        return
    }

    if(marks == null || marks < 0 || marks > 100)
    {
        println("Invalid Marks")
        return
    }

    println()
    val studentReport = """
    Student Name:    $name
    Student Marks:  $marks
    Grade:          ${
                        if(marks >= 90) 'A'
                        else if(marks >= 75) 'B'
                        else if(marks >= 50) 'C'
                        else "Fail"
                    }
    """.trimIndent()

    println("Student Report: ")
    println(studentReport)
}