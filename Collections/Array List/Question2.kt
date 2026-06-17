/*
    Question 2: Student Marks Management System Using ArrayList with Initial Capacity
    Problem Statement
    Create a Kotlin program to develop a Student Marks Management System using ArrayList<Int>.
    The system should store and process marks of students. 
*/

fun display(studentMarks: ArrayList<Int>)
{
    for(i in studentMarks.indices)
        println("Student ${i + 1} : ${studentMarks[i]}")
}

fun calculateTotalMarks(list: ArrayList<Int>): Int
{
    var sum = 0
    for(value in list) sum += value
    return sum
}

fun findHighestMarks(list: ArrayList<Int>): Int
{
    var highestMarks = list[0]
    for(value in list)
    {
        if(value > highestMarks)
        highestMarks = value
    }
    return highestMarks
}

fun findLowestMarks(list: ArrayList<Int>): Int
{
    var lowestMarks = list[0]
    for(value in list)
    {
        if(value < lowestMarks)
        lowestMarks = value
    }
    return lowestMarks
}

fun main()
{
    val studentMarks = ArrayList<Int>(10)
    studentMarks.add(85)
    studentMarks.add(72)
    studentMarks.add(90)
    studentMarks.add(65)
    studentMarks.add(48)
    studentMarks.add(76)
    studentMarks.add(90)
    studentMarks.add(55)
    display(studentMarks)

    studentMarks.add(95)
    studentMarks.add(4, 60)
    println("\nStudent Marks After Updated List:")
    display(studentMarks)

    if(48 in studentMarks)
    {
        val index = studentMarks.indexOf(48)
        studentMarks[index] = 50
        println("\nMarks Update Successfully")
        display(studentMarks)
    }
    else println("48 marks not exists")

    if(studentMarks.remove(90))
    {
        if(studentMarks.isNotEmpty()) studentMarks.removeAt(studentMarks.lastIndex)

        println("\nMarks remove successfully")
        display(studentMarks)
    }
    else println("Marks not found")

    if(100 in studentMarks) println("\nMarks (100) Found")
    else println("Marks (100) Not Found")

    if(76 in studentMarks) println("Marks (76) Found")
    else println("Marks (76) Not Found")

    val averageMarks = if(studentMarks.size > 0) calculateTotalMarks(studentMarks).toDouble() / studentMarks.size else 0.0

    println("Total Marks (Sum) : ${calculateTotalMarks(studentMarks)}")
    println("Highest Marks     : ${findHighestMarks(studentMarks)}")
    println("Lowest Marks      : ${findLowestMarks(studentMarks)}")
    println("Average Marks     : %.2f".format(averageMarks))
}