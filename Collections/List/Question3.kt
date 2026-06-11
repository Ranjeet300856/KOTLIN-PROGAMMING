/*
    Question 3: Analyze a List of Student Marks

    Create an immutable List of Double values:
    78.5, 92.0, 66.5, 88.0, 95.5, 72.0

    Perform the following operations:
    1. Create the List using listOf().
    2. Print the complete List.
    3. Print the total number of marks.
    4. Print the first mark.
    5. Print the last mark.
    6. Print the mark at index 4.
    7. Print all marks using a loop.
    8. Calculate and print the total sum.
    9. Calculate and print the average marks.
    10. Find and print the highest mark.
    11. Find and print the lowest mark.
    12. Count students scoring 80 or above.
    13. Count students scoring below 80.
    14. Check whether 95.5 exists in the List.
*/

fun main()
{
    val marks = listOf(78.5, 92.0, 66.5, 88.0, 95.5, 72.0)

    println("Marks                   : $marks")
    println("Total number of marks   : ${marks.size}")
    println("First Marks             : %.2f".format(marks.firstOrNull()))
    println("Last Marks              : %.2f".format(marks.lastOrNull()))
    println("Marks at index 4        : %.2f".format(marks[4]))

    print("Marks printing using loop : ")
    for(value in marks) print("%.2f ".format(value))

    var sum = 0.0
    var highestMarks = marks[0]
    var lowestMarks = marks[0]
    var countAbove80 = 0
    var countBelow80 = 0

    for(value in marks)
    {
        sum += value
        if(value > highestMarks) highestMarks = value
        if(value < lowestMarks) lowestMarks = value

        if(value >= 80) countAbove80++
        else countBelow80++
    }

    println("\nSum of all marks        : %.2f".format(sum))

    if(marks.size >= 1) 
    println("Average Marks           : %.2f".format(sum / marks.size))

    println("Highest Marks : %.2f".format(highestMarks))
    println("Lowest Marks  : %.2f".format(lowestMarks))

    println("Total number of marks above 80 : $countAbove80")
    println("Total number of marks below 80 : $countBelow80")

    println("95.5 exits in marks            : ${marks.contains(95.5)}")
}