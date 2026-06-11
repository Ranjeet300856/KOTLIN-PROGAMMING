/*
    Question 5: Classroom Roll Number Manager
    Problem Statement
    Create a Kotlin program that manages student roll numbers using a MutableList<Int>.

    Requirements
    1. Ask the user to enter 5 roll numbers and store them in a MutableList<Int>.
    2. Print the complete roll number list.
    3. Ask the user for:
    An index
    A new roll number
    Insert the new roll number at the given index using:
    add(index, element)
    Then print the updated list.

    4. Ask the user for an index to remove.
    Remove the roll number at that index using:
    removeAt(index)
    Then print the updated list.

    5. Print:
    Final Roll Number List
    Total Number of Roll Numbers (size) 
*/

fun main()
{
    val rollNumbers = mutableListOf<Int>()

    for(i in 0..4)
    {
        while(true)
        {
            print("Enter Roll Number of Student ${i + 1} : ")
            val rollNumber = readln().trim().toIntOrNull()
            if(rollNumber == null || rollNumber <= 0)
            {
                println("Invalid Input! Try Again")
                continue
            }

            rollNumbers.add(rollNumber)
            break
        }
    }

    println("\nRoll Number List : $rollNumbers")

    print("\nEnter Index         : ")
    val index = readln().trim().toIntOrNull()
    print("Enter New Roll Number : ")
    val newRollNumber = readln().trim().toIntOrNull()
    if(index == null || newRollNumber == null || newRollNumber <= 0)
    {
        println("Invalid Input")
        return
    }
    if(index < 0 || index > rollNumbers.size)
    {
        println("Invalid Index")
        return
    }

    rollNumbers.add(index, newRollNumber)
    println("Updated Roll Number List : $rollNumbers")

    print("\nEnter index to remove roll number : ")
    val removeIndex = readln().trim().toIntOrNull()
    if(removeIndex == null || removeIndex < 0 || removeIndex >= rollNumbers.size)
    {
        println("Invalid Index")
        return
    }

    rollNumbers.removeAt(removeIndex)
    println("Updated List After Remove A Roll Number : $rollNumbers")

    println("\nFinal Roll Number List : $rollNumbers")
    println("Total Roll Numbers       : ${rollNumbers.size}")
}