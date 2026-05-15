package studentutils

fun formatStudentName(name: String): String
{
    val result = name.split(" ").joinToString(" ") { word ->
       word.lowercase().replaceFirstChar { it.uppercase() }
    }
    return result
}