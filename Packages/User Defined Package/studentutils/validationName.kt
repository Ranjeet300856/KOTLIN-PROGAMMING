package studentutils

fun validateStudentName(name: String): Boolean
{
    if(name.isBlank()) return false
    if(!name.all { it.isLetter() || it.isWhitespace()}) return false

    return true
}