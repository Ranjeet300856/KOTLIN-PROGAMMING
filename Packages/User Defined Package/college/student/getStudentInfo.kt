package college.student

fun getStudentDetails(name: String, course: String): String
{
    val formattedInfo = """
    Name   : $name
    Course : $course
    """.trimIndent()

    return formattedInfo
}