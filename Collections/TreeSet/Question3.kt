/*
    Problem Statement:
    Create a Kotlin program to develop a Student Marks Navigation System using TreeSet Collection.
    The program should allow users to manage unique student marks through a Menu Driven Program.

    Features:
    1. Add a new mark.
    - Mark must be between 0 and 100.
    - Duplicate marks should not be added.

    2. Display all marks in ascending order.
    3. Search for a mark.
    4. Find the nearest lower mark of a given mark.
    5. Find the nearest higher mark of a given mark.
    6. Find the floor mark of a given mark.
    7. Find the ceiling mark of a given mark.
    8. Display the lowest and highest mark.
    9. Exit the program.
*/

import java.util.TreeSet
fun checkEmpty(treeSet: TreeSet<Int>): Boolean
{
    if(treeSet.isEmpty())
    {
        println("Marks are not available")
        return true
    }
    else return false
}

fun inputMarks(): Int
{
    while(true)
    {
        print("Enter a marks : ")
        val input = readln().trim().toIntOrNull()
        if(input == null || input < 0 || input > 100)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return input
    }
}

fun addNewMarks(treeSet: TreeSet<Int>)
{
    val input = inputMarks()
    if(!treeSet.add(input)) println("Duplicate marks not allowed")
    else println("Marks $input added successfully")
}

fun displayMarks(treeSet: TreeSet<Int>)
{
    if(checkEmpty(treeSet)) return
    print("All Marks : ")
    for(value in treeSet) print("$value ")
}

fun searchMarks(treeSet: TreeSet<Int>)
{
    if(checkEmpty(treeSet)) return
    val input = inputMarks()
    if(treeSet.contains(input)) println("Marks $input found")
    else println("Marks $input not found")
}

fun nearesHigher(treeSet: TreeSet<Int>)
{
    if(checkEmpty(treeSet)) return
    val input = inputMarks()
    if(treeSet.contains(input))
    println("Nearist higher of $input : ${treeSet.higher(input) ?: "No higher marks available"}")
    else println("Marks $input is not available")
}

fun nearesLower(treeSet: TreeSet<Int>)
{
    if(checkEmpty(treeSet)) return
    val input = inputMarks()
    if(treeSet.contains(input))
    println("Nearist lower of $input : ${treeSet.lower(input) ?: "No lower marks available"}")
    else println("Marks $input is not available")
}

fun floorMarks(treeSet: TreeSet<Int>)
{
    if(checkEmpty(treeSet)) return
    val input = inputMarks()
    println("Floor marks of $input : ${treeSet.floor(input) ?: "No floor marks available"}")
}

fun ceilingMarks(treeSet: TreeSet<Int>)
{
    if(checkEmpty(treeSet)) return
    val input = inputMarks()
    println("Ceiling marks of $input : ${treeSet.ceiling(input) ?: "No ceiling marks available"}")
}

fun highestAndLowest(treeSet: TreeSet<Int>)
{
    if(checkEmpty(treeSet)) return
    val lowest = treeSet.first()
    val highest = treeSet.last()
    println("Highest Marks : $highest")
    println("Lowest Marks  : $lowest")
}


fun main()
{
    val studentMarks = TreeSet<Int>()
    println("\n===== Student Marks Management System =====\n")
    while(true)
    {
        println("\n1. Add a new mark.")
        println("2. Display all marks in ascending order.")
        println("3. Search for a mark.")
        println("4. Find the nearest lower mark of a given mark.")
        println("5. Find the nearest higher mark of a given mark.")
        println("6. Find the floor mark of a given mark.")
        println("7. Find the ceiling mark of a given mark.")
        println("8. Display the lowest and highest mark.")
        println("9. Exit the program")

        print("\nEnter your choice (1-9) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addNewMarks(studentMarks)
            2 -> displayMarks(studentMarks)
            3 -> searchMarks(studentMarks)
            4 -> nearesLower(studentMarks)
            5 -> nearesHigher(studentMarks)
            6 -> floorMarks(studentMarks)
            7 -> ceilingMarks(studentMarks)
            8 -> highestAndLowest(studentMarks)
            9 -> {
                println("Program Exit Successfully")
                break
            }

            else -> println("Invalid Choice! Please Enter 1-9")
        }
    }
}