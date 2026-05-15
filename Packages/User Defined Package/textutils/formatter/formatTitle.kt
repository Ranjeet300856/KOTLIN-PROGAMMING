package textutils.formatter
fun formatTitle(text: String): String
{
    val result = text.split(" ").joinToString(" ") { word ->
        word.lowercase().replaceFirstChar { it.uppercase() }
    }

    return result
}