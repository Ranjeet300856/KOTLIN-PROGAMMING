//Write a Kotlin program that processes a student's marks and calculates the average of selected subjects.
fun numberOfSubjectValidation(number: Int)
{
    require(number > 0) { "Number of Subject must greater than 0." }
}
fun main()
{
    val marks = listOf(80, 75, 90, 65, 85)
    println("Available Marks:")
    marks.forEachIndexed {
        index, mark ->
        println("$index -> $mark")
    }

    print("Enter Starting Index : ")
    val inputStartingIndex = readln().trim().toIntOrNull()
    if(inputStartingIndex == null)
    {
        println("Invalid Input!")
        return
    }

    print("Enter Number of Subjects : ")
    val input = readln().trim()
    if(input.isBlank()) 
    {
        println("Invalid Input!")
        return
    }

    try {
        val numberOfSubject = input.toInt()
        var startingIndex = inputStartingIndex
        numberOfSubjectValidation(numberOfSubject)
        var sum = 0
        var i = 1
        while(i <= numberOfSubject)
        {
            sum += marks[startingIndex]
            startingIndex++
            i++
        }

         val average = sum / numberOfSubject

         println("Total Marks   : $sum")
         println("Average Marks : $average")
    } catch(e: NumberFormatException) {
        println("Error: Invalid integer format.")
    } catch(e: IndexOutOfBoundsException) {
        println("Error: Invalid index.")
    } catch(e: ArithmeticException) {
        println("Error: Cannot divide by zero.")
    } catch(e: IllegalArgumentException) {
        println(e.message)
    } finally {
        println("Student record processing completed.")
    }
}