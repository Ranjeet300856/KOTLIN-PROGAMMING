package textutils.validator
fun formatTitle(text: String): Boolean = !((text.isBlank()) || text.length < 5)