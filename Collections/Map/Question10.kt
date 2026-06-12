/*
    Question 10 — University Course Management System
    Problem Statement
    Create a Kotlin program that works as a University Course Management System using an Immutable Map. 
*/

fun displayCourseInfo(courses: Map<String, String>, courseCode: String)
{
    if(courses.containsKey(courseCode))
    {
        println("Course Code : $courseCode")
        println("Course Name : ${courses[courseCode]}")

        when(courseCode)
        {
            "C101" -> println("Category    : Core Subject\n")
            "C102" -> println("Category    : Core Subject\n")
            "C103" -> println("Category    : Core Subject\n")
            "C104" -> println("Category    : Networking Subject\n")
            "C105" -> println("Category    : Development Subject\n")
        }
    }
    else
    {
        println("Course Code : $courseCode")
        println("Course Not Found\n")
    }
}

fun main()
{
    val courses = mapOf(
        "C101" to "Data Structures",
        "C102" to "Operating System",
        "C103" to "Database Management System",
        "C104" to "Computer Networks",
        "C105" to "Software Engineering"
    )

    val courseCode = "C103"
    displayCourseInfo(courses, courseCode)

    val code1 = "C101"
    displayCourseInfo(courses, code1)

    val code2 = "C105"
    displayCourseInfo(courses, code2)

    val code3 = "C999"
    displayCourseInfo(courses, code3)
}