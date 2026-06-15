/*
    Question 6 — Student Marks Statistics Analyzer (Intermediate → Advanced Level)
    Problem Statement
    Create a Kotlin program that analyzes a list of student marks using a Trailing Lambda.

    Requirements
    Create a Higher Order Function named analyzeMarks.
    The function should accept:
    A list of marks (List<Int>)
    A lambda parameter that receives the list and returns Unit.

    Use Trailing Lambda Syntax while calling the function.
    Inside the lambda:
    Display all marks.
    Display the total marks.
    Display the average marks.
    Display the highest mark.
    Display the lowest mark.

    Use meaningful function and variable names.
    The program should work correctly for valid input values.
*/

fun analyzeMarks(marks: List<Int>, marksCalculator: (List<Int>) -> Unit) = marksCalculator(marks)

fun main()
{
    print("Enter total number of subjects : ")
    val totalSubjects = readln().trim().toIntOrNull()
    if(totalSubjects == null || totalSubjects <= 0)
    {
        println("Invalid Input")
        return
    }

    val inputMarks = mutableListOf<Int>()
    println("Enter Marks:")
    for(i in 0 until totalSubjects)
    {
        while(true)
        {
            print("Enter marks of subject ${i + 1} : ")
            val input = readln().trim().toIntOrNull()
            if(input == null || input < 0 || input > 100)
            {
                println("Invalid Input Marks! Try Again")
                continue
            }

            inputMarks.add(input)
            break
        }
    }

    val marks = inputMarks.toList()
    
    analyzeMarks(marks) {
        marksList: List<Int> ->

        println("Marks         : $marksList")

        var total = 0
        var highest = marksList[0]
        var lowest =  marksList[0]

        for(value in marksList)
        {
            total += value
            if(value > highest) highest = value
            if(value < lowest) lowest = value
        }

        val average = if(marksList.size > 0) total.toDouble() / marksList.size else 0.0

        println("Total Marks   : $total")
        println("Average Marks : %.2f".format(average))
        println("Highest Mark  : $highest")
        println("Lowest Mark   : $lowest")
    }
}