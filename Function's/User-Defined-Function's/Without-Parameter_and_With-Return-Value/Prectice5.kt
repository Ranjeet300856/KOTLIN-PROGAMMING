fun getTotalMarks(): Int
{
    val math = 78
    val science = 85
    val english = 90
    val total = math + science + english
    return total
}
fun main()
{
    //Q5th
    /*
    Write a Kotlin program that defines a function getTotalMarks() which takes no parameters but returns the total marks of a student.
    Inside the function define the marks of three subjects:
    Math = 78
    Science = 85
    English = 90
    Calculate the total marks and return the result.
    The program should call this function from main() and print the returned value.
    */

    val totalMarks = getTotalMarks()
    println("Total Marks = $totalMarks")
}