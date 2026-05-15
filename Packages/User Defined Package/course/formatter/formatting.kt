package course.formatter
fun formatStudentName(name: String): String
{
    val result = name.split(" ").joinToString(" ") { word ->
    word.lowercase().replaceFirstChar { it.uppercase() }
    }
    return result
}

fun formatCourseName(cname: String): String
{
    val result = cname.split(" ").joinToString(" ") { word ->
    word.lowercase().replaceFirstChar { it.uppercase() }
    }
    return result
}