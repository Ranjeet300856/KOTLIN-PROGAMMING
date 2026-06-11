/*
    Question 5 — Unique Exam Grade Manager

    Problem Statement:
    Create a Kotlin program for a school examination system using
    MutableSet<Char>. The program should store only unique valid
    grades, support searching and removing grades, and display
    updated results.
*/

fun main()
{
    print("How many grades do you want to enter? : ")
    val n = readln().trim().toIntOrNull()
    if(n == null || n <= 0)
    {
        println("Invalid Input")
        return
    }

    val uniqueGrades = mutableSetOf<Char>()

    for(i in 0 until n)
    {
        while(true)
        {
            print("Enter Grade ${i + 1} : ")
            val input = readln().trim()
            if(input.isBlank() || input.length != 1 || input !in "ABCDEF")
            {
                println("Invalid Input! Try Again")
                continue
            }

            val grade = input[0]
            uniqueGrades.add(grade)
            break
        }
    }

    println("Unique Grades : ")
    for(value in uniqueGrades) println("$value")

    println("Total Unique Grades : ${uniqueGrades.size}")

    print("\nEnter a grade to search : ")
    val searchGrade = readln().trim()
    if(searchGrade.isBlank() || searchGrade.length != 1)
    {
        println("Invalid Input")
        return
    }

    if(searchGrade[0] in uniqueGrades) println("Grade Found")
    else println("Grade not found")

    print("\nEnter a grade to remove : ")
    val removeGrade = readln().trim()
    if(removeGrade.isBlank() || removeGrade.length != 1 || removeGrade !in "ABCDEF")
    {
        println("Invalid Input")
        return
    }

    if(uniqueGrades.remove(removeGrade[0]) || searchGrade !in "ABCDEF")
        println("Grade removed successfully.")
    else println("Grade does not exist.")

    print("Updated Grade   : ")
    for(value in uniqueGrades) print("$value ")

    println("\nUpdated Size : ${uniqueGrades.size}")
}