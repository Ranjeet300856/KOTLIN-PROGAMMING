/*
    Problem Statement:
    Create a Kotlin program to develop a Unique Student Roll Number Manager using TreeSet Collection.
    The program should allow users to manage student roll numbers through a Menu Driven Program.

    Features:
    1. Add a new roll number.
    - Roll number must be greater than 0.
    - Duplicate roll numbers should not be added.

    2. Remove an existing roll number.
    3. Search for a roll number.
    4. Display all roll numbers in sorted order.
    5. Display the smallest and largest roll number.
    6. Display the total number of registered roll numbers.
    7. Exit the program.
*/

import java.util.TreeSet

fun input(): Int
{
    while(true)
    {
        print("Enter a roll number : ")
        val inputNumber = readln().trim().toIntOrNull()
        if(inputNumber == null || inputNumber <= 0)
        {
            println("Invalid Input! Try Again")
            continue
        }

        return inputNumber
    }
}

fun checkEmpty(treeSet: TreeSet<Int>): Boolean
{
    if(treeSet.isEmpty())
    {
        println("No roll numbers available")
        return true
    }
    else return false
}

fun addNewRollNumber(treeSet: TreeSet<Int>) 
{
    val rollNumber = input()
    if(!treeSet.add(rollNumber)) println("Duplicate roll number not allowed")
    else println("Roll number $rollNumber added successfully")
}

fun removeRollNumber(treeSet: TreeSet<Int>) 
{
    if(checkEmpty(treeSet)) return
    val rollNumber = input()
    if(treeSet.remove(rollNumber)) println("Roll Number $rollNumber removed successfully")
    else println("Roll number not found")
}

fun searchRollNumber(treeSet: TreeSet<Int>) 
{
    if(checkEmpty(treeSet)) return
    val rollNumber = input()
    if(treeSet.contains(rollNumber)) println("Roll Number $rollNumber found")
    else println("Roll number not found")
}

fun smallestAndHighest(treeSet: TreeSet<Int>) 
{
    if(checkEmpty(treeSet)) return
    println("Smallest roll number : ${treeSet.first()}")
    println("Largest roll number  : ${treeSet.last()}")
}

fun display(treeSet: TreeSet<Int>) 
{
    if(checkEmpty(treeSet)) return
    print("Roll Numbers : ")
    for(value in treeSet) print("$value ")
    println()
}
fun displaySize(treeSet: TreeSet<Int>) = println("Total number of registered roll numbers : ${treeSet.size}")

fun main()
{
    println("\n===== Student Roll Number Management System =====\n")
    val rollNumbers = TreeSet<Int>()
    while(true)
    {
        println("\n1. Add a new roll number.")
        println("2. Remove a roll number.")
        println("3. Search a roll number.")
        println("4. Display roll numbers.")
        println("5. Display the smallest and largest roll number.")
        println("6. Display the total number of registered roll numbers.")
        println("7. Exit the program.")

        print("\nEnter Choice (1-7) : ")
        val choice = readln().trim().toIntOrNull()
        if(choice == null)
        {
            println("Invalid Input! Try Again")
            continue
        }

        when(choice)
        {
            1 -> addNewRollNumber(rollNumbers)
            2 -> removeRollNumber(rollNumbers)
            3 -> searchRollNumber(rollNumbers)
            4 -> display(rollNumbers)
            5 -> smallestAndHighest(rollNumbers)
            6 -> displaySize(rollNumbers)
            7 -> {
                println("Program Exited")
                break
            }

            else -> println("Invalid Choice! Enter 1..7")
        }
    }
}