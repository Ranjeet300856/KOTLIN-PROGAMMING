fun getStudentGrade(): Char
{
    val marks = 86
    val grade = when
    {
        marks >= 90 -> 'A'
        marks >= 75 -> 'B'
        marks >= 60 -> 'C'
        marks >= 50 -> 'D'
        else -> 'F'
    }

    return grade
}
fun main()
{
    //Q10th
    /*
    Write a Kotlin program that defines a function getStudentGrade() which takes no parameters but returns the grade of a student based on marks.
    Inside the function define:
    marks = 86

    Determine the grade according to the following rules:
    90 or above → Grade A
    75 to 89 → Grade B
    60 to 74 → Grade C
    50 to 59 → Grade D
    Below 50 → Grade F

    The function should calculate the grade based on marks and return it.
    The program should call this function from main() and print the returned grade.
    */

    val grade = getStudentGrade()
    println("Student Grade : $grade")
}