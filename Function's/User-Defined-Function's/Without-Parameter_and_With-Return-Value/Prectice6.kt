fun getAverageMarks(): Double
{
    val math = 80
    val science = 70
    val english = 90
    val total = math + science + english
    val average = total / 3.0
    return average
}
fun main()
{
    //Q6th
    /*
    Write a Kotlin program that defines a function getAverageMarks() which takes no parameters but returns the average marks of three subjects.
    Inside the function define the marks of three subjects:
    Math = 80
    Science = 70
    English = 90
    First calculate the total marks, then calculate the average.
    Return the average marks.
    The program should call this function from main() and print the returned value.
    */

    val averageMarks = getAverageMarks()
    println("Average Marks = $averageMarks")
}