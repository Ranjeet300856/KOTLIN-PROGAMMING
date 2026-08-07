//Create a Kotlin program to analyze course enrollments using Collection Higher-Order Functions.
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

fun inputString(text: String): String
{
    while(true)
    {
        print("Enter $text : ")
        val input = readln().trim()
        if(input.isBlank())
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun main()
{
    val totalCourse = inputInteger("Total Number of Course")
    val courses = mutableListOf<String>()
    for(i in 1..totalCourse)
    {
        val courseName = inputString("Course Name $i")
        courses.add(courseName)
    }

    val uniqueCourses = courses.distinct()
    val takeFirst3 = courses.distinct().take(3)
    val drop2 = courses.distinct().drop(2)

    println("\n----- Original Enrollments -----")
    courses.forEach { println(it) }

    println("\n----- Unique Courses -----")
    uniqueCourses.forEach { println(it) }

    println("\n----- First 3 Courses -----")
    takeFirst3.forEach { println(it) }

    println("\n----- Courses After Dropping First 2 -----")
    drop2.forEach { println(it) }
}