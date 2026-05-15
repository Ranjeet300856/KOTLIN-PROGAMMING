package Bank.formatter
fun formatAccountHolderName(name: String): String
{
     val result = name.split(" ").joinToString(" ") { word ->
       word.lowercase().replaceFirstChar { it.uppercase() }
    }
    return result
}