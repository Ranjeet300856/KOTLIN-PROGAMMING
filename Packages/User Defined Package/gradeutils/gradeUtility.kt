package gradeutils

fun calculatePercentage(obtainedMarks: Int, totalMarks: Int): Double 
{
    val percentage = (obtainedMarks * 100.0) / totalMarks
    return percentage
}

fun calculateGrade(percentage: Double): String
{
    val grade = when
    {
        percentage >= 90 -> "A"
        percentage >= 75 -> "B"
        percentage >= 60 -> "C"
        percentage >= 40 -> "D"
        else -> "F"
    }

    return grade
}